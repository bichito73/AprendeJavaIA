#!/usr/bin/env bash
set -euo pipefail

mkdir -p out outputs

# 1) Compilar todo el código fuente
find src -name "*.java" > sources.txt
javac -encoding UTF-8 -d out @sources.txt

# Prefijos a saltar (no tiene sentido ejecutar GUI en CI)
SKIP_PREFIXES=("U13_Graficos" "U16_Interfaces_graficas_avanzadas" "U19_JavaFX")

should_skip() {
  local fqcn="$1"
  for p in "${SKIP_PREFIXES[@]}"; do
    [[ "$fqcn" == ${p}.* ]] && return 0
  done
  return 1
}

# 2) Buscar clases con main y ejecutarlas
while IFS= read -r file; do
  pkg=$(grep -m1 "^package " "$file" | sed -E 's/package ([^;]+);/\1/')
  cls=$(basename "$file" .java)
  if [[ -n "$pkg" ]]; then
    fqcn="${pkg}.${cls}"
    outpath="outputs/${pkg}.${cls}.txt"
    inpath="inputs/${pkg}.${cls}.txt"
  else
    fqcn="${cls}"
    outpath="outputs/${cls}.txt"
    inpath="inputs/${cls}.txt"
  fi

  # ¿Tiene main?
  if grep -q "public[[:space:]]\+static[[:space:]]\+void[[:space:]]\+main" "$file"; then
    if should_skip "$fqcn"; then
      echo ">> Omitiendo (GUI) ${fqcn}"
      echo "Ejercicio GUI omitido en CI." > "${outpath}"
      continue
    fi
    echo ">> Ejecutando ${fqcn}"
    if [[ -f "${inpath}" ]]; then
      timeout 6s java -cp out "${fqcn}" < "${inpath}" > "${outpath}" 2>&1 || true
    else
      timeout 2s java -cp out "${fqcn}" > "${outpath}" 2>&1 || true
    fi
  fi
done < <(grep -rl --include="*.java" "public static void main" src)

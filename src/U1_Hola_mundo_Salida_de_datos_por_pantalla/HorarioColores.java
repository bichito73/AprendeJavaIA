package U1_Hola_mundo_Salida_de_datos_por_pantalla;
/**
 * Ejercicio 1.6 - Horario con colores
 * Enunciado: Modifica el programa anterior añadiendo colores.
 */
public class HorarioColores {
  public static void main(String[] args) {
    String r="\033[31m", v="\033[32m", a="\033[34m", reset="\033[0m";
    System.out.println("Lunes     " + v + "Programación" + reset + "  Sistemas      " + a + "Inglés" + reset);
    System.out.println("Martes    " + v + "Programación" + reset + "  BasesDatos    " + r + "FOL" + reset);
    System.out.println("Miércoles " + r + "Lenguaje" + reset + "      " + v + "Programación" + reset + "  Entornos");
    System.out.println("Jueves    BasesDatos    " + v + "Programación" + reset + "  " + a + "Inglés" + reset);
    System.out.println("Viernes   Sistemas      BasesDatos    Matemáticas");
  }
}

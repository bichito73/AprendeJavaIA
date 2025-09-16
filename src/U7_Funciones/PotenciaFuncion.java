package U7_Funciones;
/**
 * Ejercicio 7.2 - Potencia
 * Enunciado: Define una función potencia(base,exp) y pruébala.
 */
public class PotenciaFuncion {
  public static long potencia(long base, int exp){
    long res=1; for(int i=0;i<exp;i++) res*=base; return res;
  }
  public static void main(String[] args) {
    System.out.println(potencia(2,10));
  }
}

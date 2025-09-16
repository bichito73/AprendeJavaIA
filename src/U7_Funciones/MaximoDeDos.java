package U7_Funciones;
/**
 * Ejercicio 7.1 - Máximo de dos números
 * Enunciado: Define una función max(int,int) y pruébala.
 */
public class MaximoDeDos {
  public static int max(int a, int b){ return a>b? a:b; }
  public static void main(String[] args) {
    System.out.println(max(5,9));
  }
}

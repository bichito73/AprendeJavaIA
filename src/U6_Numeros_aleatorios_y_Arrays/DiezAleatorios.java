package U6_Numeros_aleatorios_y_Arrays;
/**
 * Ejercicio 6.1 - Diez números aleatorios
 * Enunciado: Genera 10 números aleatorios 0..100 y los muestra.
 */
public class DiezAleatorios {
  public static void main(String[] args) {
    for (int i=0; i<10; i++) {
      int n = (int)(Math.random()*101);
      System.out.print(n + (i<9? " ":""));
    }
    System.out.println();
  }
}

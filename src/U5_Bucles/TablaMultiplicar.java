package U5_Bucles;
/**
 * Ejercicio 5.4 - Tabla de multiplicar
 * Enunciado: Pide un número (1..10) y muestra su tabla de multiplicar.
 */
import java.util.Scanner;
public class TablaMultiplicar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Número (1..10): ");
    int n = sc.nextInt();
    for (int i=1; i<=10; i++) {
      System.out.printf("%d x %d = %d%n", n, i, n*i);
    }
  }
}

package U5_Bucles;
/**
 * Ejercicio 5.8 - Serie Fibonacci
 * Enunciado: Pide un número de términos y muestra la serie Fibonacci.
 */
import java.util.Scanner;
public class FibonacciTerminos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Términos: ");
    int n = sc.nextInt();
    long a=0, b=1;
    for (int i=1; i<=n; i++) {
      System.out.print(a + (i<n? " ":""));
      long c = a + b; a = b; b = c;
    }
    System.out.println();
  }
}

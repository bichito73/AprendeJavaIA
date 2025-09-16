package U5_Bucles;
/**
 * Ejercicio 5.7 - Factorial
 * Enunciado: Pide un entero n (0..20) y calcula n! con un bucle.
 */
import java.util.Scanner;
public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("n (0..20): ");
    int n = sc.nextInt();
    long f = 1;
    for (int i=2; i<=n; i++) f *= i;
    System.out.println(n + "! = " + f);
  }
}

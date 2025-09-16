package U5_Bucles;
/**
 * Ejercicio 5.6 - Suma de los N primeros números
 * Enunciado: Pide N y muestra la suma 1+2+...+N.
 */
import java.util.Scanner;
public class SumaPrimerosN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("N: ");
    int n = sc.nextInt();
    long suma = 0;
    for (int i=1; i<=n; i++) suma += i;
    System.out.println("Suma = " + suma);
  }
}

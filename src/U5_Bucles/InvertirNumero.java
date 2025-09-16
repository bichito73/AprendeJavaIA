package U5_Bucles;
/**
 * Ejercicio 5.10 - Invertir cifras
 * Enunciado: Pide un número entero y muestra sus cifras en orden inverso.
 */
import java.util.Scanner;
public class InvertirNumero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Número: ");
    long n = sc.nextLong();
    long inv = 0;
    while (n!=0) { inv = inv*10 + (n%10); n/=10; }
    System.out.println("Invertido: " + inv);
  }
}

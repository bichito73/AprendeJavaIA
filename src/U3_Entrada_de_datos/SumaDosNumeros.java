package U3_Entrada_de_datos;
/**
 * Ejercicio 3.2 - Suma interactiva
 * Enunciado: Pide dos números por teclado y muestra su suma.
 */
import java.util.Scanner;
public class SumaDosNumeros {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    double a = sc.nextDouble();
    System.out.print("Introduce otro número: ");
    double b = sc.nextDouble();
    System.out.println("Suma = " + (a + b));
  }
}

package U3_Entrada_de_datos;
/**
 * Ejercicio 3.6 - Media de tres números
 * Enunciado: Pide tres números y muestra su media.
 */
import java.util.Scanner;
public class MediaTresEntrada {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("n1: ");
    double a = sc.nextDouble();
    System.out.print("n2: ");
    double b = sc.nextDouble();
    System.out.print("n3: ");
    double c = sc.nextDouble();
    System.out.println("Media = " + (a + b + c) / 3.0);
  }
}

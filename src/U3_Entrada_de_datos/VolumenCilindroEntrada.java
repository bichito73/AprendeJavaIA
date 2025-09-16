package U3_Entrada_de_datos;
/**
 * Ejercicio 3.5 - Volumen de cilindro
 * Enunciado: Pide radio y altura y muestra el volumen (V = pi r^2 h).
 */
import java.util.Scanner;
public class VolumenCilindroEntrada {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Radio: ");
    double r = sc.nextDouble();
    System.out.print("Altura: ");
    double h = sc.nextDouble();
    double v = Math.PI * r * r * h;
    System.out.printf("Volumen = %.4f%n", v);
  }
}

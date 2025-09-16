package U3_Entrada_de_datos;
/**
 * Ejercicio 3.8 - Precio con IVA
 * Enunciado: Pide precio base e imprime base, IVA (21%) y total.
 */
import java.util.Scanner;
public class PrecioConIVAEntrada {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Base: ");
    double base = sc.nextDouble();
    double iva = base * 0.21;
    double total = base + iva;
    System.out.printf("Base: %.2f IVA: %.2f Total: %.2f%n", base, iva, total);
  }
}

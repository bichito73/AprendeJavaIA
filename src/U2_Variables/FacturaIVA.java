package U2_Variables;
/**
 * Ejercicio 2.7 - Total factura con IVA
 * Enunciado: Dado un precio base, calcula e imprime base, IVA (21%) y total.
 */
public class FacturaIVA {
  public static void main(String[] args) {
    double base = 100.0;
    double iva = base * 0.21;
    double total = base + iva;
    System.out.printf("Base: %.2f IVA: %.2f Total: %.2f%n", base, iva, total);
  }
}

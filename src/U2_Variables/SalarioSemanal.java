package U2_Variables;
/**
 * Ejercicio 2.8 - Salario semanal
 * Enunciado: Calcula salario semanal con horas=40 y precioHora=12 sin pedir datos.
 */
public class SalarioSemanal {
  public static void main(String[] args) {
    int horas = 40;
    double precioHora = 12.0;
    double salario = horas * precioHora;
    System.out.println("Salario semanal: " + salario + " €");
  }
}

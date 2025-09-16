package U2_Variables;
/**
 * Ejercicio 2.6 - Conversor pesetas→euros (sin pedir teclado)
 * Enunciado: Declara una cantidad en pesetas y muestra el equivalente en euros.
 */
public class PesetasAEuros {
  public static void main(String[] args) {
    int pesetas = 1000;
    double euros = pesetas / 166.386;
    System.out.printf("%d pesetas son %.2f euros%n", pesetas, euros);
  }
}

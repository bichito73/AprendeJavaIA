package U2_Variables;
/**
 * Ejercicio 2.5 - Conversor euros→pesetas (sin pedir teclado)
 * Enunciado: Declara una variable euros=6 y muestra el resultado en pesetas (166.386).
 */
public class EurosAPesetas {
  public static void main(String[] args) {
    double euros = 6.0;
    int pesetas = (int) Math.round(euros * 166.386);
    System.out.println(euros + " euros son " + pesetas + " pesetas");
  }
}
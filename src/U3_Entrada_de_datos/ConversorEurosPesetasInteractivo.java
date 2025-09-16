package U3_Entrada_de_datos;
/**
 * Ejercicio 3.3 - Conversor euros→pesetas (interactivo)
 * Enunciado: Pide euros por teclado y muestra el resultado en pesetas (166.386).
 */
import java.util.Scanner;
public class ConversorEurosPesetasInteractivo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Euros: ");
    double euros = sc.nextDouble();
    int pesetas = (int)Math.round(euros * 166.386);
    System.out.println(euros + " euros son " + pesetas + " pesetas.");
  }
}

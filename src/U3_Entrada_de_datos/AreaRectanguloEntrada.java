package U3_Entrada_de_datos;
/**
 * Ejercicio 3.4 - Área de rectángulo (interactivo)
 * Enunciado: Pide base y altura y muestra el área.
 */
import java.util.Scanner;
public class AreaRectanguloEntrada {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Base: ");
    double base = sc.nextDouble();
    System.out.print("Altura: ");
    double altura = sc.nextDouble();
    System.out.println("Área = " + (base * altura));
  }
}

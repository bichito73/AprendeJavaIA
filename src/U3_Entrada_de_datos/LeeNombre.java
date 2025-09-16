package U3_Entrada_de_datos;
/**
 * Ejercicio 3.1 - Leer nombre
 * Enunciado: Pide tu nombre por teclado y lo muestra por pantalla.
 */
import java.util.Scanner;
public class LeeNombre {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce tu nombre: ");
    String nombre = sc.nextLine();
    System.out.println("Hola, " + nombre + "!");
  }
}

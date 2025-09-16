package U3_Entrada_de_datos;
/**
 * Ejercicio 3.9 - Salario semanal interactivo
 * Enunciado: Pide horas y precio/hora y muestra el salario.
 */
import java.util.Scanner;
public class SalarioSemanalEntrada {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Horas: ");
    double horas = sc.nextDouble();
    System.out.print("Precio/hora: ");
    double precio = sc.nextDouble();
    System.out.println("Salario: " + (horas * precio) + " €");
  }
}

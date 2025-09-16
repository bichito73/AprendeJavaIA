package U3_Entrada_de_datos;
/**
 * Ejercicio 3.7 - Tiempo total en segundos
 * Enunciado: Pide horas, minutos y segundos y muestra el total en segundos.
 */
import java.util.Scanner;
public class TiempoEnSegundos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Horas: ");
    int h = sc.nextInt();
    System.out.print("Minutos: ");
    int m = sc.nextInt();
    System.out.print("Segundos: ");
    int s = sc.nextInt();
    int total = h*3600 + m*60 + s;
    System.out.println("Total segundos: " + total);
  }
}

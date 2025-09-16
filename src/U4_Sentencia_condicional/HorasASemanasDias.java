package U4_Sentencia_condicional;
/**
 * Ejercicio 4.10 - Horas a semanas y días
 * Enunciado: Pide un número de horas y lo expresa en semanas y días (entero).
 */
import java.util.Scanner;
public class HorasASemanasDias {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Horas totales: ");
    int horas = sc.nextInt();
    int semanas = horas / (24*7);
    int dias = (horas % (24*7)) / 24;
    System.out.println(semanas + " semanas y " + dias + " días");
  }
}

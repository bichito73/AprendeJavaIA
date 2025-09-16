package U4_Sentencia_condicional;
/**
 * Ejercicio 4.6 - Nómina con horas extra
 * Enunciado: Pide horas trabajadas y precio/hora. Las horas >40 se pagan al 1.5x.
 */
import java.util.Scanner;
public class NominaHorasExtra {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Horas: "); double h = sc.nextDouble();
    System.out.print("Precio/hora: "); double p = sc.nextDouble();
    double normal = Math.min(h, 40) * p;
    double extra = Math.max(0, h-40) * p * 1.5;
    System.out.println("Salario = " + (normal + extra) + " €");
  }
}

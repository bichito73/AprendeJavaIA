package U4_Sentencia_condicional;
/**
 * Ejercicio 4.1 - Par o impar
 * Enunciado: Pide un entero y dice si es par o impar.
 */
import java.util.Scanner;
public class ParImpar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Número: ");
    int n = sc.nextInt();
    if (n % 2 == 0) System.out.println("Par"); else System.out.println("Impar");
  }
}

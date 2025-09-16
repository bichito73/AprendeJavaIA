package U4_Sentencia_condicional;
/**
 * Ejercicio 4.8 - Mínimo de dos números
 * Enunciado: Pide dos números y muestra el menor.
 */
import java.util.Scanner;
public class MinimoDeDos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("a: "); double a = sc.nextDouble();
    System.out.print("b: "); double b = sc.nextDouble();
    System.out.println("Mínimo = " + (a<b? a:b));
  }
}

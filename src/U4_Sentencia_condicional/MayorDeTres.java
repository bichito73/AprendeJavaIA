package U4_Sentencia_condicional;
/**
 * Ejercicio 4.2 - Mayor de tres
 * Enunciado: Pide tres números y dice cuál es el mayor.
 */
import java.util.Scanner;
public class MayorDeTres {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("n1: "); double a = sc.nextDouble();
    System.out.print("n2: "); double b = sc.nextDouble();
    System.out.print("n3: "); double c = sc.nextDouble();
    double mayor = a;
    if (b > mayor) mayor = b;
    if (c > mayor) mayor = c;
    System.out.println("Mayor = " + mayor);
  }
}

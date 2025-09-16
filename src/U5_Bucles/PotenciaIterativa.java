package U5_Bucles;
/**
 * Ejercicio 5.5 - Potencia iterativa
 * Enunciado: Pide base y exponente entero >=0 y calcula base^exponente con un bucle.
 */
import java.util.Scanner;
public class PotenciaIterativa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Base: "); long base = sc.nextLong();
    System.out.print("Exponente (>=0): "); int exp = sc.nextInt();
    long res = 1;
    for (int i=0; i<exp; i++) res *= base;
    System.out.println("Resultado = " + res);
  }
}

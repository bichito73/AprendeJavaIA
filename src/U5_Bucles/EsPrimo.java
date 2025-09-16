package U5_Bucles;
/**
 * Ejercicio 5.9 - ¿Es primo?
 * Enunciado: Pide un número entero y dice si es primo.
 */
import java.util.Scanner;
public class EsPrimo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Número: ");
    int n = sc.nextInt();
    if (n<=1){ System.out.println("No es primo"); return; }
    boolean primo = true;
    for (int i=2; i*i<=n; i++) if (n%i==0){ primo=false; break; }
    System.out.println(primo? "Es primo":"No es primo");
  }
}

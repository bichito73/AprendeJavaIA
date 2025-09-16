package U6_Numeros_aleatorios_y_Arrays;
/**
 * Ejercicio 6.3 - Invertir 10 números
 * Enunciado: Lee 10 números por teclado y los muestra en orden inverso.
 */
import java.util.Scanner;
public class Leer10yInvertir {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[10];
    for (int i=0;i<10;i++){ System.out.print("n"+(i+1)+": "); a[i]=sc.nextInt(); }
    for (int i=9;i>=0;i--) System.out.print(a[i] + (i>0? " ":""));
    System.out.println();
  }
}

package U6_Numeros_aleatorios_y_Arrays;
/**
 * Ejercicio 6.5 - Buscar elemento en array
 * Enunciado: Rellena un array con 15 aleatorios 0..9 y pregunta un número para indicar sus posiciones.
 */
import java.util.Scanner;
public class BuscarElemento {
  public static void main(String[] args) {
    int[] a = new int[15];
    for (int i=0;i<a.length;i++) a[i]=(int)(Math.random()*10);
    Scanner sc = new Scanner(System.in);
    System.out.print("Buscar (0..9): ");
    int x = sc.nextInt();
    boolean found=false;
    for (int i=0;i<a.length;i++) {
      if (a[i]==x){ System.out.print(i + " "); found=true; }
    }
    System.out.println(found? "":"No aparece");
  }
}

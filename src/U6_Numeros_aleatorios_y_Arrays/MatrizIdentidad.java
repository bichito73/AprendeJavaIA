package U6_Numeros_aleatorios_y_Arrays;
/**
 * Ejercicio 6.10 - Matriz identidad
 * Enunciado: Pide n y muestra la matriz identidad n x n.
 */
import java.util.Scanner;
public class MatrizIdentidad {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("n: ");
    int n = sc.nextInt();
    int[][] m = new int[n][n];
    for (int i=0;i<n;i++){ m[i][i]=1; }
    for (int i=0;i<n;i++) System.out.println(java.util.Arrays.toString(m[i]));
  }
}

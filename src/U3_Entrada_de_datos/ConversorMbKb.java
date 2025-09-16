package U3_Entrada_de_datos;
/**
 * Ejercicio 3.10 - Conversor MB→KB
 * Enunciado: Pide MB por teclado y muestra KB (1 MB = 1024 KB).
 */
import java.util.Scanner;
public class ConversorMbKb {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("MB: ");
    int mb = sc.nextInt();
    int kb = mb * 1024;
    System.out.println(mb + " MB = " + kb + " KB");
  }
}

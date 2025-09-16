package U6_Numeros_aleatorios_y_Arrays;
/**
 * Ejercicio 6.7 - Palabras largas
 * Enunciado: Pide 8 palabras y cuenta cuántas tienen longitud >=5.
 */
import java.util.Scanner;
public class PalabrasLargas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] w = new String[8];
    int cont=0;
    for (int i=0;i<w.length;i++){ System.out.print("Palabra "+(i+1)+": "); w[i]=sc.next(); if (w[i].length()>=5) cont++; }
    System.out.println("Con longitud >=5: " + cont);
  }
}

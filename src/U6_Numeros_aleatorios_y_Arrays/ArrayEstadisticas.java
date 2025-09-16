package U6_Numeros_aleatorios_y_Arrays;
/**
 * Ejercicio 6.2 - Estadísticas básicas
 * Enunciado: Rellena un array con 20 números aleatorios 0..100 y calcula min, max y media.
 */
public class ArrayEstadisticas {
  public static void main(String[] args) {
    int[] a = new int[20];
    int min=101, max=-1, suma=0;
    for (int i=0; i<a.length; i++) {
      a[i] = (int)(Math.random()*101);
      if (a[i]<min) min=a[i];
      if (a[i]>max) max=a[i];
      suma += a[i];
    }
    System.out.println("Min=" + min + " Max=" + max + " Media=" + (suma/(double)a.length));
  }
}

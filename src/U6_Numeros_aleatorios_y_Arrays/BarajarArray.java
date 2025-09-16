package U6_Numeros_aleatorios_y_Arrays;
/**
 * Ejercicio 6.4 - Barajar array
 * Enunciado: Crea un array con 1..20 y lo baraja al azar (Fisher-Yates).
 */
public class BarajarArray {
  public static void main(String[] args) {
    int[] a = new int[20];
    for (int i=0; i<20; i++) a[i]=i+1;
    for (int i=a.length-1; i>0; i--) {
      int j = (int)(Math.random()*(i+1));
      int t=a[i]; a[i]=a[j]; a[j]=t;
    }
    for (int i=0;i<a.length;i++) System.out.print(a[i] + (i<a.length-1? " ":""));
    System.out.println();
  }
}

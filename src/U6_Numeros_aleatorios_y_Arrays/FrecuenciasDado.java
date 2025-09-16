package U6_Numeros_aleatorios_y_Arrays;
/**
 * Ejercicio 6.8 - Frecuencias de un dado
 * Enunciado: Lanza un dado 6000 veces y muestra la frecuencia de cada cara.
 */
public class FrecuenciasDado {
  public static void main(String[] args) {
    int[] f = new int[6];
    for (int i=0;i<6000;i++) f[(int)(Math.random()*6)]++;
    for (int i=0;i<6;i++) System.out.println((i+1)+": " + f[i]);
  }
}

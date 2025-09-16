package U6_Numeros_aleatorios_y_Arrays;
/**
 * Ejercicio 6.9 - Cartón de bingo
 * Enunciado: Genera un cartón de bingo 3x5 con números no repetidos entre 1..90.
 */
public class CartonBingo {
  public static void main(String[] args) {
    int[] pool = new int[90];
    for (int i=0;i<90;i++) pool[i]=i+1;
    // barajar parcialmente 15 primeros
    for (int i=0;i<15;i++){
      int j = (int)(Math.random()*90);
      int t=pool[i]; pool[i]=pool[j]; pool[j]=t;
    }
    int[][] c = new int[3][5];
    int k=0;
    for (int i=0;i<3;i++) for (int j=0;j<5;j++) c[i][j]=pool[k++];
    for (int i=0;i<3;i++) System.out.println(java.util.Arrays.toString(c[i]));
  }
}

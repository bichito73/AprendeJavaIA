package U6_Numeros_aleatorios_y_Arrays;
/**
 * Ejercicio 6.6 - Matriz 4x5 con sumas
 * Enunciado: Genera una matriz 4x5 con aleatorios 0..9 y calcula la suma por filas y columnas.
 */
public class MatrizSumaFilasColumnas {
  public static void main(String[] args) {
    int[][] m = new int[4][5];
    int[] col = new int[5];
    int total=0;
    for (int i=0;i<4;i++){
      int fila=0;
      for (int j=0;j<5;j++){
        m[i][j]=(int)(Math.random()*10);
        fila+=m[i][j]; col[j]+=m[i][j];
      }
      total+=fila;
      System.out.println(java.util.Arrays.toString(m[i]) + " = " + fila);
    }
    System.out.println(java.util.Arrays.toString(col) + " => " + total);
  }
}

package U12_Excepciones;
/**
 * Ejercicio 12.4 - Array fuera de rango
 * Enunciado: Controla ArrayIndexOutOfBoundsException.
 */
public class ArrayFueraDeRango {
  public static void main(String[] args){
    int[] a={1,2,3};
    try{System.out.println(a[5]);}
    catch(ArrayIndexOutOfBoundsException e){System.out.println("Índice inválido");}
  }
}

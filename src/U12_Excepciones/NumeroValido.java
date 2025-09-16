package U12_Excepciones;
/**
 * Ejercicio 12.2 - Número válido
 * Enunciado: Pide un número y controla InputMismatchException.
 */
import java.util.*;
public class NumeroValido {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    try{
      System.out.print("Número: ");
      int n=sc.nextInt();
      System.out.println("Correcto: "+n);
    }catch(InputMismatchException e){
      System.out.println("Error: entrada no válida");
    }
  }
}

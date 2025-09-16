package U12_Excepciones;
/**
 * Ejercicio 12.1 - División con excepción
 * Enunciado: Controla la división por cero con try-catch.
 */
import java.util.*;
public class DivisionConExcepcion {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    try{
      System.out.print("a: "); int a=sc.nextInt();
      System.out.print("b: "); int b=sc.nextInt();
      System.out.println("a/b="+(a/b));
    }catch(ArithmeticException e){
      System.out.println("Error: división por cero");
    }
  }
}

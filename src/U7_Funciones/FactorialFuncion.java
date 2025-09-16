package U7_Funciones;
/**
 * Ejercicio 7.4 - Factorial
 * Enunciado: Define una función factorial(n).
 */
public class FactorialFuncion {
  public static long factorial(int n){
    long f=1; for(int i=2;i<=n;i++) f*=i; return f;
  }
  public static void main(String[] args) {
    System.out.println(factorial(5));
  }
}

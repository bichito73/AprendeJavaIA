package U7_Funciones;
/**
 * Ejercicio 7.3 - Función esPrimo
 * Enunciado: Define una función que compruebe si un número es primo.
 */
public class PrimoFuncion {
  public static boolean esPrimo(int n){
    if (n<=1) return false;
    for(int i=2;i*i<=n;i++) if(n%i==0) return false;
    return true;
  }
  public static void main(String[] args) {
    System.out.println(esPrimo(7));
  }
}

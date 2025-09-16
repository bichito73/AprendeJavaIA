package U4_Sentencia_condicional;
/**
 * Ejercicio 4.5 - Calculadora básica (switch)
 * Enunciado: Pide dos números y una operación (+,-,*,/) y muestra el resultado.
 */
import java.util.Scanner;
public class CalculadoraBasica {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("a: "); double a = sc.nextDouble();
    System.out.print("b: "); double b = sc.nextDouble();
    System.out.print("Operación (+,-,*,/): ");
    char op = sc.next().charAt(0);
    switch(op){
      case '+': System.out.println(a+b); break;
      case '-': System.out.println(a-b); break;
      case '*': System.out.println(a*b); break;
      case '/': System.out.println(b!=0? a/b : "No se puede dividir por cero"); break;
      default: System.out.println("Operación inválida");
    }
  }
}

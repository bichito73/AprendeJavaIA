package U4_Sentencia_condicional;
/**
 * Ejercicio 4.3 - Ordena tres números
 * Enunciado: Pide tres números y los muestra de menor a mayor.
 */
import java.util.Scanner;
public class OrdenaTres {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce tres números separados por espacios: ");
    double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
    double x=a, y=b, z=c;
    if (x>y){double t=x; x=y; y=t;}
    if (y>z){double t=y; y=z; z=t;}
    if (x>y){double t=x; x=y; y=t;}
    System.out.println(x + " " + y + " " + z);
  }
}

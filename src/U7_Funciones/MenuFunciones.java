package U7_Funciones;
/**
 * Ejercicio 7.7 - Menú de funciones
 * Enunciado: Ofrece un menú con varias funciones: max, factorial, primo.
 */
import java.util.Scanner;
public class MenuFunciones {
  public static int max(int a,int b){return a>b?a:b;}
  public static long factorial(int n){long f=1;for(int i=2;i<=n;i++)f*=i;return f;}
  public static boolean esPrimo(int n){if(n<=1)return false;for(int i=2;i*i<=n;i++)if(n%i==0)return false;return true;}
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("1) Máximo 2) Factorial 3) Primo");
    int op=sc.nextInt();
    if(op==1){System.out.print("a: ");int a=sc.nextInt();System.out.print("b: ");int b=sc.nextInt();System.out.println(max(a,b));}
    else if(op==2){System.out.print("n: ");int n=sc.nextInt();System.out.println(factorial(n));}
    else if(op==3){System.out.print("n: ");int n=sc.nextInt();System.out.println(esPrimo(n));}
  }
}

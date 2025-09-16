package U4_Sentencia_condicional;
/**
 * Ejercicio 4.9 - Nota a texto
 * Enunciado: Pide una nota (0-10) y muestra: SS (<5), AP (5-6), NT (7-8), SB (9-10).
 */
import java.util.Scanner;
public class NotaALetra {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nota (0-10): ");
    double n = sc.nextDouble();
    String r;
    if (n<0 || n>10) r="Nota inválida";
    else if (n<5) r="SS";
    else if (n<7) r="AP";
    else if (n<9) r="NT";
    else r="SB";
    System.out.println(r);
  }
}

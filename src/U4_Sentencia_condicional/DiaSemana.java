package U4_Sentencia_condicional;
/**
 * Ejercicio 4.4 - Día de la semana
 * Enunciado: Pide un número (1-7) y dice el nombre del día (1=Lunes).
 */
import java.util.Scanner;
public class DiaSemana {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Número de día (1-7): ");
    int d = sc.nextInt();
    String nombre;
    if (d==1) nombre="Lunes";
    else if (d==2) nombre="Martes";
    else if (d==3) nombre="Miércoles";
    else if (d==4) nombre="Jueves";
    else if (d==5) nombre="Viernes";
    else if (d==6) nombre="Sábado";
    else if (d==7) nombre="Domingo";
    else nombre="Valor inválido";
    System.out.println(nombre);
  }
}

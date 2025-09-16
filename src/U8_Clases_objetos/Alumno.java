package U8_Clases_objetos;
/**
 * Ejercicio 8.4 - Clase Alumno
 * Enunciado: Clase Alumno con nombre y nota media.
 */
public class Alumno {
  String nombre;
  double nota;
  public Alumno(String n,double nt){nombre=n;nota=nt;}
  public void mostrar(){System.out.println(nombre+" tiene nota "+nota);}
}

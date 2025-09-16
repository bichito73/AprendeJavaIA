package U9_POO_avanzada;
/**
 * Ejercicio 9.3 - Empleado y Gerente
 * Enunciado: Clase Empleado con nombre y salario base.
 */
public class Empleado {
  String nombre;
  double salario;
  public Empleado(String n,double s){nombre=n;salario=s;}
  public void mostrar(){System.out.println(nombre+" cobra "+salario);}
}

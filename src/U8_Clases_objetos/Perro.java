package U8_Clases_objetos;
/**
 * Ejercicio 8.1 - Clase Perro
 * Enunciado: Define la clase Perro con nombre y raza, y un método ladrar().
 */
public class Perro {
  String nombre;
  String raza;
  public Perro(String n,String r){nombre=n;raza=r;}
  public void ladrar(){System.out.println(nombre+" dice: guau!");}
}

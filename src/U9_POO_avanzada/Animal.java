package U9_POO_avanzada;
/**
 * Ejercicio 9.1 - Clase abstracta Animal
 * Enunciado: Define una clase abstracta Animal con método sonido().
 */
public abstract class Animal {
  String nombre;
  public Animal(String n){nombre=n;}
  public abstract void sonido();
}

package U7_Funciones;
/**
 * Ejercicio 7.6 - Conversión de temperatura
 * Enunciado: Funciones Celsius→Fahrenheit y Fahrenheit→Celsius.
 */
public class ConversionTemperatura {
  public static double c2f(double c){ return 32+c*9/5; }
  public static double f2c(double f){ return (f-32)*5/9; }
  public static void main(String[] args) {
    System.out.println(c2f(0));
    System.out.println(f2c(32));
  }
}

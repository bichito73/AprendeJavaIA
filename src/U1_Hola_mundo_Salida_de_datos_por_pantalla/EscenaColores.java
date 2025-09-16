package U1_Hola_mundo_Salida_de_datos_por_pantalla;
/**
 * Ejercicio 1.11 - Escena con colores
 * Enunciado: Mejora la escena anterior añadiendo colores.
 */
public class EscenaColores {
  public static void main(String[] args) {
    String verde="\033[32m", marron="\033[33m", reset="\033[0m";
    System.out.println(verde + "   @@@");
    System.out.println("  @   @");
    System.out.println(" @     @");
    System.out.println("@       @" + reset);
    System.out.println(marron + "   |||");
    System.out.println("   |||");
    System.out.println("   |||" + reset);
  }
}

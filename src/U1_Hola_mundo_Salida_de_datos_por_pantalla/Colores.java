package U1_Hola_mundo_Salida_de_datos_por_pantalla;
/**
 * Ejercicio 1.2 - Coloreado de texto
 * Enunciado: Muestra varias palabras en el color que corresponde.
 * Nota: Usa secuencias ANSI; en Windows puede requerir configuración.
 */
public class Colores {
  public static void main(String[] args) {
    System.out.print("\033[33m mandarina");
    System.out.print("\033[32m hierba");
    System.out.print("\033[31m tomate");
    System.out.print("\033[37m sábanas");
    System.out.print("\033[36m cielo");
    System.out.print("\033[35m nazareno");
    System.out.print("\033[34m mar");
    System.out.println("\033[0m"); // reset
  }
}

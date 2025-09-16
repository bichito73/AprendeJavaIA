package U2_Variables;
/**
 * Ejercicio 2.9 - Volumen de un cono
 * Enunciado: Con r=3 y h=7 muestra el volumen (V = 1/3 * pi * r^2 * h).
 */
public class VolumenCono {
  public static void main(String[] args) {
    double r = 3.0, h = 7.0;
    double v = (Math.PI * r * r * h) / 3.0;
    System.out.printf("Volumen del cono: %.4f%n", v);
  }
}

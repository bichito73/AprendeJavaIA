package U7_Funciones;
/**
 * Ejercicio 7.5 - Volumen de esfera
 * Enunciado: Función volumenEsfera(radio).
 */
public class VolumenEsfera {
  public static double volumenEsfera(double r){
    return 4.0/3.0 * Math.PI * r*r*r;
  }
  public static void main(String[] args) {
    System.out.printf("V=%.2f%n", volumenEsfera(3));
  }
}

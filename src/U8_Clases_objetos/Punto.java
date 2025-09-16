package U8_Clases_objetos;
/**
 * Ejercicio 8.5 - Clase Punto
 * Enunciado: Clase Punto con coordenadas x,y y método distancia.
 */
public class Punto {
  double x,y;
  public Punto(double a,double b){x=a;y=b;}
  public double distancia(Punto otro){
    double dx=x-otro.x, dy=y-otro.y;
    return Math.sqrt(dx*dx+dy*dy);
  }
}

package U8_Clases_objetos;
/**
 * Ejercicio 8.2 - Clase Coche
 * Enunciado: Define la clase Coche con marca, modelo y velocidad.
 */
public class Coche {
  String marca;
  String modelo;
  int velocidad;
  public Coche(String m,String mod){marca=m;modelo=mod;velocidad=0;}
  public void acelerar(int v){velocidad+=v;}
  public void frenar(int v){velocidad=Math.max(0,velocidad-v);}
  public void mostrar(){System.out.println(marca+" "+modelo+" va a "+velocidad+" km/h");}
}

package U11_Colecciones;
/**
 * Ejercicio 11.5 - Frecuencia de palabras
 * Enunciado: Cuenta las apariciones de palabras en una frase.
 */
import java.util.*;
public class FrecuenciaPalabras {
  public static void main(String[] args){
    String texto="uno dos dos tres tres tres";
    HashMap<String,Integer> freq=new HashMap<>();
    for(String p: texto.split(" ")){
      freq.put(p,freq.getOrDefault(p,0)+1);
    }
    System.out.println(freq);
  }
}

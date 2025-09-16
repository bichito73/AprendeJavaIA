package U11_Colecciones;
/**
 * Ejercicio 11.3 - Conjunto de palabras
 * Enunciado: Usa HashSet para almacenar palabras sin duplicados.
 */
import java.util.*;
public class ConjuntoPalabras {
  public static void main(String[] args){
    HashSet<String> set=new HashSet<>();
    set.add("casa"); set.add("coche"); set.add("casa");
    System.out.println(set);
  }
}

package U11_Colecciones;
/**
 * Ejercicio 11.4 - Diccionario con HashMap
 * Enunciado: Crea un diccionario inglés-español con HashMap.
 */
import java.util.*;
public class DiccionarioMap {
  public static void main(String[] args){
    HashMap<String,String> dic=new HashMap<>();
    dic.put("computer","ordenador");
    dic.put("book","libro");
    dic.put("green","verde");
    System.out.println(dic);
    System.out.println("computer="+dic.get("computer"));
  }
}

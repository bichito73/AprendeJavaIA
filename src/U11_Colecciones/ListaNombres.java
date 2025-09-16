package U11_Colecciones;
/**
 * Ejercicio 11.1 - Lista de nombres
 * Enunciado: Usa un ArrayList para almacenar y mostrar varios nombres.
 */
import java.util.*;
public class ListaNombres {
  public static void main(String[] args){
    ArrayList<String> lista=new ArrayList<>();
    lista.add("Ana"); lista.add("Luis"); lista.add("Marta");
    for(String n: lista) System.out.println(n);
  }
}

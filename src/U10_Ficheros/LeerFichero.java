package U10_Ficheros;
/**
 * Ejercicio 10.2 - Leer fichero
 * Enunciado: Lee un fichero línea a línea y lo muestra.
 */
import java.io.*;
public class LeerFichero {
  public static void main(String[] args){
    try(BufferedReader br=new BufferedReader(new FileReader("salida.txt"))){
      String linea;
      while((linea=br.readLine())!=null) System.out.println(linea);
    }catch(IOException e){System.out.println("Error: "+e.getMessage());}
  }
}

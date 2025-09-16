package U10_Ficheros;
/**
 * Ejercicio 10.4 - Contar líneas
 * Enunciado: Cuenta el número de líneas de un fichero de texto.
 */
import java.io.*;
public class ContarLineas {
  public static void main(String[] args){
    int cont=0;
    try(BufferedReader br=new BufferedReader(new FileReader("salida.txt"))){
      while(br.readLine()!=null) cont++;
      System.out.println("Líneas: "+cont);
    }catch(IOException e){System.out.println("Error: "+e.getMessage());}
  }
}

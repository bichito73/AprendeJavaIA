package U10_Ficheros;
/**
 * Ejercicio 10.3 - Copiar fichero
 * Enunciado: Copia el contenido de un fichero en otro.
 */
import java.io.*;
public class CopiarFichero {
  public static void main(String[] args){
    try(BufferedReader br=new BufferedReader(new FileReader("salida.txt"));
        PrintWriter pw=new PrintWriter(new FileWriter("copia.txt"))){
      String linea;
      while((linea=br.readLine())!=null) pw.println(linea);
    }catch(IOException e){System.out.println("Error: "+e.getMessage());}
  }
}

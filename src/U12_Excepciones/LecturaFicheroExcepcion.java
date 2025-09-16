package U12_Excepciones;
/**
 * Ejercicio 12.3 - Lectura con excepciones
 * Enunciado: Abre un fichero y controla IOException.
 */
import java.io.*;
public class LecturaFicheroExcepcion {
  public static void main(String[] args){
    BufferedReader br=null;
    try{
      br=new BufferedReader(new FileReader("salida.txt"));
      String linea;
      while((linea=br.readLine())!=null) System.out.println(linea);
    }catch(IOException e){System.out.println("Error: "+e.getMessage());}
    finally{try{if(br!=null)br.close();}catch(IOException e){}}
  }
}

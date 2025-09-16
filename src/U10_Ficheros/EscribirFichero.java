package U10_Ficheros;
/**
 * Ejercicio 10.1 - Escribir en fichero
 * Enunciado: Escribe varias líneas en un fichero de texto.
 */
import java.io.*;
public class EscribirFichero {
  public static void main(String[] args){
    try(PrintWriter pw=new PrintWriter(new FileWriter("salida.txt"))){
      pw.println("Primera línea");
      pw.println("Segunda línea");
    }catch(IOException e){System.out.println("Error: "+e.getMessage());}
  }
}

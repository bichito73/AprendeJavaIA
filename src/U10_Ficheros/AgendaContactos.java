package U10_Ficheros;
/**
 * Ejercicio 10.5 - Agenda de contactos
 * Enunciado: Guarda y muestra contactos en un fichero de texto.
 */
import java.io.*;
import java.util.*;
public class AgendaContactos {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    try(PrintWriter pw=new PrintWriter(new FileWriter("agenda.txt",true))){
      System.out.print("Nombre: "); String n=sc.nextLine();
      System.out.print("Teléfono: "); String t=sc.nextLine();
      pw.println(n+":"+t);
    }catch(IOException e){System.out.println("Error: "+e.getMessage());}
    System.out.println("Contactos:");
    try(BufferedReader br=new BufferedReader(new FileReader("agenda.txt"))){
      String linea;
      while((linea=br.readLine())!=null) System.out.println(linea);
    }catch(IOException e){System.out.println("Error: "+e.getMessage());}
  }
}

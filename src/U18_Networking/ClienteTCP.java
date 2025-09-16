package U18_Networking;
/**
 * Ejercicio 18.2 - Cliente TCP
 * Enunciado: Cliente TCP que se conecta al puerto 5000.
 */
import java.net.*; import java.io.*;
public class ClienteTCP {
  public static void main(String[] args)throws IOException{
    Socket s=new Socket("localhost",5000);
    BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
    PrintWriter out=new PrintWriter(s.getOutputStream(),true);
    System.out.println("Servidor: "+in.readLine());
    out.println("Hola servidor");
    s.close();
  }
}

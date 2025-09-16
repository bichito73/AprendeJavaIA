package U18_Networking;
/**
 * Ejercicio 18.1 - Servidor TCP
 * Enunciado: Servidor TCP que escucha en el puerto 5000.
 */
import java.net.*; import java.io.*;
public class ServidorTCP {
  public static void main(String[] args)throws IOException{
    ServerSocket ss=new ServerSocket(5000);
    System.out.println("Servidor escuchando en 5000...");
    Socket s=ss.accept();
    BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
    PrintWriter out=new PrintWriter(s.getOutputStream(),true);
    out.println("Bienvenido cliente");
    String linea=in.readLine();
    System.out.println("Cliente: "+linea);
    s.close(); ss.close();
  }
}

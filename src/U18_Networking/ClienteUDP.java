package U18_Networking;
/**
 * Ejercicio 18.4 - Cliente UDP
 * Enunciado: Envía un datagrama al puerto 6000.
 */
import java.net.*;
public class ClienteUDP {
  public static void main(String[] args)throws Exception{
    DatagramSocket ds=new DatagramSocket();
    byte[] buf="Hola UDP".getBytes();
    InetAddress dir=InetAddress.getByName("localhost");
    DatagramPacket p=new DatagramPacket(buf,buf.length,dir,6000);
    ds.send(p);
    ds.close();
  }
}

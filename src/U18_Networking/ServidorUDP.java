package U18_Networking;
/**
 * Ejercicio 18.3 - Servidor UDP
 * Enunciado: Recibe datagramas en el puerto 6000.
 */
import java.net.*;
public class ServidorUDP {
  public static void main(String[] args)throws Exception{
    DatagramSocket ds=new DatagramSocket(6000);
    byte[] buf=new byte[256];
    DatagramPacket p=new DatagramPacket(buf,buf.length);
    ds.receive(p);
    String msg=new String(p.getData(),0,p.getLength());
    System.out.println("Recibido: "+msg);
    ds.close();
  }
}

package U18_Networking;
/**
 * Ejercicio 18.5 - Descargar página
 * Enunciado: Descarga y muestra el HTML de una página web.
 */
import java.net.*; import java.io.*;
public class DescargarPagina {
  public static void main(String[] args)throws Exception{
    URL url=new URL("http://example.com");
    BufferedReader in=new BufferedReader(new InputStreamReader(url.openStream()));
    String linea;
    while((linea=in.readLine())!=null) System.out.println(linea);
    in.close();
  }
}

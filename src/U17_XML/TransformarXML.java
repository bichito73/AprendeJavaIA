package U17_XML;
/**
 * Ejercicio 17.4 - Transformar XML
 * Enunciado: Usa XSLT para transformar un XML.
 */
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import java.io.*;
public class TransformarXML {
  public static void main(String[] args) throws Exception {
    TransformerFactory tf=TransformerFactory.newInstance();
    Transformer t=tf.newTransformer(new StreamSource(new File("plantilla.xsl")));
    t.transform(new StreamSource(new File("personas.xml")), new StreamResult(new File("salida.html")));
    System.out.println("Transformación realizada.");
  }
}

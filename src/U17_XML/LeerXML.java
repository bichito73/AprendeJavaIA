package U17_XML;
/**
 * Ejercicio 17.2 - Leer XML
 * Enunciado: Lee un archivo XML usando DOM y muestra los elementos.
 */
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
public class LeerXML {
  public static void main(String[] args) throws Exception {
    DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
    DocumentBuilder db=dbf.newDocumentBuilder();
    Document doc=db.parse(new File("personas.xml"));
    NodeList lista=doc.getElementsByTagName("persona");
    for(int i=0;i<lista.getLength();i++){
      Element e=(Element)lista.item(i);
      System.out.println("id="+e.getAttribute("id")+" nombre="+e.getElementsByTagName("nombre").item(0).getTextContent());
    }
  }
}

package U17_XML;
/**
 * Ejercicio 17.3 - Modificar XML
 * Enunciado: Añade un nodo al XML existente.
 */
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
import java.io.*;
public class ModificarXML {
  public static void main(String[] args) throws Exception {
    File f=new File("personas.xml");
    DocumentBuilder db=DocumentBuilderFactory.newInstance().newDocumentBuilder();
    Document doc=db.parse(f);
    Element root=doc.getDocumentElement();
    Element p=doc.createElement("persona");
    p.setAttribute("id","2");
    p.appendChild(doc.createElement("nombre")).setTextContent("Luis");
    root.appendChild(p);
    Transformer t=TransformerFactory.newInstance().newTransformer();
    t.transform(new DOMSource(doc), new StreamResult(f));
    System.out.println("XML modificado.");
  }
}

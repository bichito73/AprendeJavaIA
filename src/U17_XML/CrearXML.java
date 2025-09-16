package U17_XML;
/**
 * Ejercicio 17.1 - Crear XML
 * Enunciado: Genera un archivo XML simple usando DOM.
 */
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
import java.io.*;
public class CrearXML {
  public static void main(String[] args) throws Exception {
    DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
    DocumentBuilder db=dbf.newDocumentBuilder();
    Document doc=db.newDocument();
    Element root=doc.createElement("personas");
    doc.appendChild(root);
    Element p=doc.createElement("persona");
    p.setAttribute("id","1");
    p.appendChild(doc.createElement("nombre")).setTextContent("Ana");
    root.appendChild(p);
    Transformer t=TransformerFactory.newInstance().newTransformer();
    t.transform(new DOMSource(doc), new StreamResult(new File("personas.xml")));
    System.out.println("XML creado.");
  }
}

package U17_XML;
/**
 * Ejercicio 17.5 - Validar XML
 * Enunciado: Valida un XML contra un XSD.
 */
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.*;
import java.io.*;
public class ValidarXML {
  public static void main(String[] args) throws Exception {
    SchemaFactory sf=SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
    Schema schema=sf.newSchema(new File("personas.xsd"));
    Validator v=schema.newValidator();
    v.validate(new StreamSource(new File("personas.xml")));
    System.out.println("XML válido.");
  }
}

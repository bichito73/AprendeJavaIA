package U12_Excepciones;
/**
 * Ejercicio 12.5 - Excepción propia
 * Enunciado: Define y lanza una excepción personalizada.
 */
class MiExcepcion extends Exception{
  public MiExcepcion(String msg){super(msg);}
}
public class ExcepcionPropia {
  public static void main(String[] args){
    try{ lanzar(); }
    catch(MiExcepcion e){System.out.println("Capturada: "+e.getMessage());}
  }
  static void lanzar() throws MiExcepcion{
    throw new MiExcepcion("Error personalizado");
  }
}

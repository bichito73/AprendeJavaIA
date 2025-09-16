package U15_Bases_de_datos;
/**
 * Ejercicio 15.6 - Eliminar datos
 * Enunciado: Elimina un registro de la tabla usuarios.
 */
import java.sql.*;
public class EliminarDatos {
  public static void main(String[] args){
    try(Connection conn=DriverManager.getConnection("jdbc:sqlite:ejemplo.db")){
      PreparedStatement ps=conn.prepareStatement("DELETE FROM usuarios WHERE id=?");
      ps.setInt(1,1);
      ps.executeUpdate();
      System.out.println("Dato eliminado.");
    }catch(SQLException e){System.out.println("Error: "+e.getMessage());}
  }
}

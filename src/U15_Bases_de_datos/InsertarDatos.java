package U15_Bases_de_datos;
/**
 * Ejercicio 15.3 - Insertar datos
 * Enunciado: Inserta un registro en la tabla usuarios.
 */
import java.sql.*;
public class InsertarDatos {
  public static void main(String[] args){
    try(Connection conn=DriverManager.getConnection("jdbc:sqlite:ejemplo.db")){
      PreparedStatement ps=conn.prepareStatement("INSERT INTO usuarios(nombre) VALUES(?)");
      ps.setString(1,"Ana");
      ps.executeUpdate();
      System.out.println("Dato insertado.");
    }catch(SQLException e){System.out.println("Error: "+e.getMessage());}
  }
}

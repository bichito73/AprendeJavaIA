package U15_Bases_de_datos;
/**
 * Ejercicio 15.5 - Actualizar datos
 * Enunciado: Actualiza un registro en la tabla usuarios.
 */
import java.sql.*;
public class ActualizarDatos {
  public static void main(String[] args){
    try(Connection conn=DriverManager.getConnection("jdbc:sqlite:ejemplo.db")){
      PreparedStatement ps=conn.prepareStatement("UPDATE usuarios SET nombre=? WHERE id=?");
      ps.setString(1,"Luis"); ps.setInt(2,1);
      ps.executeUpdate();
      System.out.println("Dato actualizado.");
    }catch(SQLException e){System.out.println("Error: "+e.getMessage());}
  }
}

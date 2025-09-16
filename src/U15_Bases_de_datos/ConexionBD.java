package U15_Bases_de_datos;
/**
 * Ejercicio 15.1 - Conexión a BD
 * Enunciado: Abre conexión con una base de datos SQLite.
 */
import java.sql.*;
public class ConexionBD {
  public static void main(String[] args){
    try(Connection conn=DriverManager.getConnection("jdbc:sqlite:ejemplo.db")){
      System.out.println("Conexión establecida.");
    }catch(SQLException e){System.out.println("Error: "+e.getMessage());}
  }
}

package U15_Bases_de_datos;
/**
 * Ejercicio 15.2 - Crear tabla
 * Enunciado: Crea una tabla en la BD.
 */
import java.sql.*;
public class CrearTabla {
  public static void main(String[] args){
    try(Connection conn=DriverManager.getConnection("jdbc:sqlite:ejemplo.db")){
      Statement st=conn.createStatement();
      st.execute("CREATE TABLE IF NOT EXISTS usuarios(id INTEGER PRIMARY KEY, nombre TEXT)");
      System.out.println("Tabla creada.");
    }catch(SQLException e){System.out.println("Error: "+e.getMessage());}
  }
}

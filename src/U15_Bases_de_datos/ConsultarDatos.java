package U15_Bases_de_datos;
/**
 * Ejercicio 15.4 - Consultar datos
 * Enunciado: Muestra todos los registros de la tabla usuarios.
 */
import java.sql.*;
public class ConsultarDatos {
  public static void main(String[] args){
    try(Connection conn=DriverManager.getConnection("jdbc:sqlite:ejemplo.db")){
      Statement st=conn.createStatement();
      ResultSet rs=st.executeQuery("SELECT * FROM usuarios");
      while(rs.next()) System.out.println(rs.getInt("id")+" "+rs.getString("nombre"));
    }catch(SQLException e){System.out.println("Error: "+e.getMessage());}
  }
}

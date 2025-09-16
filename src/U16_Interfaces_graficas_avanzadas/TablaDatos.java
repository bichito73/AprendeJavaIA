package U16_Interfaces_graficas_avanzadas;
/**
 * Ejercicio 16.4 - Tabla de datos
 * Enunciado: Muestra una tabla con datos.
 */
import javax.swing.*;
public class TablaDatos extends JFrame {
  public TablaDatos(){
    super("Tabla");
    String[][] datos={{"1","Ana"},{"2","Luis"},{"3","Marta"}};
    String[] cols={"ID","Nombre"};
    JTable tabla=new JTable(datos,cols);
    add(new JScrollPane(tabla));
    setSize(300,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  public static void main(String[] args){ new TablaDatos(); }
}

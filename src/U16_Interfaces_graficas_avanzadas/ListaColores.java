package U16_Interfaces_graficas_avanzadas;
/**
 * Ejercicio 16.3 - Lista de colores
 * Enunciado: Selección de colores con JList.
 */
import javax.swing.*;
public class ListaColores extends JFrame {
  public ListaColores(){
    super("Lista de colores");
    String[] colores={"Rojo","Verde","Azul"};
    JList<String> lista=new JList<>(colores);
    add(new JScrollPane(lista));
    setSize(200,150);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  public static void main(String[] args){ new ListaColores(); }
}

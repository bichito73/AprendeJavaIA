package U13_Graficos;
/**
 * Ejercicio 13.1 - Ventana simple
 * Enunciado: Crea una ventana con título usando JFrame.
 */
import javax.swing.*;
public class VentanaSimple {
  public static void main(String[] args){
    JFrame v=new JFrame("Ventana simple");
    v.setSize(300,200);
    v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    v.setVisible(true);
  }
}

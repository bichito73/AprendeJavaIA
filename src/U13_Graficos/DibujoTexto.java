package U13_Graficos;
/**
 * Ejercicio 13.4 - Dibujar texto
 * Enunciado: Muestra un texto en una ventana.
 */
import javax.swing.*;
import java.awt.*;
public class DibujoTexto extends JPanel {
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawString("Hola mundo gráfico", 80,100);
  }
  public static void main(String[] args){
    JFrame v=new JFrame("Texto");
    v.add(new DibujoTexto());
    v.setSize(300,200);
    v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    v.setVisible(true);
  }
}

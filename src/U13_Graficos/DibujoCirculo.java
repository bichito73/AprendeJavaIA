package U13_Graficos;
/**
 * Ejercicio 13.3 - Dibujar círculo
 * Enunciado: Dibuja un círculo en un JPanel.
 */
import javax.swing.*;
import java.awt.*;
public class DibujoCirculo extends JPanel {
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawOval(60,40,100,100);
  }
  public static void main(String[] args){
    JFrame v=new JFrame("Círculo");
    v.add(new DibujoCirculo());
    v.setSize(300,250);
    v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    v.setVisible(true);
  }
}

package U13_Graficos;
/**
 * Ejercicio 13.2 - Dibujar rectángulo
 * Enunciado: Dibuja un rectángulo en un JPanel.
 */
import javax.swing.*;
import java.awt.*;
public class DibujoRectangulo extends JPanel {
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawRect(50,50,100,60);
  }
  public static void main(String[] args){
    JFrame v=new JFrame("Rectángulo");
    v.add(new DibujoRectangulo());
    v.setSize(300,200);
    v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    v.setVisible(true);
  }
}

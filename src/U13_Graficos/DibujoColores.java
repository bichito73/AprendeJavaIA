package U13_Graficos;
/**
 * Ejercicio 13.5 - Dibujar con colores
 * Enunciado: Dibuja un rectángulo rojo y un círculo azul.
 */
import javax.swing.*;
import java.awt.*;
public class DibujoColores extends JPanel {
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.RED); g.fillRect(30,30,80,50);
    g.setColor(Color.BLUE); g.fillOval(150,30,80,80);
  }
  public static void main(String[] args){
    JFrame v=new JFrame("Colores");
    v.add(new DibujoColores());
    v.setSize(300,200);
    v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    v.setVisible(true);
  }
}

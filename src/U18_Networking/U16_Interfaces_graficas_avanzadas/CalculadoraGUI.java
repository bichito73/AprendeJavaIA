package U16_Interfaces_graficas_avanzadas;
/**
 * Ejercicio 16.2 - Calculadora GUI
 * Enunciado: Calculadora básica con botones.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalculadoraGUI extends JFrame implements ActionListener {
  JTextField pantalla; double op1=0; String op="";
  public CalculadoraGUI(){
    super("Calculadora");
    pantalla=new JTextField(10);
    JPanel p=new JPanel(new GridLayout(4,4));
    String[] b={"7","8","9","+","4","5","6","-","1","2","3","*","0","C","=","/"};
    for(String s:b){JButton bt=new JButton(s);bt.addActionListener(this);p.add(bt);}
    setLayout(new BorderLayout());
    add(pantalla,BorderLayout.NORTH); add(p,BorderLayout.CENTER);
    setSize(250,250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e){
    String cmd=e.getActionCommand();
    if("0123456789".contains(cmd)) pantalla.setText(pantalla.getText()+cmd);
    else if("+-*/".contains(cmd)){op1=Double.parseDouble(pantalla.getText());op=cmd;pantalla.setText("");}
    else if(cmd.equals("=")){double op2=Double.parseDouble(pantalla.getText());switch(op){case "+":pantalla.setText(""+(op1+op2));break;case "-":pantalla.setText(""+(op1-op2));break;case "*":pantalla.setText(""+(op1*op2));break;case "/":pantalla.setText(""+(op1/op2));break;}}
    else if(cmd.equals("C")) pantalla.setText("");
  }
  public static void main(String[] args){ new CalculadoraGUI(); }
}

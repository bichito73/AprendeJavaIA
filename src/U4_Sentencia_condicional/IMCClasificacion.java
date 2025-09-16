package U4_Sentencia_condicional;
/**
 * Ejercicio 4.7 - IMC
 * Enunciado: Pide peso(kg) y altura(m) y clasifica el IMC.
 */
import java.util.Scanner;
public class IMCClasificacion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Peso (kg): "); double peso = sc.nextDouble();
    System.out.print("Altura (m): "); double altura = sc.nextDouble();
    double imc = peso / (altura*altura);
    String cat = (imc<18.5) ? "Bajo peso" :
                 (imc<25) ? "Normal" :
                 (imc<30) ? "Sobrepeso" : "Obesidad";
    System.out.printf("IMC=%.1f (%s)%n", imc, cat);
  }
}

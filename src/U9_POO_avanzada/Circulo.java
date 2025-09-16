package U9_POO_avanzada;
public class Circulo extends Figura {
  double r;
  public Circulo(double radio){r=radio;}
  public double area(){return Math.PI*r*r;}
  public double perimetro(){return 2*Math.PI*r;}
}

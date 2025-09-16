package U9_POO_avanzada;
public class Rectangulo extends Figura {
  double a,b;
  public Rectangulo(double x,double y){a=x;b=y;}
  public double area(){return a*b;}
  public double perimetro(){return 2*(a+b);}
}

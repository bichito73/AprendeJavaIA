package U9_POO_avanzada;
public class FiguraPrueba {
  public static void main(String[] args){
    Figura f1=new Circulo(3);
    Figura f2=new Rectangulo(2,5);
    System.out.println("Área círculo="+f1.area());
    System.out.println("Perímetro rectángulo="+f2.perimetro());
  }
}

package U9_POO_avanzada;
public class Gerente extends Empleado {
  double incentivo;
  public Gerente(String n,double s,double i){super(n,s);incentivo=i;}
  @Override public void mostrar(){System.out.println(nombre+" cobra "+(salario+incentivo));}
}

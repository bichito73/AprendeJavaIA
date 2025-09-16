package U9_POO_avanzada;
public class EmpleadoPrueba {
  public static void main(String[] args){
    Empleado e=new Empleado("Ana",1000);
    Gerente g=new Gerente("Luis",1200,500);
    e.mostrar();
    g.mostrar();
  }
}

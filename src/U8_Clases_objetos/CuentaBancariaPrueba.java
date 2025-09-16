package U8_Clases_objetos;
public class CuentaBancariaPrueba {
  public static void main(String[] args){
    CuentaBancaria cb=new CuentaBancaria("Maria");
    cb.ingresar(1000);
    cb.retirar(300);
    cb.mostrar();
  }
}

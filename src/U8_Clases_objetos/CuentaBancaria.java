package U8_Clases_objetos;
/**
 * Ejercicio 8.3 - Clase CuentaBancaria
 * Enunciado: Clase con titular, saldo y métodos ingresar/retirar.
 */
public class CuentaBancaria {
  String titular;
  double saldo;
  public CuentaBancaria(String t){titular=t;saldo=0;}
  public void ingresar(double c){saldo+=c;}
  public void retirar(double c){if(c<=saldo)saldo-=c;}
  public void mostrar(){System.out.println(titular+" saldo="+saldo);}
}

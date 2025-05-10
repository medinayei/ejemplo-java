import javax.swing.JOptionPane; // libreria para que podamos utilizar un pequenio cuadro de texto 
public class Calculadora {
    public static void main ( String args []){
 String numero1 = JOptionPane.showInputDialog("Ingresa el primer numero ");
    String numero2 = JOptionPane.showInputDialog("Ingresa el segundo numero ");

    double numeroDecimal1 = Double.parseDouble(numero1);
    double numeroDecimal2 = Double.parseDouble(numero2);
    double totalSuma = numeroDecimal1 + numeroDecimal2 ;
    double totalResta= numeroDecimal1 - numeroDecimal2 ;
     double totalMultiplicacion = numeroDecimal1 * numeroDecimal2 ;
      double totalDivision= numeroDecimal1 / numeroDecimal2 ;
      System.out.println ("El resultado de sumar los 2 numeros que ingresaste es " + totalSuma);
      System.out.println ("El resultado de restar los 2 numeros que ingresaste es " + totalResta);
      System.out.println ("El resultado de multiplicar los 2 numeros que ingresaste es " + totalMultiplicacion);
      System.out.println ("El resultado de dividir los 2 numeros que ingresaste es " + totalDivision);
    }
}
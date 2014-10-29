package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Condicional {

    private double num1;
    private double num2;

    public Condicional() {

    }

    public Condicional(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double pedirNum() {
        String respuesta = JOptionPane.showInputDialog("Introduce Número: ");
        double valor = Double.parseDouble(respuesta);
        return valor;
    }

    public void getCondicion(double n1, double n2) {
        if (n1 >= n2) {            
        } if (n1 == n2) {
            JOptionPane.showMessageDialog(null, n1 + " es igual a " + n2);
        } else if (n1>n2) {
            JOptionPane.showMessageDialog(null, "El mayor es " + n1);
        } else {
            JOptionPane.showMessageDialog(null, "El mayor es " + n2);
        }

    }
}

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("0.00");
        Calc c = new Calc();

        try {
            c.n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o primeiro número:"));
            if (c.n1 < 0) {
                throw new NumeroNegativo("Entrada de número negativo");
            }

            c.n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o segundo número:"));
            if (c.n2 < 0) {
                throw new NumeroNegativo("Entrada de número negativo");
            }

            JOptionPane.showMessageDialog(null, "Soma: " + dc.format(c.somar()));
            JOptionPane.showMessageDialog(null, "Subtração: " + dc.format(c.diminuir()));
            JOptionPane.showMessageDialog(null, "Multiplicação: " + dc.format(c.multiplicar()));
            JOptionPane.showMessageDialog(null, "Divisão: " + dc.format(c.dividir()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor Inválido");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro divisão por zero");
        } catch (NumeroNegativo e) {
            JOptionPane.showMessageDialog(null, "Entrada de número negativo");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Entrada de Dados Inválida");
        }
    }
}
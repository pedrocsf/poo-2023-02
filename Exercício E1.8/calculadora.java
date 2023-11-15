package ex18;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> criarGUI());
    }

    private static void criarGUI() {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));
        frame.setSize(1000, 2000);
        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        JTextField resultadoField = new JTextField();
        resultadoField.setEditable(false);

        JButton somarButton = new JButton("+");
        JButton subtrairButton = new JButton("-");
        JButton multiplicarButton = new JButton("*");
        JButton dividirButton = new JButton("/");

        somarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularOperacao("+", textField1, textField2, resultadoField);
            }
        });

        subtrairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularOperacao("-", textField1, textField2, resultadoField);
            }
        });

        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularOperacao("*", textField1, textField2, resultadoField);
            }
        });

        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularOperacao("/", textField1, textField2, resultadoField);
            }
        });

        frame.add(textField1);
        frame.add(textField2);
        frame.add(somarButton);
        frame.add(subtrairButton);
        frame.add(multiplicarButton);
        frame.add(dividirButton);
        frame.add(resultadoField);
        frame.pack();
        frame.setVisible(true);
    }

    private static void calcularOperacao(String operador, JTextField textField1, JTextField textField2, JTextField resultadoField) {
        try {
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());

            int resultado = 0;

            switch (operador) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(null, "Divisão por zero não permitida.");
                    }
                    break;
            }

            resultadoField.setText(Integer.toString(resultado));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira números inteiros válidos.");
        }
    }
}

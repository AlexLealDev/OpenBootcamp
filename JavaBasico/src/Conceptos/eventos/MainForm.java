package Conceptos.eventos;

import javax.swing.*;
import java.awt.event.*;

public class MainForm {
    private JTextPane precioPane1;
    private JTextPane IVAPane2;
    private JTextPane totalPane3;
    private JButton buttonCalculadora;
    private JPanel CalculadoraIVA;


    public MainForm() {
        buttonCalculadora.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            double p = Double.parseDouble(precioPane1.getText());
            double t = Double.parseDouble(IVAPane2.getText());

            double result = p + (p / 100 * t);
            totalPane3.setText(Double.toString(result));
        }
        });

        precioPane1.addKeyListener(new KeyAdapter() {
           @Override
           public void keyTyped(KeyEvent e) {
               super.keyTyped(e);
               String valorPrecio = precioPane1.getText();
               precioPane1.setText(valorPrecio);
           } 
        });

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("CalculadoraDeIVA");
        frame.setContentPane(new MainForm().CalculadoraIVA);
        frame.setVisible(true);

    }

}

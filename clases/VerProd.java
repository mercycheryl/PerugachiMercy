package Prueba2BPerugachiMercy.clases;

import javax.swing.*;

public class VerProd extends JFrame{
    private JPanel panelVProd;
    public VerProd() {
        setTitle("Ventas ");
        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panelVProd);
        setLocationRelativeTo(null);
    }


    public static void main(String[] args){
        SwingUtilities.invokeLater(()->{
            new VerProd().setVisible(true);
        });
    }
}

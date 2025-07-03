package Prueba2BPerugachiMercy.clases;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerProd extends JFrame{
    private JPanel panelVProd;
    private JButton btnRegresar;

    public VerProd() {
        setTitle("Ventas ");
        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panelVProd);
        setLocationRelativeTo(null);
        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventas ventas=new Ventas();
                ventas.setVisible(true);
            }
        });
    }


    public static void main(String[] args){
        SwingUtilities.invokeLater(()->{
            new VerProd().setVisible(true);
        });
    }
}

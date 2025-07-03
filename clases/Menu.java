package Prueba2BPerugachiMercy.clases;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    private JPanel panelMenu;
    private JButton btnRegistro;
    private JButton btnVentas;
    private JButton btnVerProd;

    public Menu() {
        setTitle("Ventas ");
        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panelMenu);
        setLocationRelativeTo(null);
        btnRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registro registro=new Registro();
                registro.setVisible(true);
            }
        });
        btnVentas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventass ventass=new Ventass();
                ventass.setVisible(true);
            }
        });
        btnVerProd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VerProd verProd=new VerProd();
                verProd.setVisible(true);
            }
        });
    }


    public static void main(String[] args){
        SwingUtilities.invokeLater(()->{
            new Menu().setVisible(true);
        });
    }


}

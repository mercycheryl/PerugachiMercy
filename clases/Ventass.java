package Prueba2BPerugachiMercy.clases;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventass extends JFrame {
    private JPanel panelVentas;
    private JTextField txtCod;
    private JTextField txtProd;
    private JTextField txtPrecio;
    private JTextField txtCant;
    private JTextField txtSubtotal;
    private JTextField textField6;
    private JButton btnCalcular;
    private JButton btnRegresar;
    private JLabel txtProduc;
    private JLabel txtPre;
    private JLabel txt;

    /*
    JTextField txtNombre;
JTextField txtApellido;
JComboBox<String> cbGenero;

     */

    public Ventass() {
        setTitle("Ventas ");
        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panelVentas);
        setLocationRelativeTo(null);
        // regresar menú
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
            new Ventass().setVisible(true);
        });
    }
}

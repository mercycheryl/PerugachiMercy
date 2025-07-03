package Prueba2BPerugachiMercy.clases;

import javax.swing.*;

public class Registro extends JFrame{
    private JPanel panelRegistro;
    private JButton btnGuardar;
    private JButton btnLimpiar;
    private JTextField txtCod;
    private JTextField txtNombre;
    private JTextField txtDet;
    private JTextField txtPrecio;
    private JTextField txtStock;

    public Registro() {
        setTitle("Ventas ");
        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panelRegistro);
        setLocationRelativeTo(null);
    }


    public static void main(String[] args){
        SwingUtilities.invokeLater(()->{
            new Registro().setVisible(true);
        });
    }

}

package Prueba2BPerugachiMercy.clases;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

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
        setTitle("Registro");
        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panelRegistro);
        setLocationRelativeTo(null);
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtCod.setText("");
                txtNombre.setText("");
                txtDet.setText("");
                txtPrecio.setText("");
                txtStock.setText("");
            }
        });
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarCampos()){
                    JOptionPane.showMessageDialog(null,"Datos guardados correctamente");
                }
                System.out.println(validarCampos());
                String cod=txtCod.getText();
                String nombre=txtNombre.getText();
                String det=txtDet.getText();
                String precio=txtPrecio.getText();
                String stock=txtStock.getText();


                String contenido = ":::::::::: MOSTRAR PRODUCTOS ::::::::::\n";
                contenido += "Codigo: "+ cod+ "\n";
                contenido += "Nombre: " + nombre + "\n";
                contenido += "Detalle " + det + "\n";
                contenido += "Stock actuario: " + stock+ "\n";



            }
        });
    }

    private boolean validarCampos() {
        if (txtCod.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Código está vacío.");
            txtCod.requestFocus();
            return false;
        }

        if (txtNombre.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Nombre está vacío.");
            txtNombre.requestFocus();
            return false;
        }

        if (txtDet.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Detalle está vacío.");
            txtDet.requestFocus();
            return false;
        }
        if (txtPrecio.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Precio Unitario está vacío.");
            txtPrecio.requestFocus();
            return false;
        }

        if (txtStock.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Stock está vacío.");
            txtStock.requestFocus();
            return false;
        }

        return true;
    }


    public static void main(String[] args){
        SwingUtilities.invokeLater(()->{
            new Registro().setVisible(true);
        });
    }

}

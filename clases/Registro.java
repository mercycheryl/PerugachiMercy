package Prueba2BPerugachiMercy.clases;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registro extends JFrame {
    private JPanel panelRegistro;
    private JButton btnGuardar;
    private JButton btnLimpiar;
    private JTextField txtCod;
    private JTextField txtNombre;
    private JTextField txtDet;
    private JTextField txtPrecio;
    private JTextField txtStock;

    public Registro() {
        setTitle("Registro de Productos");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panelRegistro);
        setLocationRelativeTo(null);



        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarCampos()) {
                    JOptionPane.showMessageDialog(null, "Producto guardado correctamente.");

                    limpiarCampos();
                }
            }
        });


        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });
    }

    private boolean validarCampos() {
        String precioStr = txtPrecio.getText().trim();
        String stockStr = txtStock.getText().trim();

        if (txtCod.getText().trim().isEmpty()) {
            mostrar("El campo Código está vacío.");
            txtCod.requestFocus();
            return false;
        }
        if (txtNombre.getText().trim().isEmpty()) {
            mostrar("El campo Nombre está vacío.");
            txtNombre.requestFocus();
            return false;
        }
        if (txtDet.getText().trim().isEmpty()) {
            mostrar("El campo Detalle está vacío.");
            txtDet.requestFocus();
            return false;
        }
        if (precioStr.isEmpty()) {
            mostrar("El campo Precio Unitario está vacío.");
            txtPrecio.requestFocus();
            return false;
        }
        if (stockStr.isEmpty()) {
            mostrar("El campo Stock está vacío.");
            txtStock.requestFocus();
            return false;
        }

        try {
            double precio = Double.parseDouble(precioStr);
            if (precio > 9999) {
                mostrar("El precio no debe superar 4 cifras.");
                txtPrecio.requestFocus();
                return false;
            }
        } catch (NumberFormatException e) {
            mostrar("Precio debe ser numérico.");
            txtPrecio.requestFocus();
            return false;
        }

        try {
            int stock = Integer.parseInt(stockStr);
            if (stock > 999) {
                mostrar("El stock no debe superar 3 cifras.");
                txtStock.requestFocus();
                return false;
            }
        } catch (NumberFormatException e) {
            mostrar("Stock debe ser un número entero.");
            txtStock.requestFocus();
            return false;
        }

        return true;
    }

    private void mostrar(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    private void limpiarCampos() {
        txtCod.setText("");
        txtNombre.setText("");
        txtDet.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Registro().setVisible(true));}
}

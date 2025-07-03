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


    public Ventass() {
        setTitle("Ventas ");
        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panelVentas);
        setLocationRelativeTo(null);
        cargarProductos();

        // regresar menú
        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventas ventas=new Ventas();
                ventas.setVisible(true);
            }
        });


        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarCampos()) {
                    try {
                        double precio = Double.parseDouble(txtPrecio.getText());
                        int cantidad = Integer.parseInt(txtCant.getText());
                        double subtotal = precio * cantidad;
                        txtSubtotal.setText(String.valueOf(subtotal));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Ingrese valores numéricos válidos en Precio y Cantidad.");
                    }
                }
            }
        });

    }

    private boolean validarCampos() {
        if (txtCod.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Código está vacío.");
            txtCod.requestFocus();
            return false;
        }

        if (txtProd.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Producto está vacío.");
            txtProd.requestFocus();
            return false;
        }

        if (txtPrecio.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Precio está vacío.");
            txtPrecio.requestFocus();
            return false;
        }

        if (txtCant.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Cantidad está vacío.");
            txtCant.requestFocus();
            return false;
        }

        if (txtSubtotal.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Subtotal está vacío.");
            txtSubtotal.requestFocus();
            return false;
        }

        return true;
    }


    public static void main(String[] args){
        SwingUtilities.invokeLater(()->{
            new Ventass().setVisible(true);
        });
    }

    class Producto {
        String codigo;
        String nombre;
        double precio;
        int stock;

        public Producto(String codigo, String nombre, double precio, int stock) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }
    }

    private java.util.List<Producto> productos = new java.util.ArrayList<>();
    private Producto productoActual = null;

    private void cargarProductos() {
        productos.add(new Producto("P001", "Laptop Lenovo", 750.00, 10));
        productos.add(new Producto("P002", "Mouse Logitech", 25.50, 30));
        productos.add(new Producto("P003", "Teclado HP", 45.00, 20));
    }






    }




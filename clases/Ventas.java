package Prueba2BPerugachiMercy.clases;

import javax.swing.*;
import javax.swing.plaf.MenuBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Ventas extends JFrame{
    private JPanel panel1;
    private JButton btnAcceder;
    private JButton btnLimpiar;
    private JTextField txtUser;
    private JTextField txtPassword;

    public Ventas() {
        setTitle("Ventas ");
        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setLocationRelativeTo(null);

        // acceder
        btnAcceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user=txtUser.getText();
                String password=txtPassword.getText();

                if(user.equals("mercy")&& password.equals("123")){
                    Menu menu= new Menu();
                    menu.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null,"Credenciales incorrectas");
                }
                txtUser.setText("");
                txtPassword.setText("");

            }
        });

        //limpiar
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUser.setText("");
                txtPassword.setText("");
            }
        });

    }


    //

    public static void main(String[] args){
        SwingUtilities.invokeLater(()->{
            new Ventas().setVisible(true);
        });
    }
}

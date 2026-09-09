package vista;

import javax.swing.*;

public class LoginView extends JFrame {

    public JTextField txtEmail;
    public JPasswordField txtPassword;
    public JButton btnIngresar;

    public LoginView() {

        setTitle("Sistema de Estacionamiento");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblEmail = new JLabel("Email:");
        JLabel lblPassword = new JLabel("Contraseña:");

        txtEmail = new JTextField();
        txtPassword = new JPasswordField();
        btnIngresar = new JButton("Ingresar");

        setLayout(null);

        lblEmail.setBounds(50, 40, 100, 30);
        txtEmail.setBounds(150, 40, 180, 30);

        lblPassword.setBounds(50, 80, 100, 30);
        txtPassword.setBounds(150, 80, 180, 30);

        btnIngresar.setBounds(130, 140, 120, 35);

        add(lblEmail);
        add(txtEmail);
        add(lblPassword);
        add(txtPassword);
        add(btnIngresar);
    }
}
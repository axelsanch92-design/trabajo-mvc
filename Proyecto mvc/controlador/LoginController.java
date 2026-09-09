package controlador;

import modelo.Usuario;
import vista.LoginView;

import javax.swing.*;

public class LoginController {

    private LoginView vista;

    public LoginController(LoginView vista) {

        this.vista = vista;

        vista.btnIngresar.addActionListener(e -> ingresar());
    }

    private void ingresar() {

        String email = vista.txtEmail.getText();
        String password =
                new String(vista.txtPassword.getPassword());

        if (email.equals("admin@gmail.com")
                && password.equals("1234")) {

            JOptionPane.showMessageDialog(
                    vista,
                    "Login correcto"
            );

        } else {

            JOptionPane.showMessageDialog(
                    vista,
                    "Email o contraseña incorrectos"
            );
        }
    }
}
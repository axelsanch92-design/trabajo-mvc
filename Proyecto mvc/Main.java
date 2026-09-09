import controlador.LoginController;
import vista.LoginView;

public class Main {

    public static void main(String[] args) {

        LoginView vista = new LoginView();

        new LoginController(vista);

        vista.setVisible(true);
    }
}

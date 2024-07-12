import javax.swing.*;

public class PruebaApp {
    public static void main(String[] args) {
        /*
        *             Credenciales
        * usuario: darw182
        * contraseña: 1234
        *
        * */
        JFrame frame = new JFrame("login");
        frame.setContentPane(new login(frame).mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

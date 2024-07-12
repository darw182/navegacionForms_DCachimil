import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class login {
    private JTextField userTxt;
    private JTextField passTxt;
    private JButton ingresarBtn;
    private JButton resetBtn;
    public JPanel mainPanel;

    public login(JFrame mainFrame) {
        ingresarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = userTxt.getText();
                String pass = passTxt.getText();

                if (usuario.equals("darw182") && pass.equals("1234")){
                    JFrame segunda_vent = new JFrame();
                    segunda_vent.setContentPane(new bio(segunda_vent).getPanelBio());
                    segunda_vent.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    segunda_vent.pack();
                    segunda_vent.setVisible(true);
                    mainFrame.dispose();
                }else {
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas", "Login incorrecto", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        resetBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userTxt.setText("");
                passTxt.setText("");
            }
        });
    }


}

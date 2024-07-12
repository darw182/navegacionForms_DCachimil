import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bio {
    private JButton fotoButton;
    private JPanel panelBio;

    public bio(JFrame bioFrame) {
        fotoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame tercera_vent = new JFrame();
                tercera_vent.setContentPane(new foto(tercera_vent).getFotoPanel());
                tercera_vent.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                tercera_vent.pack();
                tercera_vent.setLocationRelativeTo(null);
                tercera_vent.setResizable(false);
                tercera_vent.setVisible(true);
                bioFrame.dispose();
            }
        });
    }

    public JPanel getPanelBio() {
        return panelBio;
    }
}

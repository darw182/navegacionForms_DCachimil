import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class foto {
    private JPanel fotoPanel;
    private JButton biografiaButton;
    private JLabel img;


    public foto(JFrame fotoFrame){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("guitar.jpg"));

        Image img_or = imageIcon.getImage();
        Image imgTamanio = img_or.getScaledInstance(350,350,Image.SCALE_SMOOTH);
        ImageIcon iconTamanio = new ImageIcon(imgTamanio);

        img.setIcon(iconTamanio);

        biografiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame segunda_vent = new JFrame();
                segunda_vent.setContentPane(new bio(segunda_vent).getPanelBio());
                segunda_vent.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                segunda_vent.pack();
                segunda_vent.setLocationRelativeTo(null);
                segunda_vent.setResizable(false);
                segunda_vent.setVisible(true);
                fotoFrame.dispose();
            }
        });
    }

    public JPanel getFotoPanel() {
        return fotoPanel;
    }

}

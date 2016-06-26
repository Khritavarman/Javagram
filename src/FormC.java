import javax.swing.*;
import java.time.Year;

/**
 * Created by Akharu on 6/26/2016.
 */
public class FormC {

    private JPanel rootPanel;
    private JButton button1;
    private JButton button2;
    private JTextField name;
    private JTextField surname;
    private JButton button;
    private JPanel centerPanel;

    public FormC() {
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}

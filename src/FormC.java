import javax.swing.*;
import java.time.Year;

/**
 * Created by Akharu on 6/26/2016.
 */
public class FormC {

    private JPanel rootPanel;
    private JButton button1;
    private JButton button2;
    private JPanel centerPanel;
    private JTextArea contactList;
    private JPanel list;

    public FormC() {
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JPanel getList() {
        return list;
    }

    public JTextArea getContactList() {
        return contactList;
    }
}

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

/**
 * Created by Akharu on 6/26/2016.
 */
public class FormA {

    private JPanel rootPanel;

    public JFormattedTextField getPhoneNumberField() {
        return phoneNumberField;
    }

    private JFormattedTextField phoneNumberField;
    private JButton button;
    private JPanel centerPanel;
    private JButton button1;
    private JButton button2;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JPanel getCenterPanel() {
        return centerPanel;
    }

    public JButton getButton() {
        return button;
    }

    public FormA() {
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
    }

    private void createUIComponents() {
        phoneNumberField = new JFormattedTextField();
        try {
            MaskFormatter dateMask = new MaskFormatter("+7**********");
            dateMask.install(phoneNumberField);
        } catch (ParseException ex) {
        }
    }
}

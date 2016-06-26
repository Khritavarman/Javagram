import javax.swing.*;

/**
 * Created by Akharu on 6/26/2016.
 */
public class FormB {

    private JPanel rootPanel;
    private JButton button1;
    private JButton button2;
    private JPanel lowerPanel;
    private JPasswordField authorizationCodeField;
    private JButton button;
    private JLabel phoneNumberField;

    public FormB() {
        rootPanel.setLayout(new BoxLayout(rootPanel, BoxLayout.Y_AXIS));
        lowerPanel.setLayout(new BoxLayout(lowerPanel, BoxLayout.Y_AXIS));
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JLabel getPhoneNumberField() {
        return phoneNumberField;
    }

    public JButton getButton() {
        return button;
    }

    public JPasswordField getAuthorizationCodeField() {
        return authorizationCodeField;
    }
}

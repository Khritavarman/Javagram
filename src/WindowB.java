import javax.swing.*;

/**
 * Created by Akharu on 6/26/2016.
 */
public class WindowB extends JFrame {

    FormB formB;

    public WindowB() {
        formB = new FormB();
        setContentPane(formB.getRootPanel());
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public FormB getFormB() {
        return formB;
    }
}

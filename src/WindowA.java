import javax.swing.*;

/**
 * Created by Akharu on 6/26/2016.
 */
public class WindowA extends JFrame {

    FormA formA;

    public WindowA() {
        formA = new FormA();
        setContentPane(formA.getRootPanel());
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public FormA getFormA() {
        return formA;
    }
}

import javax.swing.*;

/**
 * Created by Akharu on 6/26/2016.
 */
public class WindowC extends JFrame {

    FormC formC;

    public WindowC() {
        formC = new FormC();
        setContentPane(formC.getRootPanel());
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}

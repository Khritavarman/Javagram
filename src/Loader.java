import com.sun.corba.se.pept.transport.ContactInfoList;
import org.javagram.TelegramApiBridge;
import org.javagram.response.AuthAuthorization;
import org.javagram.response.AuthCheckedPhone;
import org.javagram.response.object.UserContact;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Akharu on 6/26/2016.
 */
public class Loader {

    public static void main(String[] args) throws IOException {

        /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TelegramApiBridge bridge = new TelegramApiBridge("149.154.167.50:443", 22668, "60de83a646b460c7491c12c1375d390b");
        System.out.println("Please, type a phone number");
        AuthCheckedPhone checkedPhone = bridge.authCheckPhone(reader.readLine().replaceAll("[^0-9]+", ""));

        if (checkedPhone.isRegistered())
        {
            System.out.println("You are registered. Please, enter your phone number once again to get a confirmation code");
            //Вводим номер телефона и получаем на него код подтверждения
            bridge.authSendCode(reader.readLine().replaceAll("[^0-9]+", ""));
            //Вводим в консоли полученный код и авторизуемся
            AuthAuthorization authorizedUser = bridge.authSignIn(reader.readLine().trim());
            //Выводим на экран имя
            System.out.println("Hello " + authorizedUser.getUser().getFirstName() + " " + authorizedUser.getUser().getLastName());
            //Получение и вывод на экран списка контактов
            ArrayList<UserContact> contacts = bridge.contactsGetContacts();
            for (UserContact contact : contacts)
                System.out.println(contact);
        }
        else
        {
            System.out.println("You are registered - false");
            System.out.println("You are invited - " + checkedPhone.isInvited());
        }
         */

        TelegramApiBridge bridge = new TelegramApiBridge("149.154.167.50:443", 22668, "60de83a646b460c7491c12c1375d390b");
        WindowA windowA = new WindowA();
        WindowB windowB = new WindowB();
        WindowC windowC = new WindowC();
        windowA.setVisible(true);

        windowA.getFormA().getButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                try {
                    String phoneNumber = windowA.getFormA().getPhoneNumberField().getText();
                    AuthCheckedPhone authCheckedPhone = bridge.authCheckPhone(phoneNumber);
                    if (authCheckedPhone.isRegistered()) {
                        bridge.authSendCode(phoneNumber);
                        windowB.getFormB().getPhoneNumberField().setText(phoneNumber);
                        windowB.setVisible(true);
                        windowA.dispose();
                    } else {
                        JOptionPane.showMessageDialog(windowA.getFormA().getRootPanel(),
                                "Phone number is not registered",
                                "warning",
                                JOptionPane.WARNING_MESSAGE);
                    }
                } catch (IOException e1) {
                }
            }
        });

        windowB.getFormB().getButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                try {
                    AuthAuthorization authorizedUser = bridge.authSignIn(windowB.getFormB().getAuthorizationCodeField().getText());
                    windowC.setVisible(true);
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(6);
                    list.add(8);
                    for (Integer userContact : list) {
                        windowC.getFormC().getContactList().setText(userContact.toString());
                    }
                    windowB.dispose();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
}

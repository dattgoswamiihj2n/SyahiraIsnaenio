package TugasModul8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerpustakaanDigital {
    private JLabel labelJudul;
    private JTextField textPassword;
    private JTextField textEmail;
    private JTextArea textLibrary;
    private JLabel labelEmail;
    private JLabel labelPassword;
    private JButton submitButton;
    private JButton clearButton;
    private JPanel panel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Peminjaman Buku");
        frame.setContentPane(new PerpustakaanDigital().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public PerpustakaanDigital() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BusinessLogic businessLogic = new BusinessLogic(textEmail.getText(), textPassword.getText());

                boolean status = businessLogic.checkCredential();
                if(status == true)
                {
                    textLibrary.setText("\nWelcome " + businessLogic.getRoles() +
                            "\nLogged it as user email " + businessLogic.getEmail() + "\n" +
                            businessLogic.getEmail() + " meminjam buku : \n" +
                            "Buku 1 : " + businessLogic.getSubject1() +
                            "\nBuku 2 : " + businessLogic.getSubject2() +
                            "\nTanggal peminjaman : " + businessLogic.getDate() + "\n");
                }
                else
                {
                    textLibrary.setText("\nInvalid Login");
                }
                textLibrary.getText();
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPassword.setText("");
                textEmail.setText("");
                textLibrary.setText("");
            }
        });
    }
}

class BusinessLogic{

    private String email;
    private String password;
    private String roles;
    private String subject1, subject2, date;
    private String[][] data = new String[2][3];
    private String[][] histories = new String[2][4];

    public BusinessLogic(String email, String password) {
        this.email = email;
        this.password = password;

        String[][] data = {
                {"syahirakelompok29@gmail.com", "kel29", "superAdmin"},
                {"farizkelompok29@gmail.com", "kel29", "user"}
        };

        String[][] histories = {
                {"syahirakelompok29@gmail.com", "Fisika Dasar", "Dasar Komputer dan Pemrograman", "23-04-2021"},
                {"farizkelompok29@gmail.com", "Dasar Komputer dan Pemrograman", "Konsep Jaringan Komputer", "24-04-2021"}
        };

        this.data = data;
        this.histories = histories;
    }

    public String getEmail() {

        return email;
    }

    public String getRoles() {

        return roles;
    }

    public String getSubject1() {

        return subject1;
    }

    public String getSubject2() {

        return subject2;
    }

    public String getDate() {

        return date;
    }

    public boolean checkCredential()
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {
                if(data[i][1].equals(password))
                {
                    roles = data[i][2];
                }

                for(int j = 0; j < histories.length; j++){
                    if(histories[i][0].equals(email))
                    {
                        subject1 = histories[i][1];
                        subject2 = histories[i][2];
                        date = histories[i][3];
                    }
                }
                return true;
            }
        }
        return false;
    }
}

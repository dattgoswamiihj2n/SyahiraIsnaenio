package com.example;
import java.util.Scanner;

public class TugasModul5 {
    public static void main(String[] args) {
        String email, password;

        Scanner input = new Scanner(System.in);
        System.out.print("Email : ");
        email = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();

        BusinessLogic businessLogic = new BusinessLogic( email, password );
        businessLogic.login();
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

    private boolean checkCredential()
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

    public void login()
    {
        boolean status = checkCredential();
        if(status == true)
        {
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged it as user email " + email);
            System.out.println(email + " meminjam buku : ");
            System.out.println("Buku 1 : " + subject1);
            System.out.println("Buku 2 : " + subject2);
            System.out.println("Tanggal peminjaman : " + date);
        }
        else
        {
            System.out.println("\nInvalid Login ");
        }
    }
}
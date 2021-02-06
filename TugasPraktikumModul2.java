//Membuat Program Privat Online

package com.tutorial;
import java.util.Scanner;

public class TugasModul2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di website kami. Silakan masukkan nama Anda");
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.println("Hallo " + nama);

        int jenjang;
        System.out.println("1. SD");
        System.out.println("2. SMP");
        System.out.println("3. SMA");
        System.out.print("Silakan pilih jenjang Anda dengan memilih nomor 1-3 : ");
        jenjang = input.nextInt();

        if(jenjang == 1){
            System.out.println("1. Matematika");
            System.out.println("2. IPA");
            System.out.println("3. Bahasa Inggris");
            System.out.print("Silakan pilih pelajaran dengan memilih nomor 1-3 : ");
            int pelajaran = input.nextInt();
            switch(pelajaran){
                case 1 :
                    System.out.println("Kami akan mencarikan guru privat Matematika SD untuk Anda. Pemberitahuan lebih lanjut akan dikirim lewat email Anda");
                    break;
                case 2 :
                    System.out.println("Kami akan mencarikan guru privat IPA SD untuk Anda. Pemberitahuan lebih lanjut akan dikirim lewat email Anda");
                    break;
                case 3 :
                    System.out.println("Kami akan mencarikan guru privat Bahasa Inggris SD untuk Anda. Pemberitahuan lebih lanjut akan dikirim lewat email Anda");
                    break;
                default :
                    System.out.println("Kami tidak mengenal angka yang Anda masukkan. Silakan masukkan kembali");
            }
        }else if(jenjang == 2){
            System.out.println("1. Matematika");
            System.out.println("2. IPA");
            System.out.println("3. Bahasa Inggris");
            System.out.print("Silakan pilih pelajaran dengan memilih nomor 1-3 : ");
            int pelajaran = input.nextInt();
            switch(pelajaran){
                case 1 :
                    System.out.println("Kami akan mencarikan guru privat Matematika SMP untuk Anda. Pemberitahuan lebih lanjut akan dikirim lewat email Anda");
                    break;
                case 2 :
                    System.out.println("Kami akan mencarikan guru privat IPA SMP untuk Anda. Pemberitahuan lebih lanjut akan dikirim lewat email Anda");
                    break;
                case 3 :
                    System.out.println("Kami akan mencarikan guru privat Bahasa Inggris SMP untuk Anda. Pemberitahuan lebih lanjut akan dikirim lewat email Anda");
                    break;
                default :
                    System.out.println("Kami tidak mengenal angka yang Anda masukkan. Silakan masukkan kembali");
            }
        }else if(jenjang == 3){
            System.out.println("1. IPA");
            System.out.println("2. IPS");
            System.out.print("Silakan pilih jurusan dengan memilih nomor 1-2 : ");
            int jurusan = input.nextInt();
            if(jurusan == 1){
                System.out.println("1. Matematika");
                System.out.println("2. Fisika");
                System.out.println("3. Biologi");
                System.out.print("Silakan pilih pelajaran dengan memilih nomor 1-3 : ");
                int pelajaran = input.nextInt();
                switch(pelajaran){
                    case 1 :
                        System.out.println("Kami akan mencarikan guru privat Matematika untuk Anda. Pemberitahuan lebih lanjut akan dikirim lewat email Anda");
                        break;
                    case 2 :
                        System.out.println("Kami akan mencarikan guru privat Fisika untuk Anda. Pemberitahuan lebih lanjut akan dikirim lewat email Anda");
                        break;
                    case 3 :
                        System.out.println("Kami akan mencarikan guru privat Biologi untuk Anda. Pemberitahuan lebih lanjut akan dikirim lewat email Anda");
                        break;
                    default :
                        System.out.println("Kami tidak mengenal angka yang Anda masukkan. Silakan masukkan kembali");
                }
            }else if (jurusan == 2){
                System.out.println("1. Ekonomi");
                System.out.println("2. Geografi");
                System.out.println("3. Sosiologi");
                System.out.print("Silakan pilih pelajaran dengan memilih nomor 1-3 : ");
                int pelajaran = input.nextInt();
                switch(pelajaran){
                    case 1 :
                        System.out.println("Kami akan mencarikan guru privat Ekonomi untuk Anda. Pemberitahuan lebih lanjut akan dikirim lewat email Anda");
                        break;
                    case 2 :
                        System.out.println("Kami akan mencarikan guru privat Geografi untuk Anda. Pemberitahuan lebih lanjut akan dikirim lewat email Anda");
                        break;
                    case 3 :
                        System.out.println("Kami akan mencarikan guru privat Sosiologi untuk Anda. Pemberitahuan lebih lanjut akan dikirim lewat email Anda");
                        break;
                    default :
                        System.out.println("Kami tidak mengenal angka yang Anda masukkan. Silakan masukkan kembali");
                }
            }else{
                System.out.println("Kami tidak mengenal angka yang Anda masukkan. Silakan masukkan kembali");
            }
        }else{
            System.out.println("Kami tidak mengenal angka yang Anda masukkan. Silakan masukkan kembali");
        }
    }
}

package Tugas6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        User user = new User();

        System.out.println("Silakan Masukkan");

        System.out.print("Nama anggota : ");
        user.setNama(input.nextLine());

        System.out.print("Jurusan anggota : ");
        user.setJurusan(input.nextLine());

        System.out.print("NIM anggota : ");
        user.setNim(input.nextLong());
        System.out.println();

        System.out.println("Nama : " + user.getNama());
        System.out.println("NIM : " + user.getNim());
        System.out.println("Jurusan : " + user.getJurusan());
        System.out.println();

        System.out.println("Luas Lingkaran = " + area(38));

    }

    static float area(int kelompok){
        float phi = 3.14f;
        int jari2 = kelompok + 8;
        float luas = phi * jari2 * jari2;

        return luas;
    }

}
class User {

    private String nama;
    private long nim;
    private String jurusan;

    public String getNama() {

        return nama;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    public long getNim() {

        return nim;
    }

    public void setNim(long nim) {

        this.nim = nim;
    }

    public String getJurusan() {

        return jurusan;
    }

    public void setJurusan(String jurusan) {

        this.jurusan = jurusan;
    }
}

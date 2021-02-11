package com.example;
import java.util.Scanner;

public class TugasModul3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang!");
        System.out.print("Masukkan Pin : ");
        long pin = input.nextLong();

        boolean loop = true;
        while(loop){
            System.out.println("Jenis Transaksi : ");
            String[] pilihan = {
                    "1. Tarik Tunai", "2. Bayar atau Beli", "3. Keluar"
            };
            for (int i = 0; i < pilihan.length; i++){
                System.out.println(pilihan[i]);
            }
            System.out.print("Silakan pilih jenis transaksi di atas (nomor 1-3) : ");
            int jenisTransaksi = input.nextInt();
            boolean transaksi = true;

            while(transaksi){
                if(jenisTransaksi == 1){
                    System.out.println("Nominal Transaksi : ");
                    String[] rentang = {
                            "1. Rp 50.000", "2. Rp 100.000", "3. Rp 250.000", "4. Rp 500.000", "5. Transaksi lainnya", "6. Keluar"
                    };
                    for (int i = 0; i < rentang.length; i++){
                        System.out.println(rentang[i]);
                    }
                    System.out.print("Silakan pilih nominal uang yang akan Anda ambil (nomor 1-6) : ");
                    int nominal = input.nextInt();

                    if(nominal == 1){
                        System.out.println("Transaksi Anda berhasil");
                        boolean buktiTransaksi = true;
                        while(buktiTransaksi){
                            System.out.println("1. Ya");
                            System.out.println("2. Tidak");
                            System.out.print("Cetak bukti transaksi? (pilih nomor 1-2) : ");
                            int bukti = input.nextInt();
                            if(bukti == 1){
                                System.out.println("\nBUKTI TRANSAKSI");
                                System.out.println("Penarikan uang tunai : Rp 50.000\n");
                                buktiTransaksi = false;
                            }else if(bukti == 2){
                                System.out.println("Selesai\n");
                                buktiTransaksi = false;
                            }else{
                                System.out.println("Maaf kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                            }
                        }
                    }else if(nominal == 2){
                        System.out.println("Transaksi Anda berhasil");
                        boolean buktiTransaksi = true;
                        while(buktiTransaksi){
                            System.out.println("1. Ya");
                            System.out.println("2. Tidak");
                            System.out.print("Cetak bukti transaksi? (pilih nomor 1-2) : ");
                            int bukti1 = input.nextInt();
                            if(bukti1 == 1){
                                System.out.println("\nBUKTI TRANSAKSI");
                                System.out.println("Penarikan uang tunai : Rp 100.000\n");
                                buktiTransaksi = false;
                            }else if(bukti1 == 2){
                                System.out.println("Selesai\n");
                                buktiTransaksi = false;
                            }else{
                                System.out.println("Maaf kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                            }
                        }
                    }else if(nominal == 3){
                        System.out.println("Transaksi Anda berhasil");
                        boolean buktiTransaksi = true;
                        while(buktiTransaksi){
                            System.out.println("1. Ya");
                            System.out.println("2. Tidak");
                            System.out.print("Cetak bukti transaksi? (pilih nomor 1-2) : ");
                            int bukti2 = input.nextInt();
                            if(bukti2 == 1){
                                System.out.println("\nBUKTI TRANSAKSI");
                                System.out.println("Penarikan uang tunai : Rp 250.000\n");
                                buktiTransaksi = false;
                            }else if(bukti2 == 2){
                                System.out.println("Selesai\n");
                                buktiTransaksi = false;
                            }else{
                                System.out.println("Maaf kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                            }
                        }
                    }else if(nominal == 4){
                        System.out.println("Transaksi Anda berhasil");
                        boolean buktiTransaksi = true;
                        while(buktiTransaksi){
                            System.out.println("1. Ya");
                            System.out.println("2. Tidak");
                            System.out.print("Cetak bukti transaksi? (pilih nomor 1-2) : ");
                            int bukti3 = input.nextInt();
                            if(bukti3 == 1){
                                System.out.println("\nBUKTI TRANSAKSI");
                                System.out.println("Penarikan uang tunai : Rp 500.000\n");
                                buktiTransaksi = false;
                            }else if(bukti3 == 2){
                                System.out.println("Selesai\n");
                                buktiTransaksi = false;
                            }else{
                                System.out.println("Maaf kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                            }
                        }
                    }else if(nominal == 5){
                        System.out.print("Silakan ketik nominal yang ingin diambil : Rp ");
                        String nominal1 = input.next();
                        System.out.println("Transaksi Anda berhasil");
                        boolean buktiTransaksi = true;
                        while(buktiTransaksi){
                            System.out.println("1. Ya");
                            System.out.println("2. Tidak");
                            System.out.print("Cetak bukti transaksi? (pilih nomor 1-2) : ");
                            int bukti4 = input.nextInt();
                            if(bukti4 == 1){
                                System.out.println("\nBUKTI TRANSAKSI");
                                System.out.println("Penarikan uang tunai : Rp " + nominal1 + "\n");
                                buktiTransaksi = false;
                            }else if(bukti4 == 2){
                                System.out.println("Selesai\n");
                                buktiTransaksi = false;
                            }else{
                                System.out.println("Maaf kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                            }
                        }
                    }else if(nominal == 6){
                        transaksi = false;
                    }else{
                        System.out.println("Maaf kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                    }
                }else if(jenisTransaksi == 2){
                    System.out.println("Jenis Pembayaran : ");
                    String[] jenisPembayaran = {
                            "1. PAM", "2. PLN", "3. Telkom", "4. Pulsa", "5. Keluar"
                    };
                    for (int i = 0; i < jenisPembayaran.length; i++){
                        System.out.println(jenisPembayaran[i]);
                    }
                    System.out.print("Silakan pilih jenis pembayaran (nomor 1-5) : ");
                    int pilihPembayaran = input.nextInt();

                    if(pilihPembayaran == 1){
                        System.out.print("Silakan masukkan nomor PAM Anda : ");
                        long nomorPAM = input.nextLong();
                        System.out.println("Tagihan Anda : Rp 200.000");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.print("Apakah Anda yakin ingin membayar tagihan Anda? (pilih nomor 1-2) : ");
                        int pilih = input.nextInt();
                        boolean pilih2 = true;
                        while(pilih2){
                            if(pilih == 1){
                                System.out.println("Transaksi Anda berhasil");
                                System.out.println("1. Ya");
                                System.out.println("2. Tidak");
                                System.out.print("Cetak Bukti Transaksi? (pilih nomor 1-2) : ");
                                int bukti = input.nextInt();
                                boolean buktiTransaksi = true;
                                while(buktiTransaksi){
                                    if(bukti == 1){
                                        System.out.println("\nBUKTI TRANSAKSI");
                                        System.out.println("Tagihan PAM : Rp 200.000\n");
                                        buktiTransaksi = false;
                                        pilih2 = false;
                                    }else if(bukti == 2){
                                        System.out.println("Selesai\n");
                                        pilih2 = false;
                                        buktiTransaksi = false;
                                    }else{
                                        System.out.println("Maaf kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                                        buktiTransaksi = false;
                                    }
                                }
                            }else if(pilih == 2){
                                pilih2 = false;
                            }else{
                                System.out.println("Maaf kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                            }
                        }
                    }else if(pilihPembayaran == 2){
                        System.out.print("Silakan masukkan nomor PLN Anda : ");
                        long nomorPLN = input.nextLong();
                        System.out.println("Tagihan Anda : Rp 350.000");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.print("Apakah Anda yakin akan membayar tagihan Anda? (pilih nomor 1-2) : ");
                        int pilih = input.nextInt();
                        boolean pilih2 = true;
                        while(pilih2){
                            if(pilih == 1){
                                System.out.println("Transaksi Anda berhasil");
                                System.out.println("1. Ya");
                                System.out.println("2. Tidak");
                                System.out.print("Cetak Bukti Transaksi? (pilih nomor 1-2) : ");
                                int bukti = input.nextInt();
                                boolean buktiTransaksi = true;
                                while(buktiTransaksi){
                                    if(bukti == 1){
                                        System.out.println("\nBUKTI TRANSAKSI");
                                        System.out.println("Tagihan PLN : Rp 350.000\n");
                                        buktiTransaksi = false;
                                        pilih2 = false;
                                    }else if(bukti == 2){
                                        System.out.println("Selesai\n");
                                        pilih2 = false;
                                        buktiTransaksi = false;
                                    }else{
                                        System.out.println("Maaf kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                                        buktiTransaksi = false;
                                    }
                                }
                            }else if(pilih == 2){
                                pilih2 = false;
                            }else{
                                System.out.println("Maaf kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                            }
                        }
                    }else if(pilihPembayaran == 3){
                        System.out.print("Silakan masukkan nomor Telkom Anda : ");
                        long nomorTelkom = input.nextLong();
                        System.out.println("Tagihan Anda : Rp 200.000");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.print("Apakah Anda yakin akan membayar tagihan Anda? (pilih nomor 1-2) : ");
                        int pilih = input.nextInt();
                        boolean pilih2 = true;
                        while(pilih2){
                            if(pilih == 1){
                                System.out.println("Transaksi Anda berhasil");
                                System.out.println("1. Ya");
                                System.out.println("2. Tidak");
                                System.out.print("Cetak Bukti Transaksi? (pilih nomor 1-2) : ");
                                int bukti = input.nextInt();
                                boolean buktiTransaksi = true;
                                while(buktiTransaksi){
                                    if(bukti == 1){
                                        System.out.println("\nBUKTI TRANSAKSI");
                                        System.out.println("Tagihan Telkom : Rp 200.000\n");
                                        buktiTransaksi = false;
                                        pilih2 = false;
                                    }else if(bukti == 2){
                                        System.out.println("Selesai\n");
                                        pilih2 = false;
                                        buktiTransaksi = false;
                                    }else{
                                        System.out.println("Maaf kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                                        buktiTransaksi = false;
                                    }
                                }
                            }else if(pilih == 2){
                                pilih2 = false;
                            }else{
                                System.out.println("Maaf kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                            }
                        }
                    }else if(pilihPembayaran == 4){
                        System.out.print("Silakan masukkan nomor telepon Anda : ");
                        long nomorTelepon = input.nextLong();
                        System.out.println("1. 50.000");
                        System.out.println("2. 75.000");
                        System.out.println("3. 100.000");
                        System.out.println("4. Keluar");
                        System.out.print("Silakan pilih nominal pulsa (nomor 1-3) : ");
                        int nominalPulsa = input.nextInt();
                        boolean pilihNominal = true;
                        while(pilihNominal){
                            if(nominalPulsa == 1){
                                System.out.println("1. Ya");
                                System.out.println("2. Tidak");
                                System.out.print("Apakah Anda yakin ingin melanjutkan pembelian tersebut? (pilih nomor 1-2) : ");
                                int pilih = input.nextInt();
                                boolean pilih2 = true;
                                while(pilih2){
                                    if(pilih == 1){
                                        System.out.println("Transaksi Anda berhasil");
                                        System.out.println("1. Ya");
                                        System.out.println("2. Tidak");
                                        System.out.print("Cetak Bukti Transaksi? (pilih nomor 1-2) : ");
                                        int bukti = input.nextInt();
                                        boolean bukti2 = true;
                                        while(bukti2){
                                            if(bukti == 1){
                                                System.out.println("\nBUKTI TRANSAKSI");
                                                System.out.println("Pembelian Pulsa: Rp 50.000\n");
                                                bukti2 = false;
                                                pilih2 = false;
                                                pilihNominal = false;
                                            }else if(bukti == 2){
                                                System.out.println("Selesai\n");
                                                bukti2 = false;
                                                pilih2 = false;
                                                pilihNominal = false;
                                            }else{
                                                System.out.println("Maaf kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                                            }
                                        }
                                    }else if(pilih == 2){
                                        pilih2 = false;
                                        pilihNominal = false;
                                    }else{
                                        System.out.println("Maaf kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                                    }
                                }
                            }else if(nominalPulsa == 2){
                                System.out.println("1. Ya");
                                System.out.println("2. Tidak");
                                System.out.print("Apakah Anda yakin ingin melanjutkan pembelian tersebut? (pilih nomor 1-2) : ");
                                int pilih = input.nextInt();
                                boolean pilih2 = true;
                                while(pilih2){
                                    if(pilih == 1){
                                        System.out.println("Transaksi Anda berhasil");
                                        System.out.println("1. Ya");
                                        System.out.println("2. Tidak");
                                        System.out.print("Cetak Bukti Transaksi? (pilih nomor 1-2) : ");
                                        int bukti = input.nextInt();
                                        boolean bukti2 = true;
                                        while(bukti2){
                                            if(bukti == 1){
                                                System.out.println("\nBUKTI TRANSAKSI");
                                                System.out.println("Pembelian Pulsa: Rp 75.000\n");
                                                bukti2 = false;
                                                pilih2 = false;
                                                pilihNominal = false;
                                            }else if(bukti == 2){
                                                System.out.println("Selesai\n");
                                                bukti2 = false;
                                                pilih2 = false;
                                                pilihNominal = false;
                                            }else{
                                                System.out.println("Maaf kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                                            }
                                        }
                                    }else if(pilih == 2){
                                        pilih2 = false;
                                        pilihNominal = false;
                                    }else{
                                        System.out.println("Maaf kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                                    }
                                }
                            }else if(nominalPulsa == 3){
                                System.out.println("1. Ya");
                                System.out.println("2. Tidak");
                                System.out.print("Apakah Anda yakin ingin melanjutkan pembelian tersebut? (pilih nomor 1-2) : ");
                                int pilih = input.nextInt();
                                boolean pilih2 = true;
                                while(pilih2){
                                    if(pilih == 1){
                                        System.out.println("Transaksi Anda berhasil");
                                        System.out.println("1. Ya");
                                        System.out.println("2. Tidak");
                                        System.out.print("Cetak Bukti Transaksi? (pilih nomor 1-2) : ");
                                        int bukti = input.nextInt();
                                        boolean bukti2 = true;
                                        while(bukti2){
                                            if(bukti == 1){
                                                System.out.println("\nBUKTI TRANSAKSI");
                                                System.out.println("Pembelian Pulsa: Rp 100.000\n");
                                                bukti2 = false;
                                                pilih2 = false;
                                                pilihNominal = false;
                                            }else if(bukti == 2){
                                                System.out.println("Selesai\n");
                                                bukti2 = false;
                                                pilih2 = false;
                                                pilihNominal = false;
                                            }else{
                                                System.out.println("Maaf kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                                            }
                                        }
                                    }else if(pilih == 2){
                                        pilih2 = false;
                                        pilihNominal = false;
                                    }else{
                                        System.out.println("Maaf kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                                    }
                                }
                            }else if(nominalPulsa == 4){
                                pilihNominal = false;
                            }else{
                                System.out.println("Maaf kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                            }
                        }
                    }else if(pilihPembayaran == 5){
                        transaksi = false;
                    }else{
                        System.out.println("Maaf kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                    }
                }else if(jenisTransaksi == 3){
                    transaksi = false;
                    loop = false;
                }else{
                    System.out.println("Maaf, Kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali");
                }
            }
        }
    }
}

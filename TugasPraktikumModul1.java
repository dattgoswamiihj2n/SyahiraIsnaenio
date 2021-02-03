//Program menghitung keliling 3/4 lingkaran
package com.example;

public class Keliling_Tiga_per_Empat_Lingkaran {
    public static void main(String[] args) {
        String[][] identitas = {
                {"Fariz Wildan Meiawan", "Muhammad Ridwan", "Rahmat Mukhalin", "Syahira Isnaeni Dewi"},
                {"(21120120130074)", "(21120120140149)", "(21120120130062)", "(21120120130084)"},
                {"Kelompok : 29"},
                {"Shift : 2"}
        };

        float keliling;
        int diameter = 28;
        int jari_jari = diameter/2;
        float phi = 3.14f;

        keliling = (2 * 3 * phi * jari_jari)/4 +  (2 * jari_jari);

        System.out.println("Nama : ");
        System.out.println(identitas[0][0] + identitas[1][0]);
        System.out.println(identitas[0][1] + identitas[1][1]);
        System.out.println(identitas[0][2] + identitas[1][2]);
        System.out.println(identitas[0][3] + identitas[1][3]);
        System.out.println(identitas[2][0]);
        System.out.println(identitas[3][0]);

        System.out.println("======================================");
        System.out.println();

        System.out.println("Diameter lingkaran = " + diameter);
        System.out.println("Keliling 3/4 lingkaran = " + keliling);

    }
}

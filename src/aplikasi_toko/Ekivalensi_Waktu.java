/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_toko;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ekivalensi_Waktu {

    public static void main(String[] args) {
        int detik, hari, jam, menit;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan bilangan dalam detik : ");
        detik = scan.nextInt();
        if (detik >= 86400) {
            hari = detik / 86400;
        } else {
            hari = 0;
        }
        if (detik >= 3600) {
            jam = detik / 3600;
        } else {
            jam = 0;
        }
        if (detik >= 60) {
            menit = detik / 60;
        } else {
            menit = 0;
        }

        System.out.print(hari + " Hari, " + jam + " Jam, " + menit + " Menit, " + detik + " detik\n");
    }
}

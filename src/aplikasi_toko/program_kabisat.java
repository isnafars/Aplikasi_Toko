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
public class program_kabisat {

    public static void main(String[] args) {
        int tahun;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan tahun : ");
        tahun = scan.nextInt();
        if (tahun % 400 == 0) {
            System.out.print(tahun + " Merupakan Tahun Kabisat\n");
        } else if (tahun % 100 == 0) {
            System.out.print(tahun + " Bukan Tahun Kabisat\n");
        } else if (tahun % 4 == 0) {
            System.out.print(tahun + " Merupakan Tahun Kabisat\n");
        } else {
            System.out.print(tahun + " Bukan Tahun Kabisat\n");
        }

    }
}

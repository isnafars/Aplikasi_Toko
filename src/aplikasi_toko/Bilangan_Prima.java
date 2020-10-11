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
public class Bilangan_Prima {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukan sebuah bilangan :");
        int bil = masukan.nextInt();
        boolean prima = true;
        for (int i = 2; i < bil; i++) {

            if ((bil % i) == 0) {

                prima = false;
                break;

            }
        }
        if (prima) {
            System.out.println(bil + " adalah bilangan PRIMA ");
        } else {
            System.out.println(bil + " adalah bukan bilangan PRIMA ");
        }
    }
}

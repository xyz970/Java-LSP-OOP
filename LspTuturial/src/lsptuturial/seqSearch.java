/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsptuturial;

import java.util.Scanner;

/**
 *
 * @author Muhammad Adi Saputro
 */
public class seqSearch {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] listAngka = {5,9,2,8,10};
        
        System.out.print("Masukkan angkka cari: ");
        int cari = scan.nextInt();
        Sequential(listAngka, cari);
    }
    
    public static void Sequential(int[] listAngka, int angkaCari){
//        angkaCari = -1;
        int index = -1;
        for (int i = 0; i < listAngka.length; i++) {
            if (listAngka[i] == angkaCari) {
                index = i;
                break;
            }
        }
        if (index==-1) {
            System.out.print("Angka tidak ditemukan, Angka pencarian "+angkaCari);
        } else {
            System.out.print("Angka ditemukan di index ke-"+index+", Angka pencarian "+angkaCari);
        }
    }
    
}

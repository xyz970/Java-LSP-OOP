package lsptuturial;

import java.util.Scanner;

public class bilanganGanjilGenap {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = scan.nextInt();
        
        if (angka % 2 == 0) {
            System.out.println("Angka ini  genap "+"Angka: "+angka);
        }else{
        System.out.println("Angka ini  ganjil "+"Angka: "+angka);
            
        }
        
    }
}

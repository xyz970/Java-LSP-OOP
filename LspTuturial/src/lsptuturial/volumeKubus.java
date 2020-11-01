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
public class volumeKubus {
    static int LuasPersegi(int sisi){
            int luas = sisi*sisi;
            return luas;
        }
    static int VolumeKubus(int luasPersegi){
        int volume = luasPersegi * 6;
        return volume;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int sisi;
//        int LuasPersegi;
//        float VolumeKubus;
        System.out.print("Masukkan nilai sisi: ");
        sisi = scan.nextInt();
       System.out.println("Luas Persegi : "+LuasPersegi(sisi));
       System.out.println("Volume Kubus : "+LuasPersegi(sisi));
        
    }
    
}

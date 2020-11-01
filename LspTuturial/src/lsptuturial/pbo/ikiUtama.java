package lsptuturial.pbo;
import java.util.*;

public class ikiUtama {
    
    public static void main(String[] args) {
//        manusia Manusia = new manusia();
//lakiLaki laki = new lakiLaki(0);
        Scanner inputan = new Scanner(System.in);
        manusia[] manusia = new manusia[2];
        
        String[] teman = {"Linda","Kiki","Yozza","Bagus"};
        System.out.println(teman[2]);
        for (int i = 0; i < 2; i++) {
            System.out.println("User "+i+1);
            System.out.print("Masukkan tinggi badan (cm): ");
            int tinggiBadan = inputan.nextInt();
            System.out.print("Masukkan Jenis Kelamin(L/P): ");
            String kelamin = inputan.next();
            
            if (kelamin.toUpperCase().equals("L")) {
                manusia[i] = new lakiLaki(tinggiBadan);
                System.out.print("Berat badan ideal laki laki : "+manusia[i].BeratBadanIdeal());
                System.out.println();
                
            } else if(kelamin.toUpperCase().equals("P")){
                 manusia[i] = new perempuan(tinggiBadan);
                System.out.print("Berat badan ideal Perempuan : "+manusia[i].BeratBadanIdeal());
                System.out.println();
                
            }else{
                System.exit(0);
            }
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsptuturial.pbo;

/**
 *
 * @author Muhammad Adi Saputro
 */
public class lakiLaki extends manusia{

    public lakiLaki(int TB) {
        super(TB);
    }
    
    @Override
    public double BeratBadanIdeal(){
        return(super.getTinggiBadan()-100)*0.9; 
    }
//    manusia Manusia = new manusia();
//    public lakiLaki()
    
}

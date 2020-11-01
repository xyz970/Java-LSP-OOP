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
public class perempuan extends manusia{
    
    public perempuan(double TB) {
        super(TB);
    }
    @Override
    public double BeratBadanIdeal(){
        return(super.getTinggiBadan()-100)*0.8; 
    }
    
}

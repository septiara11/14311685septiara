/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Big_Cat;

/**
 *
 * @author User
 */
public class Harimau extends Hewan{
   
    
    public void tampilkan(){
        
       String jenisHewan="karnivora";
       
       
       Hewan a=new Hewan();
       a.inputData("harimau","daging","darat","kaki");
        a.tampilkanData();
        
        System.out.println("jenisHewan:"+jenisHewan);
        
    }
}

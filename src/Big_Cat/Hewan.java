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
public class Hewan {
    String nama;
    String makanan;
    String habitat;
    String caraBergerak;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getCaraBergerak() {
        return caraBergerak;
    }

    public void setCaraBergerak(String caraBergerak) {
        this.caraBergerak = caraBergerak;
    }
    public void tampilkanData(){
        System.out.println("nama hewan :"+getNama());
        System.out.println("jenis makanan :"+getMakanan());
        System.out.println("habitat :"+getHabitat());
        System.out.println("bergerak menggunakan :"+getCaraBergerak());
    }
    public void inputData(String nh,String m,String h,String bm){
        setNama(nh);
        setMakanan(m);
        setHabitat(h);
        setCaraBergerak(bm);
    }
}

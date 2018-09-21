/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class Employ extends Person {
    private String noKaryawan;
    //Konstruktor
    public Employ(String noKaryawan, String nama, int usia) {
        super(nama, usia);
        this.noKaryawan = noKaryawan;
        
    }
    //Metode
    public void info(){
       System.out.println("No. Karyawan : " + this.noKaryawan);
       super.info();
    }
    
}

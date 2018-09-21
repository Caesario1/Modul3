/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author WINDOWS 10
 */
public class DemoOverride2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        B obj = new B();
        obj.setA(50);
        obj.setB(150);
        //Akan memanggil method yang terdapat pada kelas B
        obj.tampilkanNilai();
    }
    
}

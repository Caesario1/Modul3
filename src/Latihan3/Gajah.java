/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author WINDOWS 10
 */
public class Gajah extends Hewan{
    public static void testClassMethod() {
        System.out.println("The Class Method in hewan ... ");
    }

    //meng-override method pada class Animal
    public void testInstanceMethod() {
        System.out.println("The Instance Method in Gajah ... ");
    }

    public static void main(String[] args) {
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();
        Gajah.testClassMethod();
        myHewan.testInstanceMethod();
        Hewan.testClassMethod();
    }
    
}

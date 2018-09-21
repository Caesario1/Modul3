/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author WINDOWS 10
 */
public class MountainTruck extends Truck{
      //The MountainTruck subclass add one field
    public int seatHeight;

    //The MountainTruck subclass has one contructor
    public MountainTruck(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // The MountainTruck subclass add one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public static void main(String[] aku) {
        System.out.println("Mulai Berjalan");
        MountainTruck MB = new MountainTruck(0, 0, 0, 0);
        System.out.println("Gear : " + MB.gear);
        System.out.println("Speed : " + MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("Gear : " + MB.gear);
        System.out.println("Speed : " + MB.speed);
        MB.speedUp(2);
        System.out.println("Gear : " + MB.gear);
        System.out.println("Speed : " + MB.speed);
    }
    
}

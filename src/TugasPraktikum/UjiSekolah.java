/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.io.*;
public class UjiSekolah 
{
    public static String bacainput ()
    {
        String baca="";
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader (input);
        
        try //Jika Kondisi Benar
        {baca = buf.readLine();}
        catch (IOException e) //Jika Kondisi Salah
        {System.out.println("Salah !");
        }
        return baca; // nilai balik
        
    }
    public static void main (String[] args)
    {
        //Pembuatan Objek Baru
        Sekolah s1 = new Sekolah();
        Produktif s2 = new Produktif();
        Adaptif s3 = new Adaptif();
        Normatif s4 = new Normatif();
        Exit s5 = new Exit();
        int menu;//deklarasi variabel menu
        
        do//Perulangan
        {
            s1.Sekolah();//Pemanggilan Objek
            menu=Integer.parseInt (bacainput());//Mengambil Imputan
            switch (menu) //Pilihan menu
            {
                case 1://Pilihan Menu 1
                    s2.Produktif();//Pemanggilan Objek
                    break;//Keluar dari case
                case 2://Pilihan Menu 2
                    s3.Adaptif();//Pemanggilan Objek
                    break;//keluar dari case
                case 3://Pilihan Menu 3
                    s4.Normatif();//Pemanggilan Objek
                    break;//Keluar dari case
                case 4://Pilihan Menu 4
                    s5.Exit();//Pemanggilan Objek
                    break;//Keluar dari case
                    //Jika kondisi salah atau tidak sesuai
                default : System.out.println("Pilihan tidak tersedia");
            }
        }
        while (true); //memberi nilai pada perulangan
    }
    
}

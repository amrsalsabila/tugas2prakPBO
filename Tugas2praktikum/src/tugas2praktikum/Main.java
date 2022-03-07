/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2praktikum;

import java.util.Scanner;

/**
 *
 * @author Amara Salsabila
 */
public class Main {
   static int pilih;
    public static void main(String[] args){
        boolean ulang = false;
        double p,l,t,r, tinggi;
        int pilih = 0;
        int i = 0;
        Scanner input = new Scanner (System.in);
        do{
        System.out.println("Menu : ");
        System.out.println("1. Balok");
        System.out.println("2. Tabung");
        System.out.println("0. Keluar");
        System.out.print("Pilih : "); pilih = input.nextInt();
        
        if(pilih == 1){
            System.out.print("Masukkan panjang : "); p = input.nextDouble();
            System.out.print("Masukkan lebar : "); l = input.nextDouble();
            System.out.print("Masukkan tinggi : "); t = input.nextDouble();
            
            Balok balok = new Balok(p,l,t);
            System.out.println("Luas persegi panjang : " + balok.luas());
            System.out.println("Keliling persegi panjang : " + balok.keliling());            
            System.out.println("Volume Balok : " + balok.volume());
            System.out.println("Luas permukaan balok : " + balok.luasPermukaan());

        }
        else if(pilih == 2){
            System.out.print("Masukkan tinggi : "); tinggi = input.nextDouble();
            System.out.print("Masukkan jari-jari : "); r = input.nextDouble();
            
            Tabung tabung = new Tabung (r, tinggi);
            System.out.println("Luas lingkaran : " + tabung.luas());
            System.out.println("Keliling lingkaran : " + tabung.keliling());            
            System.out.println("Volume Tabung : " + tabung.volume());           
            System.out.println("Luas permukaan Tabung : " + tabung.luasPermukaan());

        }
         else if (pilih==0){
        i=1;
        System.exit(0);   
        }
        }while(i==0);
    }  
    }
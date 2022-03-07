/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2praktikum;

/**
 *
 * @author Amara Salsabila
 */
public class Tabung extends Lingkaran implements MenghitungRuang {
    
    double tinggi;
    double phi = 3.14;
    double jariJari;

    public Tabung(double jariJari, double tinggi) {
        this.setJariJari(jariJari);
        this.tinggi = tinggi;
    }
    

    @Override
    public double volume() {
        return volume(this.luas(),this.tinggi);
    }
    
    public double volume(double luas, double tinggi){
        return luas*tinggi;
    }

    @Override
    public double luasPermukaan() {
        return luasPermukaan(this.luas(),this.keliling(),this.tinggi);
    }
    
    public double luasPermukaan(double luas, double keliling, double tinggi)
    {  
        return (2*luas)+(keliling * tinggi);  
    }
    }
    
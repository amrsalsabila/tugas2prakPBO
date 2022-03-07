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
public class Balok extends PersegiPanjang implements MenghitungRuang{

    double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume() {
        return volume(this.getPanjang(),this.getLebar(),this.tinggi);
    }
    
    public double volume(double panjang, double lebar, double tinggi){
        return panjang*lebar*tinggi;
    }

    @Override
    public double luasPermukaan() {
        return luasPermukaan(this.getPanjang(), this.getLebar(), this.tinggi);
    }
    
    public double luasPermukaan(double panjang, double lebar, double tinggi){
        return 2*((panjang*lebar)+(lebar*tinggi)+(panjang*tinggi));
    }
    
    

}

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
public class PersegiPanjang implements MenghitungBidang {
    private double panjang, lebar;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double keliling() {
        return keliling(this.panjang, this.lebar);
    }
    
    public double keliling(double panjang, double lebar){
        return 2*(panjang+lebar);
    }

    @Override
    public double luas() {
        return luas(this.panjang, this.lebar);
    }
    
    public double luas(double panjang, double lebar){
        return panjang*lebar;
    }

    
    
}
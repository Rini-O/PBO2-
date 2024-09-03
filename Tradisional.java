/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Secondly;

import Kedua.Tari;

/**
 *
 * @author acer_user
 */
public class Tradisional extends Tari {
 private String Teknik;
 private int jumlahPenari;

 
    /**
     * @return the Teknik
     */
 public Tradisional(){
     System.out.println("Tari Tradisional merupakan salah satu Jenis Tari ");
     this.setTeknik("Teknik Dasar");
     this.setJumlahPenari(9);
 }
 
    public String getTeknik() {
        return Teknik;
    }
    /**
     * @param Teknik the Teknik to set
     */
    public void setTeknik(String Teknik) {
        this.Teknik = Teknik;
    }

    /**
     * @return the jumlahPenari
     */
    public int getJumlahPenari() {
        return jumlahPenari;
    }

    /**
     * @param jumlahPenari the jumlahPenari to set
     */
    public void setJumlahPenari(int jumlahPenari) {
        this.jumlahPenari = jumlahPenari;
    }
    
   
    
    
}

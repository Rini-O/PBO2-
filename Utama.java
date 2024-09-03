/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Secondly;

/**
 *
 * @author acer_user
 */
public class Utama {

    public static void main(String[] args) {
        Tradisional Jaipong = new Tradisional(); //KONSTRUKTOR
        System.out.println("Ciri khas Tari Tradisional");
        System.out.println("Tari Remo menggunakan teknik : " + Jaipong.getTeknik());
        System.out.println("Jumlah Penarinya sebanyak : " + Jaipong.getJumlahPenari());
        System.out.println(" ");

        Remo Putra = new Remo();
        System.out.println("Ciri Khas Tari Remo Putra");
        System.out.println("Tari Remo Putra menggunakan atribute : " + Putra.getAtribut());
        System.out.println("Variasi Tari Remo adalah : " + Putra.getVariasi());

        System.out.println(" ");
        Tradisional tradisionalKeRemo = (Tradisional) Putra;
        tradisionalKeRemo.setJumlahPenari(1);
        tradisionalKeRemo.setTeknik("Meleyot");
        System.out.println("Tradisional dari Remo setelah Casting:");
        System.out.println("Teknik : " + tradisionalKeRemo.getTeknik());
        System.out.println("Jumlah Penari: " + tradisionalKeRemo.getJumlahPenari());
        System.out.println("");

        System.out.println(" ");
        Remo remoKeTradisional = (Remo) Putra;
        remoKeTradisional.setAtribut("Selempang");
        remoKeTradisional.setJumlahPenari(1);
        System.out.println("Remo ke Tradisional setelah Casting:");
        System.out.println("Atribut :" + remoKeTradisional.getAtribut());
        System.out.println("Jumlah Penari: " + remoKeTradisional.getJumlahPenari());
        System.out.println("");

        //INTERFACE
        Penari Dancer = new Penari("Raihan");
        Dancer.gerakan();
        Dancer.praktek();
        Dancer.tampil();
        
        Penari Vina = new Penari("Vina");
        Vina.tes();
    }
}

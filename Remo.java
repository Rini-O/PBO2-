/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Secondly;

/**
 *
 * @author acer_user
 */
public class Remo extends Tradisional {
    private String Atribut;
    private String Variasi;

    
    
    public Remo(){ //KONSTRUKTOR
        System.out.println(" Tari Remo merupakan salah satu contoh Tari Tradisional");
        this.setAtribut("Gelang Kaki");
        this.setVariasi(" Remo Boletan ");
        super.setJumlahPenari(1);
        super.setTeknik("Gedruk");
    }
    /**
     * @return the Atribut
     */
    public String getAtribut() {
        return Atribut;
    }

    /**
     * @param Atribut the Atribut to set
     */
    public void setAtribut(String Atribut) {
        this.Atribut = Atribut;
    }

    /**
     * @return the Variasi
     */
    public String getVariasi() {
        return Variasi;
    }

    /**
     * @param Variasi the Variasi to set
     */
    public void setVariasi(String Variasi) {
        this.Variasi = Variasi;
    }
    
    public void gaya(){
        System.out.println("gaya remo ya boombastis side eye");
    }
}

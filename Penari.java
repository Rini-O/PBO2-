/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Secondly;

/**
 *
 * @author acer_user
 */
public class Penari extends Remo implements Menari, Latihan, Perform {

    public Penari(String nama) {
        System.out.println("Penari bernama " + nama);
    }

    @Override
    public void gerakan() {
        System.out.println("Penari melakukan gerakan tarian Remo.");
        this.setAtribut("gelang");
        super.setJumlahPenari(4);

    }

   

    @Override
    public void praktek() {
        System.out.println("Penari sedang praktek tarian Remo.");
    }

    @Override
    public void tampil() {
        System.out.println("Penari tampil di atas panggung.");
    }

    public void gaya() {
        System.out.println("Tradisional gaya nya ya beda ");
    }
    public void tes() {
        this.gaya();
        super.gaya();
    }
}

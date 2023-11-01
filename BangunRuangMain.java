/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geometri;

/**
 *
 * @author lenovo
 */
public class BangunRuangMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Balok balok = new Balok(12.5, 10.2, 5.0);

        // Membuat objek Kubus dengan sisi
        Kubus kubus = new Kubus(8.8);

        // Menghitung volume dan luas permukaan objek Balok
        System.out.println("Balok:");
        System.out.println("Volume: " + balok.hitungVolume() + " cm^3");
        System.out.println("Luas Permukaan: " + balok.hitungLuasPermukaan() + " cm^2");

        // Menghitung volume dan luas permukaan objek Kubus
        System.out.println("Kubus:");
        System.out.println("Volume: " + kubus.hitungVolume() + " cm^3");
        System.out.println("Luas Permukaan: " + kubus.hitungLuasPermukaan() + " cm^2");
    }
}

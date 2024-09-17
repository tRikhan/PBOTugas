/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil (Tesla Cybertruck)
        Mobil teslaCybertruck = new Mobil("Tesla Cybertruck", 210, "Elektrik", 4);
        
        // Membuat objek SepedaMotor (Yamaha NMax)
        SepedaMotor yamahaNMax = new SepedaMotor("Yamaha NMax", 120, "Bensin", true);
        
        // Menampilkan informasi mobil
        System.out.println("Informasi Mobil:");
        teslaCybertruck.tampilkanInfo();
        
        System.out.println(); // Baris kosong untuk pemisah output
        
        // Menampilkan informasi sepeda motor
        System.out.println("Informasi Sepeda Motor:");
        yamahaNMax.tampilkanInfo();
    }
}
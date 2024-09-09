/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package SoalModul3;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Mobil Tesla = new Mobil("Tesla", "Cybertruck", 2024, "Hitam");
        Tesla.startEngine(); // Panggil startEngine untuk Tesla
        Tesla.displayInfo();  // Tampilkan info Tesla
        
        System.out.println(); // Pemisah antara kedua object
        
        // Membuat object kedua
        Mobil Toyota = new Mobil("Toyota", "Fortuner", 2022, "Putih");
        Toyota.startEngine();  // Panggil startEngine untuk Toyota
        Toyota.displayInfo();  // Tampilkan info Toyota
        
        // Mengubah warna mobil Toyota
        Toyota.setWarna("Merah");
        System.out.println("Setelah diubah:");
        Toyota.displayInfo(); // Tampilkan info setelah warna diubah
    }
}

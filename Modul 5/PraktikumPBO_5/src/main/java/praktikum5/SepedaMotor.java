/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASUS
 */
public class SepedaMotor extends Kendaraan {
    private boolean adaBox;

    // Konstruktor
    public SepedaMotor(String nama, int kecepatanMaks, String jenisMesin, boolean adaBox) {
        super(nama, kecepatanMaks, jenisMesin); // Memanggil constructor dari kelas induk
        this.adaBox = adaBox;
    }

    // Overriding method tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        // Menambahkan informasi spesifik untuk SepedaMotor
        System.out.println("Apakah ada Box      :" + (adaBox ? "Ya" : "Tidak"));
    }
}
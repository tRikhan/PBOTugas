/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASUS
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu; // Atribut tambahan khusus untuk mobil
    
    //constructor
    public Mobil (String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin); // Memanggil constructor dari kelas induk
        this.jumlahPintu = jumlahPintu;
    }
    
    public void tampilkanInfoMobil() {
        System.out.println("Kecepatan Maksimum Mobil :" + kecepatanMaks + " km/h");
        System.out.println("Jumlah Pintu             :" + jumlahPintu);
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        // Menambahkan informasi spesifik untuk Mobil
        System.out.println("Jumlah Pintu        :" + jumlahPintu);
    }

}
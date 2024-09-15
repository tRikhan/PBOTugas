/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu; // Atribut tambahan khusus untuk mobil
    
    //constructor
    public Mobil (String merek, String model, int tahun, String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(merek, model, tahun, nama, kecepatanMaks, jenisMesin); // Memanggil constructor dari kelas induk
        this.jumlahPintu = jumlahPintu;
    }
    
    public void tampilkanInfoMobil() {
        // Dapat mengakses kecepatanMaks karena protected
        System.out.println("Kecepatan Maksimum Mobil :" + kecepatanMaks + " km/h");
        System.out.println("Jumlah Pintu             :" + jumlahPintu);
    }
}

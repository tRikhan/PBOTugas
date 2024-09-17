/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul5;

/**
 *
 * @author ASUS
 */
public class Hewan {
    protected String nama;
    protected String jenis;

    // Konstruktor
    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    // Metode untuk menampilkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("Nama Hewan   : " + nama);
        System.out.println("Jenis Hewan  : " + jenis);
    }

    // Metode placeholder untuk suara hewan
    public void suara() {
        System.out.println("Hewan ini memiliki suara khas.");
    }
}
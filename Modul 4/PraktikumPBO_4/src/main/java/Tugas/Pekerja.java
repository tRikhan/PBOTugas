/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author pc
 */
public class Pekerja extends Manusia {
    // Atribut tambahan
    private double gaji;

    // Konstruktor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        // Memanggil konstruktor superclass (Manusia)
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    // Getter untuk gaji
    public double getGaji() {
        return gaji;
    }

    // Setter untuk gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override metode toString() untuk menampilkan semua informasi pekerja
    @Override
    public String toString() {
        return "Nama       : " + getNama() + "\n" +
               "Usia       : " + usia + "\n" +
               "Pekerjaan  : " + pekerjaan + "\n" +
               "Gaji       : " + gaji;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul12;

/**
 *
 * @author ASUS
 */
import java.io.Serializable;

public class Buku implements Serializable {
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul + ", Pengarang: " + pengarang + ", Tahun Terbit: " + tahunTerbit);
    }
    
    @Override
    public String toString() {
        return judul + ";" + pengarang + ";" + tahunTerbit;
    }
}
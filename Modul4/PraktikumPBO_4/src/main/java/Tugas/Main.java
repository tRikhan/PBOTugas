/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author pc
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Pekerja
        Pekerja pekerja = new Pekerja("Amba", 30, "Streamer", 6900000);

        // Menampilkan informasi pekerja
        System.out.println("Informasi Pekerja Awal:");
        System.out.println(pekerja.toString());

        // Mengubah nama pekerja
        pekerja.setNama("Faiz");

        // Menampilkan ulang informasi pekerja
        System.out.println("\nInformasi Pekerja Setelah Mengubah Nama:");
        System.out.println(pekerja.toString());
    }
}
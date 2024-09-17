/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul5;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek berbagai hewan mamalia dan unggas
        Kucing kucing = new Kucing("Gunawan");
        Anjing anjing = new Anjing("Anjim Rahardian");
        Sapi sapi = new Sapi("Sapira");
        Ayam ayam = new Ayam("Ambayam");
        Bebek bebek = new Bebek("Faiz Bebek");

        // Menampilkan informasi setiap hewan
        System.out.println("Informasi Kucing:");
        kucing.tampilkanInfo();

        System.out.println("\nInformasi Anjing:");
        anjing.tampilkanInfo();

        System.out.println("\nInformasi Sapi:");
        sapi.tampilkanInfo();

        System.out.println("\nInformasi Ayam:");
        ayam.tampilkanInfo();

        System.out.println("\nInformasi Bebek:");
        bebek.tampilkanInfo();
    }
}
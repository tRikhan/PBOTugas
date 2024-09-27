/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul6;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat produk
        Produk buku = new Buku("Java Programming", 100000);
        Produk elektronik = new Elektronik("Laptop", 5000000);
        Produk pakaian = new Pakaian("Jaket", 300000);
        
        // Membuat keranjang belanja dan menambahkan produk
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(buku, elektronik, pakaian);
        
        // Menghitung total harga setelah diskon
        System.out.println("Total harga setelah diskon: Rp " + keranjang.hitungTotalHargaSetelahDiskon());
    }
}
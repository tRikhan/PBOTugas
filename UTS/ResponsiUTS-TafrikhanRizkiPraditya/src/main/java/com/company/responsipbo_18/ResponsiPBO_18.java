/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.company.responsipbo_18;

/**
 *
 * @author ASUS
 */
import Barang.*;
import Pegawai.*;

public class ResponsiPBO_18 {
    public static void main(String[] args) {
        // Membuat objek Elektronik dan Makanan
        Produk produk1 = new Elektronik("Kartu Grafis RTX 3090 TI Super", 9900000, 5);
        Produk produk2 = new Makanan("Permen Karet", 5000, "2077-06-18");

        // Membuat objek PegawaiTetap dan PegawaiKontrak
        Pegawai pegawai1 = new PegawaiTetap("Tafrikhan", 6000000, 9000000);
        Pegawai pegawai2 = new PegawaiKontrak("Amba Tublast", 3000000, 48);

        // Menampilkan informasi produk dan pegawai
        System.out.println("Output Produk");
        produk1.tampilkanInfo();
        System.out.println();

        System.out.println("Output Pegawai");
        pegawai1.tampilkanInfo();
        System.out.println();

        System.out.println("Output Polimorfisme");
        produk2.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
    }
}
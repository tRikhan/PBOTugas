/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul11;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Pengarang
        Pengarang pengarang1 = new Pengarang("Hambali");
        Pengarang pengarang2 = new Pengarang("Sutopo Sleep");
        Pengarang pengarang3 = new Pengarang("H. Slamet (ASLI)");

        // Membuat objek Buku dengan agregasi ke Pengarang
        Buku buku1 = new Buku("Cara Masak Indomie", pengarang1);
        Buku buku2 = new Buku("Cara Tidur Pulas", pengarang2);
        Buku buku3 = new Buku("Cara Membuat Bebek Goreng", pengarang3);

        // Membuat objek Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan(10);

        // Menambahkan Buku ke dalam Perpustakaan
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        // Menampilkan informasi semua buku di Perpustakaan
        perpustakaan.tampilkanInfoBuku();
    }
}

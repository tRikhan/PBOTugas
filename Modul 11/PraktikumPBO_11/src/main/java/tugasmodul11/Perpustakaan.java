/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul11;

/**
 *
 * @author ASUS
 */
class Perpustakaan {
    private Buku[] daftarBuku;
    private int jumlahBuku;

    public Perpustakaan(int kapasitas) {
        daftarBuku = new Buku[kapasitas];
        jumlahBuku = 0;
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
        } else {
            System.out.println("Tidak dapat menambah buku, kapasitas perpustakaan penuh.");
        }
    }

    public void tampilkanInfoBuku() {
        System.out.println("Daftar Buku di Perpustakaan:");
        for (int i = 0; i < jumlahBuku; i++) {
            daftarBuku[i].infoBuku();
            System.out.println();
        }
    }
}
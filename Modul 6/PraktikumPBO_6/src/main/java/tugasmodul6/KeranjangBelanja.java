/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul6;

/**
 *
 * @author ASUS
 */
class KeranjangBelanja {
    private Produk produk1;
    private Produk produk2;
    private Produk produk3;

    // Menambahkan produk ke keranjang
    public void tambahProduk(Produk p1, Produk p2, Produk p3) {
        this.produk1 = p1;
        this.produk2 = p2;
        this.produk3 = p3;
    }

    // Menghitung total harga setelah diskon
    public double hitungTotalHargaSetelahDiskon() {
        double total = produk1.getHargaSetelahDiskon()
                     + produk2.getHargaSetelahDiskon()
                     + produk3.getHargaSetelahDiskon();
        return total;
    }
}
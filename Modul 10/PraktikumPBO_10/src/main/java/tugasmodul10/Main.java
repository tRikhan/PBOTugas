/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul10;

/**
 *
 * @author pc
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Elektronik
        Elektronik ram = new Elektronik("RAM DDR4 16GB", 1500000);
        Elektronik processor = new Elektronik("Processor Intel i7", 3000000);
        
        // Membuat objek Makanan
        Makanan burger = new Makanan("Burger Daging Kuda", 55000);
        Makanan pizza = new Makanan("Pizza Daging Unta", 95000);
        
        // Menampilkan hasil perhitungan untuk Elektronik
        System.out.println("=== Produk Elektronik ===");
        tampilkanDetailProduk(ram);
        tampilkanDetailProduk(processor);
        
        // Menampilkan hasil perhitungan untuk Makanan
        System.out.println("\n=== Produk Makanan ===");
        tampilkanDetailProduk(burger);
        tampilkanDetailProduk(pizza);
    }
    
    private static void tampilkanDetailProduk(Elektronik produk) {
        double pajak = produk.hitungPajak(produk.getHarga());
        double total = produk.getHarga() + pajak;
        
        System.out.println("Nama Produk: " + produk.getNama());
        System.out.println("Harga: Rp " + String.format("%,.0f", produk.getHarga()));
        System.out.println("Pajak (10%): Rp " + String.format("%,.0f", pajak));
        System.out.println("Total: Rp " + String.format("%,.0f", total));
        System.out.println();
    }
    
    private static void tampilkanDetailProduk(Makanan produk) {
        double pajak = produk.hitungPajak(produk.getHarga());
        double total = produk.getHarga() + pajak;
        
        System.out.println("Nama Produk: " + produk.getNama());
        System.out.println("Harga: Rp " + String.format("%,.0f", produk.getHarga()));
        System.out.println("Pajak (5%): Rp " + String.format("%,.0f", pajak));
        System.out.println("Total: Rp " + String.format("%,.0f", total));
        System.out.println();
    }
}
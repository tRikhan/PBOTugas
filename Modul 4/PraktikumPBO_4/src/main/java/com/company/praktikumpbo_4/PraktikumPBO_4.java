/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.company.praktikumpbo_4;

import praktikum4.Kendaraan;

/**
 *
 * @author ASUS
 */
public class PraktikumPBO_4 {

    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan("Cybertruck", "Tesla", 2077, "Mobil Low Poly", 777, "Sapto Engine v69");
        
        // Menampilkan data awal
        System.out.println("Merek           :" + mobil.getMerek());
        System.out.println("Model           :" + mobil.getModel());
        System.out.println("Tahun           :" + mobil.getTahun());
        System.out.println("Nama            :" + mobil.getNama());
        System.out.println("Kecepatan Max   :" + mobil.getKecepatan() + " KM/h");
        System.out.println("Jenis Mesin     :" + mobil.getMesin());
        }
}
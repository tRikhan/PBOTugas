/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul5;

/**
 *
 * @author ASUS
 */
public class Bebek extends HewanUnggas {

    public Bebek(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println("Suara Khas   : Kwek kwek!");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suara();
    }
}
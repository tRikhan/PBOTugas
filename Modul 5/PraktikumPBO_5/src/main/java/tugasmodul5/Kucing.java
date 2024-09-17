/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul5;

/**
 *
 * @author ASUS
 */
public class Kucing extends HewanMamalia {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println("Suara Khas   : Meong!");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suara();
    }
}
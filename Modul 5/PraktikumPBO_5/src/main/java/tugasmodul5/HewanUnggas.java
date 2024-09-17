/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul5;

/**
 *
 * @author ASUS
 */
public class HewanUnggas extends Hewan {

    public HewanUnggas(String nama) {
        super(nama, "Unggas");
    }

    // Overriding metode suara untuk unggas
    @Override
    public void suara() {
        System.out.println("Unggas ini biasanya berkokok atau berkwek.");
    }
}
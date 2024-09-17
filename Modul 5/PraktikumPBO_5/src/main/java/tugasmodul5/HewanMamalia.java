/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul5;

/**
 *
 * @author ASUS
 */
public class HewanMamalia extends Hewan {

    public HewanMamalia(String nama) {
        super(nama, "Mamalia");
    }

    // Overriding metode suara untuk mamalia
    @Override
    public void suara() {
        System.out.println("Mamalia ini memiliki suara yang berbeda-beda.");
    }
}
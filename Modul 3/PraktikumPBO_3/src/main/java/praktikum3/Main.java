/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Pace", 6);
        kucing.suara();
        kucing.info();
        
        Hewan anjing = new Hewan("Elas", 9);
        anjing.suara();
        anjing.info();
        anjing.berlari();
    }
}
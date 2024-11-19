/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12;

/**
 *
 * @author ASUS
 */
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileIOPractice {
    public static void main(String[] args) {
        String filePath = "data.txt";
        // Menulis data ke file
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Aku Sedang Membaca Buku Berjudul:\n");
            writer.write("Cara Tidur Pulas yang ditulis oleh Sutopo Sleep\n");
            System.out.println("Data berhasil ditulis ke file: " + filePath);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file.");
            e.printStackTrace();
        }
        
        // Membaca data dari file
        try (FileReader reader = new FileReader(filePath)) {
            int character;
            System.out.println("\nIsi file:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file.");
            e.printStackTrace();
        }
    }
}
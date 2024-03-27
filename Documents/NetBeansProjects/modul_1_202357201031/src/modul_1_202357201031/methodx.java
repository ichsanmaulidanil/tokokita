/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_1_202357201031;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class methodx {
 
    public double luas_lingkaran(int diameter) {
        int jari2 = diameter / 2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }
    
    public double volume_tabung(int diameter, int tinggi) {
        double luasAlas = luas_lingkaran(diameter);
        double volume = luasAlas * tinggi;
        return volume;
    }
    
    public double volume_kerucut(int diameter, int tinggi) {
        double jari2 = diameter / 2.0;
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(jari2, 2) * tinggi;
        return volume;
    }
    
    public double volume_bola(int diameter) {
        double jari2 = diameter / 2.0;
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jari2, 3);
        return volume;
    }

    public static void main(String[] args) {
        methodx mt = new methodx();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan diameter: ");
        int diameter = scanner.nextInt();

        System.out.println("Masukkan tinggi untuk tabung dan kerucut (jika tidak ada, masukkan 0): ");
        int tinggi = scanner.nextInt();

        double volumeTabung = mt.volume_tabung(diameter, tinggi);
        double volumeKerucut = mt.volume_kerucut(diameter, tinggi);
        double volumeBola = mt.volume_bola(diameter);

        System.out.println("Volume tabung: " + volumeTabung);
        System.out.println("Volume kerucut: " + volumeKerucut);
        System.out.println("Volume bola: " + volumeBola);

        scanner.close();
        System.exit(0);
    }
}


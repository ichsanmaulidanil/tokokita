/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_1_202357201031;

/**
 *
 * @author WINDOWS 10
 */
import javax.swing.JOptionPane;
public class bangun {
    public static double luasPersegiPanjang(double panjang,double lebar) {
        return panjang * lebar;
    }
    
    public static double luasSegitiga(double alas,double tinggi) {
        return 0.5 * alas * tinggi;
    }
    
    public static double luasLingkaran(double JariJari) {
        return Math.PI * Math.pow(JariJari, 2);
    }
    
    public static void main(String[] args) {
        
        double panjangPersegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("masukkan panjang persegi panjang:"));
        double lebarPersegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("masukkan lebar persegi panjang:"));
        double luasPersegiPanjang = luasPersegiPanjang(panjangPersegiPanjang,lebarPersegiPanjang);
        JOptionPane.showMessageDialog(null, "luas Persegi Panjang: " + luasPersegiPanjang);
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
        
        double alasSegitiga = Double.parseDouble(JOptionPane.showInputDialog("masukkan alas segitiga:"));
        double tinggiSegitiga = Double.parseDouble(JOptionPane.showInputDialog("masukkan tinggi segitiga:"));
        double luasSegitiga = luasSegitiga(alasSegitiga,tinggiSegitiga);
        JOptionPane.showMessageDialog(null, "luas Persegi Panjang: " + luasPersegiPanjang);
        System.out.println("Luas Segitiga: " + luasSegitiga);
    }
}


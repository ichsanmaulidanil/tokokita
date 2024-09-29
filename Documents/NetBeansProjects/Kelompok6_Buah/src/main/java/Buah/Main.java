/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buah;

/**
 *
 * @author WINDOWS 10
 */
public class Main {
    public static void main(String[] args) {
       Apel Al = new Apel();
       Al.setNama("Apel");
       Al.setRasa("Manis");
       Al.setTekstur("Bulat");
       Al.setUkuran("Sedang");
       Al.setWarna("Merah");
       
       String nama = Al.getNama();
       String rasa = Al.getRasa();
       String tekstur = Al.getTekstur();
       String ukuran = Al.getUkuran();
       String warna = Al.getWarna();
       
        
        System.out.println("\t\t\tBuah Jeruk");
        System.out.println("Nama Ilmiah  : " + Al.getNama());
        System.out.println("Rasa         : " + Al.getRasa());
        System.out.println("Tekstur      : " + Al.getTekstur());
        System.out.println("Ukuran       : " + Al.getUkuran());
        System.out.println("Warna        : " + Al.getWarna());
        
    }
    
}


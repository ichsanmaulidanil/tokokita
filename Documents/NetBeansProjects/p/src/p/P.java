/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p;

/**
 *
 * @author WINDOWS 10
 */
public class P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data[][] = {
            {4, 6, 4, 2, 8, 4, 2, 10},
            {4, 6, 4, 2, 8, 4, 2, 10}
        };
        
        // Hitung total jumlah elemen dalam array
        int total = 0;
        int jumlahElemen = 0;
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[0].length; b++) {
                total += data[a][b];
                jumlahElemen++;
            }
        }
        
        // Hitung nilai rata-rata
        double rataRata = (double) total / jumlahElemen;
        
        System.out.println("Nilai rata-rata dari array tersebut adalah: " + rataRata);
    }
    
}

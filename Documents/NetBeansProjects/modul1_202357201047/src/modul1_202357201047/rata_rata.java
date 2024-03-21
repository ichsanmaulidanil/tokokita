/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1_202357201047;

/**
 *
 * @author WINDOWS 10
 */
public class rata_rata {
     public static void main(String[] args) {
        int data[][] = {
            {4, 6, 4, 2, 8, 4, 2, 10},
            {4, 6, 4, 2, 8, 4, 2, 10}
        };
        
        double total = 0;
        double rata;
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[a].length; b++) {
                total += data[a][b];
            }
        }
        
        // Hitung nilai rata-rata
        rata = total / (data.length * data[0].length);
        
        System.out.println(rata);
    }
}
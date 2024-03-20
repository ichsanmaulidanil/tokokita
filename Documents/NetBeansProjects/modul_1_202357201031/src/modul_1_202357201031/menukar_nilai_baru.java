/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_1_202357201031;

import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class menukar_nilai_baru {
    public static void main(String[] args) {
        int data[][] = {
            {4, 6, 4, 2, 8, 4, 2, 10},
            {4, 6, 4, 2, 8, 4, 2, 10}
        };
        
        // Input indeks elemen yang ingin diubah nilai
        int baris = Integer.parseInt(JOptionPane.showInputDialog("Masukkan baris array:"));
        int kolom = Integer.parseInt(JOptionPane.showInputDialog("Masukkan kolom array:"));
        
        // Input nilai baru untuk ditukar
        int nilaiBaru = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai baru:"));
        // Tukar nilai pada posisi yang ditentukan
        data[baris][kolom] = nilaiBaru;
        // Tampilkan array setelah perubahan
        
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[0].length; b++) {
                System.out.print(data[a][b] +  " ");
            }
            System.out.println("\n");
        }
        
        int element = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length; j += 2) {
                element += data[i][j];
            }
        }
     System.out.println(element);
}
}

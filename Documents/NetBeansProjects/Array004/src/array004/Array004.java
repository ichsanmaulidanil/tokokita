/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array004;

/**
 *
 * @author WINDOWS 10
 */
import javax.swing.JOptionPane;
public class Array004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        
        // Input indeks elemen yang ingin diubah nilai
        int row = Integer.parseInt(JOptionPane.showInputDialog("Masukkan baris (indeks) array:"));
        int col = Integer.parseInt(JOptionPane.showInputDialog("Masukkan kolom (indeks) array:"));
        
        // Input nilai baru untuk ditukar
        int newValue = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai baru:"));
        
        // Tukar nilai pada posisi yang ditentukan
        data[row][col] = newValue;
        
        // Jumlah semua elemen yang memiliki indeks kolom ganjil
        int totalOddColElements = 0;
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[0].length; b++) {
                if (b % 2 != 0) { // Kolom ganjil
                    totalOddColElements += data[a][b];
                }
            }
        }
        
        // Tampilkan hasil jumlah elemen pada kolom ganjil
        JOptionPane.showMessageDialog(null, "Total jumlah elemen pada kolom ganjil: " + totalOddColElements);
        
        // Tampilkan array setelah perubahan
        StringBuilder result = new StringBuilder();
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[0].length; b++) {
                result.append(data[a][b]).append(" ");
            }
            result.append("\n");
        }
        
        JOptionPane.showMessageDialog(null, "Array setelah perubahan:\n" + result.toString());
    }
}
        // TODO code application logic here
    

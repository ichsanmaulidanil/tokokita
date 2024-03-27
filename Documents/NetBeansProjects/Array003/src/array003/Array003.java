/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array003;

/**
 *
 * @author WINDOWS 10
 */
import javax.swing.JOptionPane;
public class Array003 {

    /**
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
   

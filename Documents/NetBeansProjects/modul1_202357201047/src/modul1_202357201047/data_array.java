/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1_202357201047;

/**
 *
 * @author WINDOWS 10
 */
public class data_array {
    public static void main(String[] args) {
        String data [][] ={
            {"NAMA","\tALAMAT","\tTELEPON"},
            {"=============================="},
            {"ABDUL","\tKEDIRI","\t\t085644666899"},
            {"KUSNO","\tTRENGGALLEK","\t085646668992"},
            {"PONIRAN","BOJONEGORO","\t085646668999"}
        };
        for (int a = 0; a < data.length; a++){
            for (int b = 0; b < data[a].length; b++){
                System.out.print(data[a][b]+" ");
            }
            System.out.println("");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgsharian;

import javax.swing.JOptionPane;

/**
 *
 * @author puji
 */
public class ARRAYMULTIiDIMENSI {
    public static void main(String[] args) {
        String namaPantai[][] = {{"0", "Pantai Karang Agung"},{"1", "Pantai Kutai "}, {"2", "Pantai Bali Kambang"}, {"3","Pantai Gua Cino"},{"4","Pantai Klayar"},{"5","Pantai Tirtamaya "},
                                {"6", "Pantai Tanjung Baru"},{"7", "Pantai Tanjung Takis"},{"8", "Pantai Pangandaran"},{"9", "Pantai Siung"}};

        for (int i = 0; i < namaPantai.length; i++) {
            for (int j = 0; j < namaPantai[0].length; j++) {
                System.out.print(namaPantai[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        String masukan = JOptionPane.showInputDialog(null, "Masukan nomor terakhir tahun lahir Kamu dan lihat pantai mana yang menjadi takdir Kamu");
        for (int i = 0; i <namaPantai.length; i++) {
            for (int j = 0; j < namaPantai[0].length; j++) {
                if(namaPantai[i][j].equals(masukan)){
                    JOptionPane.showMessageDialog(null, "  Nomor terakhir tahun lahirmu Kamu " + masukan + "Nama pantai yang menjadi takdir Kamu adalah " + namaPantai[i][j+1]);
                }
                System.out.print(namaPantai[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
}

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
public class ARRAY1DMENSI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String namaBuku[] = new String[5];
        for(int i=0; i<namaBuku.length;i++){
            namaBuku[i] = JOptionPane.showInputDialog(null,"Inputkan Nama buku " + i);
            System.out.println(namaBuku[i]);
        }  
        String cariNama = JOptionPane.showInputDialog(null,"Cari Nama Buku ");
        
        for(int i=0; i<namaBuku.length;i++){
          if(namaBuku[i].equals(cariNama)){
              JOptionPane.showMessageDialog(null,"Nama BukuYang Anda cari "+cariNama + " ketemu pada tumpukan ke "+ i);
          }
        } 
    }
    
}

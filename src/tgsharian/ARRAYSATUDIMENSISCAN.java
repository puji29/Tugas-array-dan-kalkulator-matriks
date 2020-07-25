/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgsharian;

import java.util.Scanner;

/**
 *
 * @author puji
 */
public class ARRAYSATUDIMENSISCAN {
    public static void main(String[] args) {
         String namaBuku[] = new String[5];
          
        Scanner scan = new Scanner(System.in);
        
        for(int i=0; i<namaBuku.length;i++){
            System.out.print("Buku ke- " + i + ": ");
              namaBuku[i] = scan.nextLine();
          }
            System.out.println("---------------------");
            
            for(String b : namaBuku){
                System.out.println(b);
        } 
     }
 }


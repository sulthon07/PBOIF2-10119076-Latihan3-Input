/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan3.input;
import java.util.Scanner;
        
        /**
         * 
         * @author Sulthon Naufal Akmal
         */

/**
 *
 * @author ACER
 * NAMA     : Sulthon Naufal Akmal
 * KELAS    : IF2
 * NIM      : 10119076
 * Deskripsi Program :Memasukkan nilai dari keyboard
 */
public class PBOIF210119076Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan nama anda: ");
        Scanner scanner = new Scanner (System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah"+nama);
        
    }
    
}

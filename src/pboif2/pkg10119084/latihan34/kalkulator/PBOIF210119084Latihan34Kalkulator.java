/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan34.kalkulator;
/**
 * @author  
 * Nama  : Muhammad Idris Merdefi
 * Kelas : PBOIF2
 * NIM   : 10119084
 * Deskripsi Program : Program ini berisi program Kalkulator
 **/
import java.util.Scanner;
public class PBOIF210119084Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Kalkulator hitung = new Kalkulator();
        System.out.println("====Aplikasi Kalkulator Bilangan=====");
        
        System.out.print("Masukkan Angka ke-1 : ");
        hitung.value1 = keyboard.nextDouble();
        
        System.out.print("Masukkan Angka ke-2 : ");
        hitung.value2 = keyboard.nextDouble();
        
        System.out.println();
        System.out.println("Hasil Pertambahan :" + hitung.tambahBilangan());
        System.out.println("Hasil Pengurangan :" + hitung.kurangBilangan());
        System.out.println("Hasil Perkalian :" + hitung.kaliBilangan());
        System.out.println("Hasil Pembagian :" + hitung.bagiBilangan());
        System.out.println("Hasil Sisa :" + hitung.sisaBilangan());
        
         System.out.println("Developed by : Muhammad Idris Merdefi");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p01;

/**
 *
 * @author Acer
 */
public class KartuMahasiswa {
    
    public static void main (String[] args){
        String nama     = "Nadiya Ramadani";
        String npm      = "2410010237";
        String prodi    = "Teknik Informatika";
        int semester    = 5;
        String alasan   = "Ingin membuat aplikasi Bahasa Isyarat";
        
        System.out.println("==========================================");
        System.out.println("KARTU MAHASISWA PBO 2");
        System.out.println("==========================================");
        System.out.printf("%-8s : %s%n","Nama",nama);
        System.out.printf("%-8s : %s%n","NPM",npm);
        System.out.printf("%-8s : %s%n","Prodi",prodi);
        System.out.printf("%-8s : %d%n","Semester",semester);
        System.out.printf("%-8s : %s%n","Alasan",alasan);
        System.out.println("==========================================");
        
                
    }
    
}

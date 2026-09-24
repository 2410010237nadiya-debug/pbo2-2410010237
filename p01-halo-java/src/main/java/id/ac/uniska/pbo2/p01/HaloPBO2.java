/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p01;

/**
 * program pertama PBO 2 untuk memastikan JDK, NetBeans, dan Maven siap digunakan.
 * @author Acer
 */
public class HaloPBO2 {
    
    public static void main(String[] args) {
        String nama = " Mahasiswa Teknik Informatika";
        
        System.out.println("Halo," + nama + "!");
        System.out.println("Selamat data di pemograman Berbasis Objek 2.");
        System.out.println();
        
        // Informasi lingkungan Java yang sedang digunakan
        System.out.println("versi Java       : " + System.getProperty("java.version"));
        System.out.println("vendor JDK      : " + System.getProperty("java.vendor"));
        System.out.println("Sistem operasi  : " + System.getProperty("os.name"));
    }
    
}

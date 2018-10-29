/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan54Koordinat;

/**
 *
 * @author Yogaputra
 * Nama                 : Arditya Yogaputra S
 * Kelas                : PBO3
 * NIM                  : 10117119
 * Deskripsi Program    : Program ini menampilkan koordinat dan warna
 */
public class PBO310117119Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat wk = new WarnaKoordinat(10,4,"Jingga");
        System.out.println("Warna Koordinat : "+wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+wk.getX()+", y : "+wk.getY());
    }
    
}

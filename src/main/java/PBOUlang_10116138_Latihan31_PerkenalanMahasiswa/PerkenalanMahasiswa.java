/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOUlang_10116138_Latihan31_PerkenalanMahasiswa;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Nama Dan NIM
 * Running
 */
public class PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nim = "10116138";
        mahasiswa1.nama="Afif Raditya Nugraha"+"\n";
        mahasiswa1.PerkenalanDiri(mahasiswa1.nim, mahasiswa1.nama);
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nim = "10110270";
        mahasiswa2.nama="Indra Tiola"+"\n";
        mahasiswa2.PerkenalanDiri(mahasiswa2.nim, mahasiswa2.nama);
        
        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.nim = "10110271";
        mahasiswa3.nama="Robi Tanji Genefi "+"\n";
        mahasiswa3.PerkenalanDiri(mahasiswa3.nim, mahasiswa2.nama);
        
        Mahasiswa mahasiswa4 = new Mahasiswa();
        mahasiswa4.nim = "10110269";
        mahasiswa4.nama="Muhammad Nur Awaludin"+"\n";
        mahasiswa4.PerkenalanDiri(mahasiswa4.nim, mahasiswa2.nama);
    }
    
}


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class Judul extends TugasBuku{
    
    public static void main(String[] args) {
        Judul[]  array = new Judul[4];
        Scanner data = new Scanner(System.in);
        
        
        for(int i=1;i<array.length;i++){
            array[i] = new Judul();
            System.out.println("Masukkan Data Buku ke-"+i); 
            System.out.print("Masukkan Judul Buku = ");         array[i].setJudul(data.next());
            System.out.print("Masukkan Pengarang Buku = ");     array[i].setNama_pengarang(data.next());
            System.out.print("Masukkan Penerbit Buku = ");      array[i].setPenerbit(data.next());
            System.out.print("Masukkan Tahun Terbit Buku = ");  array[i].setTahun(data.next());
            System.out.print("Masukkan Kategori = ");           array[i].setKategori(data.next());
            
            System.out.println("");
            System.out.println("");
            
            System.out.println("Judul Buku: "+array[i].getJudul());
            System.out.println("Pengarang Buku: "+ array[i].getNama_pengarang());
            System.out.println("Penerbitg Buku: "+array[i].getPenerbit());
            System.out.println("Tahun Cetak Buku: "+array[i].getTahun());
            System.out.println("Kategori Buku : "+array[i].getKategori());
            
            System.out.println("");
            System.out.println("");
            
        }
        
    }
    
}

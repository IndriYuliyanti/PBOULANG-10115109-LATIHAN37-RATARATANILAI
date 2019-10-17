/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan37.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author Nama : indri yuliyanti
 *          nim : 10115109
 *          kls : pbo ulang
 *          tugas pert 3 : menghitung rata rata nilai mahasiswa
 */
public class Pboulang10115109Latihan37Rataratanilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Masukan banyak mahasiswa: ");
        
        Scanner input = new Scanner(System.in);
        int ukuran = input.nextInt();
        
        double array[] = new double[ukuran];
        
        double jumlah = 0;
        
        for (int i = 0; i < array.length; i++) {
            
            
            System.out.printf("masukan mahasiswa ke-%d: ", (i + 1));
            array[i] = input.nextDouble();
        }
        
    for (int i = 0; i < array.length; i++){
        jumlah = jumlah + array[i];
    }
    
    double rataRata = jumlah / array.length;
    
        System.out.println("Maka, Rata-rata Nilainya adalah : " +rataRata);
            
            
    }
        
        
        
   
    
}

   

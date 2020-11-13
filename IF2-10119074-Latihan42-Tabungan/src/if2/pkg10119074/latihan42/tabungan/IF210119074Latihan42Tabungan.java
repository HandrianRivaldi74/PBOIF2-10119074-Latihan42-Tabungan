/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119074.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author Acer
 * Nama      : HANDRIAN RIVALDI
 * Kelas     : PBOIF2
 * NIM       : 10119074
 * Deskrifsi : 
 */
public class IF210119074Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        int saldo = scanner.nextInt();
        Tabungan tabungan = new Tabungan(saldo);
        System.out.print("Jumlah uang yang diambil : ");
        int jumlah = scanner.nextInt();
        
        System.out.println("Saldo Anda Sekarang : " + tabungan.ambilUang(jumlah));
    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119074.latihan42.tabungan;

/**
 *
 * @author Acer
 * Nama      : HANDRIAN RIVALDI
 * Kelas     : PBOIF2
 * NIM       : 10119074
 * Deskrifsi : 
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah) {
        return saldo - jumlah;
    }
    
}

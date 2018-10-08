/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan36_objectorientedtargetsaldotabungan;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi : Menampilkan perhitunganlama tabungan sampai mencapai saldo 
 * target dengan konsep oop
 */
public class PBO3_10117109_Latihan36_ObjectOrientedTargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabungan tabung = new Tabungan();

        tabung.saldo = 3500000;
        tabung.bunga = 8;
        int saldoTarget = 6000000;

        tabung.hitungLamaSaldoTarget(tabung.saldo,saldoTarget);
    }
    
}

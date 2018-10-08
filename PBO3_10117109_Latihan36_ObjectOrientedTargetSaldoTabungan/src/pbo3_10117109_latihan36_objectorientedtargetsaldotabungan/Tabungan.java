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
public class Tabungan {
    public int saldo;
    public int bunga;

    public double hitungBunga(int parSaldo, int parBunga){
        return parSaldo*parBunga/100;
    }

    public void hitungLamaSaldoTarget(int parSaldo, int parSaldoTarget){
        int i = 1;
        while (parSaldo <= parSaldoTarget) {
            hitungBunga(parSaldo,bunga);
            parSaldo += hitungBunga(parSaldo, bunga);

            //format dan tampilkan output
            String mataUang = String.format("Rp.%,3d", parSaldo).
                    replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
            i++;
        }
    }  
    
}

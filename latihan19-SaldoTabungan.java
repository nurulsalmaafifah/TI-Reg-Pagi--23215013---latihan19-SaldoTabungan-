/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

import java.text.DecimalFormat;

public class SaldoTabungan {
    public static void main(String[] args) {
        // Deklarasi variabel
        double saldoAwal = 2500000;
        double bunga = 0.15; // 15%
        int lama = 6;

        // Format untuk menampilkan angka dengan titik sebagai pemisah ribuan dan dua angka desimal
        DecimalFormat formatRupiah = new DecimalFormat("#,###.00");

        // Loop untuk menghitung saldo setiap bulan
        for (int i = 1; i <= lama; i++) {
            saldoAwal += saldoAwal * bunga; // Hitung bunga per bulan
            System.out.println("Saldo di bulan ke-" + i + " : Rp. " + formatRupiah.format(saldoAwal));
        }
    }
}

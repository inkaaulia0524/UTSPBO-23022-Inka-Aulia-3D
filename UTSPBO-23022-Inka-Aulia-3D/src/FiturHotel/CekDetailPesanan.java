/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiturHotel;

/**
 *
 * @author inkaa
 */
public class CekDetailPesanan {
    public void tampilkanDetailPesanan(Kamar kamar) {
        System.out.println("Detail Pesanan Kamar:");
        System.out.println("Nomor Ruangan: " + kamar.getNoRuangan());
        System.out.println("Tipe Ruangan: " + kamar.getTipeRuangan());
        System.out.println("Status Kamar: " + (kamar.apakahTersedia() ? "Tersedia" : "Tidak Tersedia"));
    }
}

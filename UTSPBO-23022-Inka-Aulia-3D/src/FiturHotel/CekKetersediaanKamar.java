/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiturHotel;

/**
 *
 * @author inkaa
 */
public class CekKetersediaanKamar {
    public void cekKetersediaan(Kamar kamar) {
        if (kamar.apakahTersedia()) {
            System.out.println("Ruangan nomor " + kamar.getNoRuangan() + " tersedia.");
        } else {
            System.out.println("Ruangan nomor " + kamar.getNoRuangan() + " tidak tersedia.");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package FiturHotel;

/**
 *
 * @author inkaa
 */
public interface Kamar {
    void setNoRuangan(int noRuangan);
    int getNoRuangan();
    void setTipeRuangan(String tipeRuangan);
    String getTipeRuangan();
    boolean apakahTersedia();
    void setKetersediaan(boolean tersedia);
}

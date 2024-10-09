/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiturHotel;

/**
 *
 * @author inkaa
 */
public class PesanKamar implements Kamar {
    private int noRuangan;
    private String tipeRuangan;
    private boolean tersedia;

    public PesanKamar(int noRuangan, String tipeRuangan) {
        this.noRuangan = noRuangan;
        this.tipeRuangan = tipeRuangan;
        this.tersedia = true; 
    }

    @Override
    public void setNoRuangan(int noRuangan) {
        this.noRuangan = noRuangan;
    }

    @Override
    public int getNoRuangan() {
        return noRuangan;
    }

    @Override
    public void setTipeRuangan(String tipeRuangan) {
        this.tipeRuangan = tipeRuangan;
    }

    @Override
    public String getTipeRuangan() {
        return tipeRuangan;
    }

    @Override
    public boolean apakahTersedia() {
        return tersedia;
    }

    @Override
    public void setKetersediaan(boolean tersedia) {
        this.tersedia = tersedia;
    }
}

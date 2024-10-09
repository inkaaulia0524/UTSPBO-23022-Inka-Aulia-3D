/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import java.util.Scanner;
import AksesUser.Admin;
import AksesUser.Customer;
import FiturHotel.CekDetailPesanan;
import FiturHotel.CekKetersediaanKamar;
import FiturHotel.PesanKamar;

/**
 *
 * @author inkaa
 */
public class HotelMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Silakan pilih opsi login:");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        System.out.print("Masukkan pilihan Anda (1 atau 2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Masukkan nama pengguna: ");
        String namaPengguna = scanner.nextLine();

        if (pilihan == 1) {
            Admin admin = new Admin(namaPengguna);
            admin.tampilkanInfoPengguna();
        } else if (pilihan == 2) {
            Customer customer = new Customer(namaPengguna);
            customer.tampilkanInfoPengguna();
        } else {
            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            return;  // Mengakhiri program jika pilihan tidak valid
        }

        PesanKamar kamar = new PesanKamar(101, "Deluxe");
        CekKetersediaanKamar cekKamar = new CekKetersediaanKamar();
        CekDetailPesanan detailPesanan = new CekDetailPesanan();

        while (true) {
            System.out.println("\n=== Menu Hotel ===");
            System.out.println("1. Pesan Kamar");
            System.out.println("2. Cek Ketersediaan Kamar");
            System.out.println("3. Lihat Detail Pesanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi (1-4): ");
            int pilihanFitur = scanner.nextInt();
            scanner.nextLine();  // Mengonsumsi newline setelah input angka

            switch (pilihanFitur) {
                case 1:
                    System.out.print("Masukkan nomor kamar yang ingin dipesan: ");
                    int noKamar = scanner.nextInt();
                    scanner.nextLine();  // Mengonsumsi newline setelah input angka
                    System.out.print("Masukkan tipe kamar: ");
                    String tipeKamar = scanner.nextLine();
                    kamar = new PesanKamar(noKamar, tipeKamar);
                    kamar.setKetersediaan(false); // Tandai kamar sebagai dipesan
                    System.out.println("Kamar nomor " + noKamar + " dengan tipe " + tipeKamar + " berhasil dipesan.");
                    break;
                case 2:
                    cekKamar.cekKetersediaan(kamar);
                    break;
                case 3:
                    detailPesanan.tampilkanDetailPesanan(kamar);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan hotel kami.");
                    scanner.close();
                    return;  // Keluar dari program
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}

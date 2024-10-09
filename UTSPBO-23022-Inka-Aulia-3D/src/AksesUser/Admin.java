/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AksesUser;

/**
 *
 * @author inkaa
 */
public class Admin extends Customer {
    public Admin(String namaPengguna) {
        super(namaPengguna);
    }

    @Override
    public void tampilkanInfoPengguna() {
        System.out.println("Nama Pengguna Admin: " + namaPengguna);
    }

    public void kelolaKamar() {
        System.out.println("Admin dapat mengelola kamar hotel.");
    }
}

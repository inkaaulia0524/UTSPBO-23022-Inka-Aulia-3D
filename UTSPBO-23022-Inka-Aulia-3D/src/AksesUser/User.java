/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AksesUser;

/**
 *
 * @author inkaa
 */
public class User {
    protected String namaPengguna;

    public User(String namaPengguna) {
        this.namaPengguna = namaPengguna;
    }

    public void tampilkanInfoPengguna() {
        System.out.println("Nama Pengguna: " + namaPengguna);
    }
}

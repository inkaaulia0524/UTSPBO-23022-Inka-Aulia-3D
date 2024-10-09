/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AksesUser;

/**
 *
 * @author inkaa
 */
public class Customer extends User {
    public Customer(String namaPengguna) {
        super(namaPengguna);
    }

    @Override
    public void tampilkanInfoPengguna() {
        System.out.println("Nama Pengguna Customer: " + namaPengguna);
    }
}

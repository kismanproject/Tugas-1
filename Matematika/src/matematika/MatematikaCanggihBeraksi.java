/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author KISMAN
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih hasil = new MatematikaCanggih();
        hasil.pertambahan(10, 10);
        System.out.println("hasil tambah 10 + 10 = " + hasil.hasil);
        hasil.perkalian(5, 5);
        System.out.println("hasil kali 5 * 5 = " + hasil.hasil);
        int hasilModulus = hasil.modulus(20, 3);
        System.out.println("hasil modulus = " + hasilModulus);
    }
}

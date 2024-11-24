/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author KISMAN
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika hasil = new Matematika();
        hasil.pertambahan(10, 10);
        System.out.println("pertambahan 10 + 10 = " + hasil.hasil);
        hasil.pengurangan(10, 5);
        System.out.println("pengurangan 10 - 5 = " + hasil.hasil);
        hasil.perkalian(20, 2);
        System.out.println("perkalian 20 * 2 = " + hasil.hasil);
        hasil.pembagian(20, 5);
        System.out.println("pembagian 20 / 5 = " + hasil.hasil);
    }
}

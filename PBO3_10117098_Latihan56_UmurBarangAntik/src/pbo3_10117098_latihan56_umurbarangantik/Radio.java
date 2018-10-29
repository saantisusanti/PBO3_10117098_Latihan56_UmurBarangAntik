/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan56_umurbarangantik;

/**
 *
 * @author 
 * NAMA     : SANTI SUSANTI
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : program ini berisi program untuk menampilkan umur dari
 *                     barang antik yaitu radio berdasarkan konsep inheritance.
 */
public class Radio extends BarangAntik{
    private String name;

    public Radio(int umur) {
        super(umur);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

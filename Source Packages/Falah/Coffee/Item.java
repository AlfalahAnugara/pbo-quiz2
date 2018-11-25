/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Falah.Coffee;

/**
 *
 * @author MSI Notebook
 */
public class Item {
    // variable ini untuk menyimpan nama barang
    private String nama ;
    // variable ini untuk menyimpan harga barang
    private float harga ; 
    // dan terakhir variable ini untuk menyimpan jumlah barang
    private int jumlah ; 
    
    // Konsttuktor
    public Item() {
        
    }

    public Item(String nama, float harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    // getter harga
    public float getHarga() {
        return harga;
    }
    
    // setter harga
    public void setHarga(float harga) {
        this.harga = harga;
    }
    
    // getter jumlah
    public int getJumlah() {
        return jumlah;
    }
    
    // setter jumlah
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah ;
    }
    
    // getter nama
    public String getNama() {
        return nama;
    }
    
    // setter nama
    public void setNama(String nama) {
        this.nama = nama ;
    }
    
}
        


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
    private final String nama ;
    // variable ini untuk menyimpan harga barang
    private final float harga ; 
    // dan terakhir variable ini untuk menyimpan jumlah barang
    private int jumlah ; 
    
    // Konsttuktor
    public Item(String nama , int harga) {
        this.nama = nama ;
        this.harga = harga ;
    } 
     
    // getter nama
    public String getNama() {
        return this.nama ;
    }
    
    // getter harga
    public float getHarga() {
        return this.harga * this.jumlah ;
    }
    
    // setter jumlah
    public void setJumlah (int jumlah) {
        this.jumlah = jumlah ;
    }
    
    // getter jumlah
    public int getJumlah () {
        return this.jumlah ;
    }
    
}     


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

     public Item(String name, float price) {
        this.nama = name;
        this.harga = price;
    }
     
    public Item(String nama , int jumlah) {
        this.nama = nama ;
        this.jumlah = jumlah ;
    } 
     
    // getter harga
    public String getNama() {
        return this.nama ;
    }
    
    // setter harga
    public float getHarga() {
        return this.harga * this.jumlah ;
    }
    
    // setter jumlah
    public void setJumlah (int jumlah) {
        this.jumlah = jumlah ;
    }
    
    // getter nama
    public int getJumlah () {
        return this.jumlah ;
    }
    
    // setter nama
    public void setNama (String nama) {
        this.nama = nama ;
    }
    
    // perkalian harga dan jumlah
    public float getTotal () {
        return this.harga * this.jumlah ;

    }
}
        


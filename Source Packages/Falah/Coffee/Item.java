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
    
    public Item (String nama, int jumlah) {
        this.nama = nama ;
        this.jumlah = jumlah ;
    }

    public Item(String nama, int jumlah, float harga) {
        this.nama = nama ;
        this.jumlah = jumlah ;
        this.harga = harga ;
        switch (nama) {
            case "Kopi" : this.harga = 10000 ;
            break ;
            case "Gula" : this.harga = 30000 ;
            break ;
            case "Susu" : this.harga = 20000 ;
            break ;
        }
    }
    // harga setter
    public void setHarga(float harga) {
        this.harga = harga ;
    }
    
    // nama getter
    public String getNama () {
        return this.nama ;
    }
    
    // harga getter
    public float getHarga () {
        return this.harga ;
    }
    
    public void setNama (String nama) {
        this.nama = nama ;
    }
    
    // hasil perkalian harga dan jumlah
    public float getTotal () {
        return this.harga * this.jumlah ;
    }
    
    // jumlah getter
    public int getJumlah () {
        return jumlah ;
    }
    
    // jumlah setter
    public void setJumlah (int jumlah) {
        this.jumlah = jumlah ;
    }
    
    public String toString() {
        return this.nama ;
    }
}



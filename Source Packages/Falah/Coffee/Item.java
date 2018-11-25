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
    private float harga ; 
    // dan terakhir variable ini untuk menyimpan jumlah barang
    private int jumlah ; 
    
    // Konsttuktor
    public Item(String nama , int jumlah) {
        this.nama = nama ;
        this.jumlah = jumlah ;
        // harga untuk per item nya
        switch(nama) { 
            case "Kopi" : this.harga = 10000 ;
            break ;
            case "Susu" : this.harga = 20000 ;
            break ;
            case "Gula" : this.harga = 30000 ;
            break ;
        
        }      
    }
}


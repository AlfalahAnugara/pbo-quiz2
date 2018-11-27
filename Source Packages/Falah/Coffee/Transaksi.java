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

import java.util.* ;
import java.text.SimpleDateFormat ;
import java.util.ArrayList ;

public class Transaksi {
    // variable code untuk menampilkan kode pembayaran minuman
    private final String kode ;
    // variable item untuk menampilkan item apa saja yang dibeli
    private ArrayList<Item> items = new ArrayList<>() ;
    // variable total untuk menampilkan total pembelian minuman
    private float total ; 
    
    // Konstruktor
    public Transaksi (String kode , ArrayList<Item> items) {
        this.kode = kode ;
        this.items = items ;
        
    }
        
    // total setter
    public void setTotal () {
        float total = 0 ;
        for (Item item : this.items) {
            total += item.getTotal() ;
        }
        this.total = total ;
    }
    
    // output transaksi
    public String Pembayaran() {
        setTotal () ;
        String obt = "" ;
        obt += "Kode\t\t : " + this.kode +"\n" ;
        obt += "Daftar Belanja : \n" ;
        for (Item item : this.items) {
            obt += "\t" + item.getNama() + "(x" + item.getJumlah() + ") : " + item.getTotal() + "\n" ;
        }
        obt += "Total\t\t : " + this.total ;
        return obt ;
    }

}

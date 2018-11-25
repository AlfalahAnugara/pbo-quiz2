/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Falah.Coffee;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author MSI Notebook
 */
public class ComboCoffee {
    
    private HashMap<String , Float> items = new HashMap<> () ;
    
    public ComboCoffee () {
        this.items.put ("Gula" , new Float (30000)) ;
        this.items.put ("Gula" , new Float (10000)) ;
        this.items.put ("Gula" , new Float (20000)) ;
    }
    
    public ArrayList<String> getNames() {
        ArrayList <String> obt = new ArrayList<> () ;
        for (String item : this.items.keySet()) {
            obt.add (item) ;
        }
        return obt ;
    }
    
    public ArrayList <Float> getPrices () {
        ArrayList <Float> flt = new ArrayList<> () ;
        for (float item : this.items.values()) {
            flt.add(item) ;
        }
        return flt ;
    }
    
    public void addItem (String nama , float harga) {
        this.items.put (nama , harga) ;
    }
    
}

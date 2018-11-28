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
public class ComboModel {
    
    private HashMap<String , Float> items = new HashMap<>() ;
    
    public ComboModel() {
        this.items.put("Gula" , new Float(30000)) ;
        this.items.put("Kopi" , new Float(10000)) ;
        this.items.put("Susu" , new Float(20000)) ;
        this.items.put("Malboro" , new Float(23000)) ;
        this.items.put("Tepung" , new Float(15000)) ;
        this.items.put("Gula Merah" , new Float(40000)) ;
    }
    
    public ArrayList <String> getSemuaNama () {
        ArrayList<> str = new ArrayList<> () ;
        for (String item : this.items.keySet()) {
            str.add(item) ;
        }
        return str ;
    }
    
    public ArrayList <Float> getSemuaHarga() {
        ArrayList<Float> flt = new ArrayList<> () ;
        for (float item : this.items.values()) {
            flt.add(item) ;
        }
        return flt ;
    }
    
 
}

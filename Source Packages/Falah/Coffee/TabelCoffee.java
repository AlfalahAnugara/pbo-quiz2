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
import javax.swing.table.* ;
public class TabelCoffee extends DefaultTableModel {
    
    // kolom pada String array var berfungsi untuk menyimpan nama kolom
    private String[] kolom ;
    
    // Konstruktor
    public TabelCoffee () {
        this.kolom = new String [] {
            "Nama" , "Harga" , "Jumlah"
        } ;
    }
    
    // KolomNama getter
    public String[] getKolomNama () {
        return this.kolom  ;
    }
    
    @Override
    public void setRowCount(int i) {
        super.setRowCount(0) ;
    }
    
    @Override
    public void addRow(Object[] os) {
        super.addRow(os) ;
    }
    
    @Override
    public void removeRow(int i) {
        super.removeRow(i) ;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok_7_oop.Kelas;

import java.util.ArrayList;

/**
 *
 * @author Nashir
 */
public class Pengawas extends Petugas {
    private ArrayList<Pencacah> pencacahBawahan = new ArrayList<>();
    
    public ArrayList<Pencacah> getAnakBuah(){
        ArrayList<Pencacah> temp = new ArrayList<>();
        for(Pencacah a:pencacahBawahan){
            if (this.getKode().equalsIgnoreCase(a.getKode()));
            temp.add(a);
        }
        return temp;
    }
    
    public void addPencacah(Pencacah pcc){
        this.pencacahBawahan.add(pcc);
    }
    /**
     * @return the kodePencacah
     */
   

}

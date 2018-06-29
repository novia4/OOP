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
public class Pencacah extends Petugas{
    private String kodePengawas;
    private ArrayList<Ruta> listRuta= new ArrayList<>();

    /**
     * @return the kodePengawas
     */
    public String getKodePengawas() {
        return kodePengawas;
    }

    /**
     * @param kodePengawas the kodePengawas to set
     */
    public void setKodePengawas(String kodePengawas) {
        this.kodePengawas = kodePengawas;
    }
    
    public void addRuta(Ruta ruta){
        listRuta.add(ruta);
    }
    
    public ArrayList<Ruta> getAllRuta(){
        return listRuta;
    }
    
    public Ruta getRutaByNoKodeSample(String kode){
        for(Ruta a : listRuta){
            if(a.getAlamat().getNoKodeSample().equalsIgnoreCase(kode)){
                return a;
            }
        }
        return null;
    }
}

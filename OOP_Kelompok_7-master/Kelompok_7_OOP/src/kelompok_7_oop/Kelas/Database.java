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
public class Database {
    private Database(){
        
    }
    private ArrayList<Pengawas> list = new ArrayList<>();
    private static Database database = new Database();
    public static Database getInstance(){
            return database;
    }
    
    public ArrayList<Pengawas> getAllPengawas(){
        return list;
    }
    
    public void addPengawas(Pengawas pws){
        list.add(pws);
    }
    
    public Pengawas getPengawasById(String id){
        for(Pengawas a : list){
            if (a.getKode().equalsIgnoreCase(id))
                return a;
        }
        return null;
    }
    
    
}

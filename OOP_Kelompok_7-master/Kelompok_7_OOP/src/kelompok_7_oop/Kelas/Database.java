/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok_7_oop.Kelas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nashir
 */
public class Database {
    private Database(){
        
    }
    private static ArrayList<Pengawas> list = new ArrayList<>();
    private static Database database = new Database();
    private static File file = new File("D:\\STIS\\File Test\\cacah.k7");
    
    public static Database getInstance(){
            if (file.exists()){
            reloadDB();
        }
            return database;
    }
    
    public ArrayList<Pengawas> getAllPengawas(){
        
        return list;
    }
    
    public void addPengawas(Pengawas pengawas){
        for(Pengawas a : list){
            if (a.getKode().equals(pengawas.getKode())){
                for(Pencacah p : pengawas.getAnakBuah()){
                    a.addPencacah(p);
                }
                return;
            }
        }
        list.add(pengawas);
    }
    
    public Pengawas getPengawasById(String id){
        for(Pengawas a : list){
            if (a.getKode().equalsIgnoreCase(id))
                return a;
        }
        return null;
    }
    public static void reloadDB(){
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList<Pengawas>) ois.readObject();
        } catch (FileNotFoundException ex) {
            System.err.println("File tidak dikenali!!");
        } catch (IOException ex) {
            System.err.println("Data tidak dapat baca!!");
        } catch (ClassNotFoundException ex) {
            System.err.println("Format file salah!!");
        }
        
    }
    
    public static void save(ArrayList<Pengawas> pengawas){
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File tidak dapat dibuat!!");
        } catch (IOException ex) {
            System.out.println("File tidak ada!!");
        }
    
    
                
    }

    
}

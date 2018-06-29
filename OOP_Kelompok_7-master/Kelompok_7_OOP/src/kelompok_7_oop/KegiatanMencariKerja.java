/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kelompok_7_oop;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class KegiatanMencariKerja {
    private String mencariKerja;
    private String mempersiapkanUsaha;
    private int lamaMencariKerja;
    private ArrayList alasanMencariKerja;
    private ArrayList upayaMencariKerja;
    private ArrayList alasanTdkMncariKerja;
    private String mulaiPekerjaan;
    private String menerimaTawaran;
    private String siapKerja;
    private String inginPekerjaan;
//    private Array upah;
    
    public String getMencariKerja(){
        return mencariKerja;    
    }
    
    public void setMencariKerja(String mencariKerja) {
        this.mencariKerja = mencariKerja;
    }
    
    public String getMempersiapkanUsaha(){
        return mempersiapkanUsaha;    
    }
    
    public void setMempersiapkanUsaha(String mempersiapkanUsaha) {
        this.mempersiapkanUsaha = mempersiapkanUsaha;
    }
    
    public int getLamaMencariKerja(){
        return lamaMencariKerja;    
    }
    
    public void setLamaMencariKerja(String LamaMencariKerja) {
        this.lamaMencariKerja = lamaMencariKerja;
    }
    
      public ArrayList getAlasanMencariKerja(){
        return alasanMencariKerja;    
    }
    
    public void setAlasanMencariKerja(String alasanMencariKerja) {
        this.alasanMencariKerja.add(alasanMencariKerja);
    }
    
      public ArrayList getUpayaMencariKerja(){
        return upayaMencariKerja;    
    }
    
    public void setUpayaMencariKerja(String upayaMencariKerja) {
        this.upayaMencariKerja.add(upayaMencariKerja);
    }
    
      public ArrayList getAlasanTdkMencariKerja(){
        return alasanTdkMncariKerja;    
    }
    
    public void setAlasanTdkMencariKerja(String alasanTdkMencariKerja) {
        this.alasanTdkMncariKerja.add(alasanTdkMencariKerja);
    }
    
    public String getMulaiPekerjaan(){
        return mulaiPekerjaan;    
    }
    
//    public void setMulaiUsaha(String mulaiUsaha) {
//        this.mulaiUsaha = mulaiUsaha;
//    }
    
    public String getMenerimaTawaran(){
        return menerimaTawaran;    
    }
    
    public void setMenerimaTawaran(String menerimaTawaran) {
        this.menerimaTawaran = menerimaTawaran;
    }
    
      public String getSiapKerja(){
        return siapKerja;    
    }
    
    public void setSiapKerja(String siapKerja) {
        this.siapKerja = siapKerja;
    }
    
      public String getInginPekerjaan(){
        return inginPekerjaan;    
    }
    
    public void setInginPekerjaan(String inginPekerjaan) {
        this.inginPekerjaan = inginPekerjaan;
    }
    
//       public Array getUpah(){
//        return upah;    
//    }
//    
//    public void setUpah(Array upah) {
//        this.upah = upah;
//    }
    
}

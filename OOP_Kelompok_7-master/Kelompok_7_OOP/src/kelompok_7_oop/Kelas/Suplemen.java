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
public class Suplemen {
    private String penyediaJasa;
    private ArrayList<String> kegiatanBulanLalu = new ArrayList();
    
    private String kerjaKumulatif;
    private String kumulatifMinSejam;
    private String kegiatanUtama;
    private String bidangPekerjaan;
    private String jenisJabatan;
    private String statJabatan;

    
    public void addKegiatanBulanLalu(String kegiatanBulanLalu){
        this.kegiatanBulanLalu.add(kegiatanBulanLalu);
    }
    
    /**
     * @return the penyediaJasa
     */
    public String getPenyediaJasa() {
        return penyediaJasa;
    }

    /**
     * @param penyediaJasa the penyediaJasa to set
     */
    public void setPenyediaJasa(String penyediaJasa) {
        this.penyediaJasa = penyediaJasa;
    }

    /**
     * @return the kegiatanBulanLalu
     */
    public ArrayList<String> getKegiatanBulanLalu() {
        return kegiatanBulanLalu;
    }

    /**
     * @param kegiatanBulanLalu the kegiatanBulanLalu to set
     */
    public void setKegiatanBulanLalu(ArrayList<String> kegiatanBulanLalu) {
        this.kegiatanBulanLalu = kegiatanBulanLalu;
    }

    /**
     * @return the kerjaKumulatif
     */
    public String getKerjaKumulatif() {
        return kerjaKumulatif;
    }

    /**
     * @param kerjaKumulatif the kerjaKumulatif to set
     */
    public void setKerjaKumulatif(String kerjaKumulatif) {
        this.kerjaKumulatif = kerjaKumulatif;
    }

    /**
     * @return the kumulatifMinSejam
     */
    public String getKumulatifMinSejam() {
        return kumulatifMinSejam;
    }

    /**
     * @param kumulatifMinSejam the kumulatifMinSejam to set
     */
    public void setKumulatifMinSejam(String kumulatifMinSejam) {
        this.kumulatifMinSejam = kumulatifMinSejam;
    }

    /**
     * @return the kegiatanUtama
     */
    public String getKegiatanUtama() {
        return kegiatanUtama;
    }

    /**
     * @param kegiatanUtama the kegiatanUtama to set
     */
    public void setKegiatanUtama(String kegiatanUtama) {
        this.kegiatanUtama = kegiatanUtama;
    }

    /**
     * @return the bidangPekerjaan
     */
    public String getBidangPekerjaan() {
        return bidangPekerjaan;
    }

    /**
     * @param bidangPekerjaan the bidangPekerjaan to set
     */
    public void setBidangPekerjaan(String bidangPekerjaan) {
        this.bidangPekerjaan = bidangPekerjaan;
    }

    /**
     * @return the jenisJabatan
     */
    public String getJenisJabatan() {
        return jenisJabatan;
    }

    /**
     * @param jenisJabatan the jenisJabatan to set
     */
    public void setJenisJabatan(String jenisJabatan) {
        this.jenisJabatan = jenisJabatan;
    }

    /**
     * @return the statJabatan
     */
    public String getStatJabatan() {
        return statJabatan;
    }

    /**
     * @param statJabatan the statJabatan to set
     */
    public void setStatJabatan(String statJabatan) {
        this.statJabatan = statJabatan;
    }
    
}

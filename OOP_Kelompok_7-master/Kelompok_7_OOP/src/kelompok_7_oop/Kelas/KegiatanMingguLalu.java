/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok_7_oop.Kelas;

import java.util.ArrayList;

/**
 *
 * @author USER-PC
 */
public class KegiatanMingguLalu {

    /**
     * @return the kegiatan
     */
    public ArrayList<String> getKegiatan() {
        return kegiatan;
    }

    /**
     * @param kegiatan the kegiatan to set
     */
    public void setKegiatan(ArrayList<String> kegiatan) {
        this.kegiatan = kegiatan;
    }

    /**
     * @return the waktuTerbanyak
     */
    public String getWaktuTerbanyak() {
        return waktuTerbanyak;
    }

    /**
     * @param waktuTerbanyak the waktuTerbanyak to set
     */
    public void setWaktuTerbanyak(String waktuTerbanyak) {
        this.waktuTerbanyak = waktuTerbanyak;
    }

    /**
     * @return the sementaraMenganggur
     */
    public String getSementaraMenganggur() {
        return sementaraMenganggur;
    }

    /**
     * @param sementaraMenganggur the sementaraMenganggur to set
     */
    public void setSementaraMenganggur(String sementaraMenganggur) {
        this.sementaraMenganggur = sementaraMenganggur;
    }

    /**
     * @return the alasanMenganggur
     */
    public String getAlasanMenganggur() {
        return alasanMenganggur;
    }

    /**
     * @param alasanMenganggur the alasanMenganggur to set
     */
    public void setAlasanMenganggur(String alasanMenganggur) {
        this.alasanMenganggur = alasanMenganggur;
    }

    /**
     * @return the dapatPenghasilan
     */
    public String getDapatPenghasilan() {
        return dapatPenghasilan;
    }

    /**
     * @param dapatPenghasilan the dapatPenghasilan to set
     */
    public void setDapatPenghasilan(String dapatPenghasilan) {
        this.dapatPenghasilan = dapatPenghasilan;
    }

    /**
     * @return the lamaMenganggur
     */
    public String getLamaMenganggur() {
        return lamaMenganggur;
    }

    /**
     * @param lamaMenganggur the lamaMenganggur to set
     */
    public void setLamaMenganggur(String lamaMenganggur) {
        this.lamaMenganggur = lamaMenganggur;
    }

    /**
     * @return the jaminanKembaliKerja
     */
    public String getJaminanKembaliKerja() {
        return jaminanKembaliKerja;
    }

    /**
     * @param jaminanKembaliKerja the jaminanKembaliKerja to set
     */
    public void setJaminanKembaliKerja(String jaminanKembaliKerja) {
        this.jaminanKembaliKerja = jaminanKembaliKerja;
    }
    
    private ArrayList<String> kegiatan;
    private String waktuTerbanyak;
    private String sementaraMenganggur;
    private String alasanMenganggur;
    private String dapatPenghasilan;
    private String lamaMenganggur;
    private String jaminanKembaliKerja;
    
}

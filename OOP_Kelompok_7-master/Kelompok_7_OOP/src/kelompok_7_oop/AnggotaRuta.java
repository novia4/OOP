/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok_7_oop;

import java.util.Date;

/**
 *
 * @author USER-PC
 */
public class AnggotaRuta {

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the hubunganDgKRT
     */
    public String getHubunganDgKRT() {
        return hubunganDgKRT;
    }

    /**
     * @param hubunganDgKRT the hubunganDgKRT to set
     */
    public void setHubunganDgKRT(String hubunganDgKRT) {
        this.hubunganDgKRT = hubunganDgKRT;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the bulanLahir
     */
    public Date getBulanLahir() {
        return bulanLahir;
    }

    /**
     * @param bulanLahir the bulanLahir to set
     */
    public void setBulanLahir(Date bulanLahir) {
        this.bulanLahir = bulanLahir;
    }

    /**
     * @return the umur
     */
    public int getUmur() {
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(int umur) {
        this.umur = umur;
    }

    /**
     * @return the statKawin
     */
    public String getStatKawin() {
        return statKawin;
    }

    /**
     * @param statKawin the statKawin to set
     */
    public void setStatKawin(String statKawin) {
        this.statKawin = statKawin;
    }

    /**
     * @return the statSekolah
     */
    public String getStatSekolah() {
        return statSekolah;
    }

    /**
     * @param statSekolah the statSekolah to set
     */
    public void setStatSekolah(String statSekolah) {
        this.statSekolah = statSekolah;
    }
    
    private String nama;
    private String hubunganDgKRT;
    private String gender;
    private Date bulanLahir;
    private int umur;
    private String statKawin;
    private String statSekolah;
    
}

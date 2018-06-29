/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok_7_oop.Kelas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public int getBulanLahir() {
        return bulanLahir;
    }

    /**
     * @param bulanLahir the bulanLahir to set
     */
    public void setBulanLahir(int bulanLahir) {
        this.bulanLahir = bulanLahir;
    }

    /**
     * @return the umur
     */
    public int getTahunLahir() {
        return tahunLahir;
    }

    /**
     * @param umur the umur to set
     */
    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
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
    public int getUmur(int tahunLahir){
        Date date = new Date();
        int time =date.getYear() -tahunLahir+1900;
        if(date.getMonth()>this.bulanLahir){
        time++;
    }
        return time;
    }
    public KarakteristikUmum getKarakteristikUmum(){
        return this.karateristikUmum;
    }
    public void setKarakteristikUmum(KarakteristikUmum ku){
        this.karateristikUmum=ku;
    }
    
    private String nama;
    private String hubunganDgKRT;
    private String gender;
    private int bulanLahir;
    private int tahunLahir;
    private String statKawin;
    private String statSekolah;
    private KarakteristikUmum karateristikUmum = new KarakteristikUmum();
    private KegiatanMingguLalu mingguLalu = new KegiatanMingguLalu();

    /**
     * @return the mingguLalu
     */
    public KegiatanMingguLalu getKegiatanMingguLalu() {
        return mingguLalu;
    }

    /**
     * @param mingguLalu the mingguLalu to set
     */
    public void setKegiatanMingguLalu(KegiatanMingguLalu mingguLalu) {
        this.mingguLalu = mingguLalu;
    }
}

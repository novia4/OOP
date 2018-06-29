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
public class Ruta {
    private TempatPencacahan alamat=new TempatPencacahan();
    private String namaKepalaRT;
    private String noUrutPemberiInfo;
    private String hasilKunjungan;
    private Ringkasan ringkasan;
    private ArrayList<AnggotaRuta> art = new ArrayList<>();
    /**
     * @return the alamat
     */
    public TempatPencacahan getAlamat() {
        return alamat;
    }
    public void addAnggotaRuta(AnggotaRuta aart){
        art.add(aart);
    }
    
    public ArrayList<AnggotaRuta> getAllArt(){
        return art;
    }
    

    /**
     * @return the namaKepalaRT
     */
    public String getNamaKepalaRT() {
        return namaKepalaRT;
    }

    /**
     * @param namaKepalaRT the namaKepalaRT to set
     */
    public void setNamaKepalaRT(String namaKepalaRT) {
        this.namaKepalaRT = namaKepalaRT;
    }

    /**
     * @return the noUrutPemberiInfo
     */
    public String getNoUrutPemberiInfo() {
        return noUrutPemberiInfo;
    }

    /**
     * @param noUrutPemberiInfo the noUrutPemberiInfo to set
     */
    public void setNoUrutPemberiInfo(String noUrutPemberiInfo) {
        this.noUrutPemberiInfo = noUrutPemberiInfo;
    }

    /**
     * @return the hasilKunjungan
     */
    public String getHasilKunjungan() {
        return hasilKunjungan;
    }

    /**
     * @param hasilKunjungan the hasilKunjungan to set
     */
    public void setHasilKunjungan(String hasilKunjungan) {
        this.hasilKunjungan = hasilKunjungan;
    }

    /**
     * @return the ringkasan
     */
    public Ringkasan getRingkasan() {
        return ringkasan;
    }

    /**
     * @param ringkasan the ringkasan to set
     */
    public void setRingkasan(Ringkasan ringkasan) {
        this.ringkasan = ringkasan;
    }

}

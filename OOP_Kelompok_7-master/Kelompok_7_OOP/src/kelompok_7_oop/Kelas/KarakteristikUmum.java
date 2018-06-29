/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok_7_oop.Kelas;

/**
 *
 * @author USER-PC
 */
public class KarakteristikUmum extends Lokasi{
    
    private String ijazahTerakhir;
    private String jurusan;
    private String pernahPelatihan;
    private String kewarganegaraan;
    Lokasi tptTigl5thnLalu;
    private Gangguan gangguan;
    private KegiatanMingguLalu kegiatan = new KegiatanMingguLalu();
    
    public Gangguan getGangguan(){
        return gangguan;
    }
    
    /**
     * @return the ijazahTerakhir
     */
    public String getIjazahTerakhir() {
        return ijazahTerakhir;
    }

    /**
     * @param ijazahTerakhir the ijazahTerakhir to set
     */
    public void setIjazahTerakhir(String ijazahTerakhir) {
        this.ijazahTerakhir = ijazahTerakhir;
    }

    /**
     * @return the jurusan
     */
    public String getJurusan() {
        return jurusan;
    }

    /**
     * @param jurusan the jurusan to set
     */
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    /**
     * @return the pernahPelatihan
     */
    public String getPernahPelatihan() {
        return pernahPelatihan;
    }

    /**
     * @param pernahPelatihan the pernahPelatihan to set
     */
    public void setPernahPelatihan(String pernahPelatihan) {
        this.pernahPelatihan = pernahPelatihan;
    }

    /**
     * @return the kewarganegaraan
     */
    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    /**
     * @param kewarganegaraan the kewarganegaraan to set
     */
    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }
    public void setGangguan(Gangguan gg){
        this.gangguan = gg;
    }

    /**
     * @return the kegiatan
     */
    public KegiatanMingguLalu getKegiatan() {
        return kegiatan;
    }

    /**
     * @param kegiatan the kegiatan to set
     */
    public void setKegiatan(KegiatanMingguLalu kegiatan) {
        this.kegiatan = kegiatan;
    }
}

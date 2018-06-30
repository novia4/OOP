/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok_7_oop.Kelas;

/**
 *
 * @author maya
 */
public class Pekerjaan {
    private String pekerjaan;
    private String jenisPekerjaan;
    private int lamaBekerja;
    private int lamaMencari;
    private JamKerja jamkerja;
    private String statusPekerjaan;
    private String caraPembukuan;
    private String sistemPengupahan;
    private FasilitasPekerjaan layananPerusahaan;
    private String perjanjianKerja;
    private String serikatPekerja;
    private String jenisInstansi;
    private String lokasiUtamaKerja;
    private Lokasi tempatKerja;
    private String frekuensiPergiKerja;
    private String jarak;
    private String lamaPerjalanan;
    private String jenisTransportasi;

    public Pekerjaan(){
        this.jamkerja = new JamKerja();
        this.layananPerusahaan=new FasilitasPekerjaan();
    }
    /**
     * @return the pekerjaan
     */
    public String getPekerjaan() {
        return pekerjaan;
    }

    /**
     * @param pekerjaan the pekerjaan to set
     */
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    /**
     * @return the jenisPekerjaan
     */
    public String getJenisPekerjaan() {
        return jenisPekerjaan;
    }

    /**
     * @param jenisPekerjaan the jenisPekerjaan to set
     */
    public void setJenisPekerjaan(String jenisPekerjaan) {
        this.jenisPekerjaan = jenisPekerjaan;
    }

    /**
     * @return the lamaBekerja
     */
    public int getLamaBekerja() {
        return lamaBekerja;
    }

    /**
     * @param lamaBekerja the lamaBekerja to set
     */
    public void setLamaBekerja(int lamaBekerja) {
        this.lamaBekerja = lamaBekerja;
    }

    /**
     * @return the lamaMencari
     */
    public int getLamaMencari() {
        return lamaMencari;
    }

    /**
     * @param lamaMencari the lamaMencari to set
     */
    public void setLamaMencari(int lamaMencari) {
        this.lamaMencari = lamaMencari;
    }

    /**
     * @return the jamkerja
     */
    public JamKerja getJamkerja() {
        return jamkerja;
    }

    /**
     * @param jamkerja the jamkerja to set
     */
    public void setJamkerja(JamKerja jamkerja) {
        this.jamkerja = jamkerja;
    }

    /**
     * @return the statusPekerjaan
     */
    public String getStatusPekerjaan() {
        return statusPekerjaan;
    }

    /**
     * @param statusPekerjaan the statusPekerjaan to set
     */
    public void setStatusPekerjaan(String statusPekerjaan) {
        this.statusPekerjaan = statusPekerjaan;
    }

    /**
     * @return the caraPembukuan
     */
    public String getCaraPembukuan() {
        return caraPembukuan;
    }

    /**
     * @param caraPembukuan the caraPembukuan to set
     */
    public void setCaraPembukuan(String caraPembukuan) {
        this.caraPembukuan = caraPembukuan;
    }

    /**
     * @return the sistemPengupahan
     */
    public String getSistemPengupahan() {
        return sistemPengupahan;
    }

    /**
     * @param sistemPengupahan the sistemPengupahan to set
     */
    public void setSistemPengupahan(String sistemPengupahan) {
        this.sistemPengupahan = sistemPengupahan;
    }

    /**
     * @return the layananPerusahaan
     */
    public FasilitasPekerjaan getLayananPerusahaan() {
        return layananPerusahaan;
    }

    /**
     * @param layananPerusahaan the layananPerusahaan to set
     */
    public void setLayananPerusahaan(FasilitasPekerjaan layananPerusahaan) {
        this.layananPerusahaan = layananPerusahaan;
    }

    /**
     * @return the perjanjianKerja
     */
    public String getPerjanjianKerja() {
        return perjanjianKerja;
    }

    /**
     * @param perjanjianKerja the perjanjianKerja to set
     */
    public void setPerjanjianKerja(String perjanjianKerja) {
        this.perjanjianKerja = perjanjianKerja;
    }

    /**
     * @return the serikatPekerja
     */
    public String getSerikatPekerja() {
        return serikatPekerja;
    }

    /**
     * @param serikatPekerja the serikatPekerja to set
     */
    public void setSerikatPekerja(String serikatPekerja) {
        this.serikatPekerja = serikatPekerja;
    }

    /**
     * @return the jenisInstansi
     */
    public String getJenisInstansi() {
        return jenisInstansi;
    }

    /**
     * @param jenisInstansi the jenisInstansi to set
     */
    public void setJenisInstansi(String jenisInstansi) {
        this.jenisInstansi = jenisInstansi;
    }

    /**
     * @return the lokasiUtamaKerja
     */
    public String getLokasiUtamaKerja() {
        return lokasiUtamaKerja;
    }

    /**
     * @param lokasiUtamaKerja the lokasiUtamaKerja to set
     */
    public void setLokasiUtamaKerja(String lokasiUtamaKerja) {
        this.lokasiUtamaKerja = lokasiUtamaKerja;
    }

    /**
     * @return the tempatKerja
     */
    public Lokasi getTempatKerja() {
        return tempatKerja;
    }

    /**
     * @param tempatKerja the tempatKerja to set
     */
    public void setTempatKerja(Lokasi tempatKerja) {
        this.tempatKerja = tempatKerja;
    }

    /**
     * @return the frekuensiPergiKerja
     */
    public String getFrekuensiPergiKerja() {
        return frekuensiPergiKerja;
    }

    /**
     * @param frekuensiPergiKerja the frekuensiPergiKerja to set
     */
    public void setFrekuensiPergiKerja(String frekuensiPergiKerja) {
        this.frekuensiPergiKerja = frekuensiPergiKerja;
    }

    /**
     * @return the jarak
     */
    public String getJarak() {
        return jarak;
    }

    /**
     * @param jarak the jarak to set
     */
    public void setJarak(String jarak) {
        this.jarak = jarak;
    }

    /**
     * @return the lamaPerjalanan
     */
    public String getLamaPerjalanan() {
        return lamaPerjalanan;
    }

    /**
     * @param lamaPerjalanan the lamaPerjalanan to set
     */
    public void setLamaPerjalanan(String lamaPerjalanan) {
        this.lamaPerjalanan = lamaPerjalanan;
    }

    /**
     * @return the jenisTransportasi
     */
    public String getJenisTransportasi() {
        return jenisTransportasi;
    }

    /**
     * @param jenisTransportasi the jenisTransportasi to set
     */
    public void setJenisTransportasi(String jenisTransportasi) {
        this.jenisTransportasi = jenisTransportasi;
    }


}

package entity;

public class Kendaraan {

    private String nomor_polisi;
    private String nama;
    private String kendaraan;
    private String warna;

    public Kendaraan(String nomor_polisi, String nama, String kendaraan, String warna) {
        this.nomor_polisi = nomor_polisi;
        this.nama = nama;
        this.kendaraan = kendaraan;
        this.warna = warna;
    }

    public boolean equals(Object object) {
        Kendaraan kdn = (Kendaraan) object;
        return nomor_polisi.equals(kdn.getnomor_polisi());
    }

    public String getnomor_polisi() {
        return nomor_polisi;
    }

    public void setnomor_polisi(String nomor_polisi) {
        this.nomor_polisi = nomor_polisi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getkendaraan() {
        return kendaraan;
    }

    public void setkendaraan(String kendaraan) {
        this.kendaraan = kendaraan;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}
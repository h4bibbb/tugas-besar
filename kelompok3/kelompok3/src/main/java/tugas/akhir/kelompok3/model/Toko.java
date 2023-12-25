package tugas.akhir.kelompok3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity(name = "toko")
public class Toko {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Lob
    private byte[] image;

    private String nama_toko;

    
    private String nomor_hp;
    
    private String alamat;

    private String logo;

    // private String Gambar_Barang;

    public Toko() {
    }
    public Toko(String nama_toko, String nomor_hp, String alamat, String pemilik, String logo) {
        this.nama_toko = nama_toko;
        this.nomor_hp = nomor_hp;
        this.alamat = alamat;
        this.pemilik = pemilik;
        this.logo = logo;
        // this.Gambar_Barang =Gambar_Barang;
        
    }

    private String pemilik;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_toko() {
        return nama_toko;
    }

    public void setNama_toko(String nama_toko) {
        this.nama_toko = nama_toko;
    }

    public String getNomor_hp() {
        return nomor_hp;
    }

    public void setNomor_hp(String nomor_hp) {
        this.nomor_hp = nomor_hp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getLogo(){
        return logo;
    }

    public void setLogo(String logo){
        this.logo = logo;
    }

    // public String setGambar_Barang(){
    //     return Gambar_Barang;
    // }
    //     public void setGambar_Barang(String Gambar_Barang){
    //     this.Gambar_Barang =Gambar_Barang;
    //     }

}

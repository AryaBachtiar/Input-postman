package com.tugaskerajaan.kerajaan.model;

import javax.persistence.*;

@Entity
@Table(name = "kerajaan")
public class Kerajaan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    pemberian nama didalam daftar table yang akan diiskan data
    @Column(name = "namaIslam")
    private String namaIslam;
//Column digunakan untuk memberikan tempat untuk nama disetiap table
    @Column(name = "letak")
    private String letak;

    @Column(name = "tahunBerdiri")
    private String tahunBerdiri;

    @Column(name = "rajaTerkenal")
    private String rajaTerkenal;

    @Column(name = "peninggalanSejarah")
    private String peninggalanSejarah;

    public Kerajaan() {
    }


//   untuk bisa mengisi data yang di dalam table
    public String getNamaIslam() {
        return namaIslam;
    }

    public void setNamaIslam(String namaIslam) {
        this.namaIslam = namaIslam;
    }

    public String getLetak() {
        return letak;
    }

    public void setLetak(String letak) {
        this.letak = letak;
    }

    public String getTahunBerdiri() {
        return tahunBerdiri;
    }

    public void setTahunBerdiri(String tahunBerdiri) {
        this.tahunBerdiri = tahunBerdiri;
    }

    public String getRajaTerkenal() {
        return rajaTerkenal;
    }

    public void setRajaTerkenal(String rajaTerkenal) {
        this.rajaTerkenal = rajaTerkenal;
    }

    public String getPeninggalanSejarah() {
        return peninggalanSejarah;
    }

    public void setPeninggalanSejarah(String peninggalanSejarah) {
        this.peninggalanSejarah = peninggalanSejarah;
    }

//    menmapilkan isi data yang di tuliskan dalam table
    @Override
    public String toString() {
        return "Kerajaan{" +
                "id=" + id +
                ", namaIslam='" + namaIslam + '\'' +
                ", letak='" + letak + '\'' +
                ", tahunBerdiri='" + tahunBerdiri + '\'' +
                ", rajaTerkenal='" + rajaTerkenal + '\'' +
                ", peninggalanSejarah='" + peninggalanSejarah + '\'' +
                '}';
    }
}
package com.tugaskerajaan.kerajaan.service;

import com.tugaskerajaan.kerajaan.model.Kerajaan;

import javax.swing.*;
import java.util.List;

public interface KerajaanService {

//    Add untuk menambahkan data
    Kerajaan addKerajaan(Kerajaan sekolah);

//    get untuk menampilkan data yg dimasukkan
    Kerajaan getKerajaanById(Long id);

//    getAll untuk menampilkan seluruh data yang telah di masukkan
    List<Kerajaan> getAllKerajaan();

//    delete untuk menghapus data berdasarkan id yg dimasukkan
    void deleteKerajaanById(Long id);

//    edit untuk mengubah isi dalam data
    Kerajaan editKerajaanById(Long id, String namaIslam, String letak, String tahunBerdiri, String rajaTerkenal, String peninggalanSejarah);
}

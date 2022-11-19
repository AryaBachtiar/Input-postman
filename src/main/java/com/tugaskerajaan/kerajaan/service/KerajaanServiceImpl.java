package com.tugaskerajaan.kerajaan.service;

import com.tugaskerajaan.kerajaan.model.Kerajaan;
import com.tugaskerajaan.kerajaan.repository.KerajaanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;

@Service
public class KerajaanServiceImpl implements KerajaanService {

    @Autowired
    private KerajaanRepository kerajaanRepository;


    @Override
    public Kerajaan addKerajaan(Kerajaan kerajaan){
        return kerajaanRepository.save(kerajaan);
    }

    @Override
    public Kerajaan getKerajaanById(Long id) {
        return kerajaanRepository.findById(id).get();
    }

    @Override
    public  Kerajaan editKerajaanById(Long id, String namaIslam, String letak,String tahunBerdiri,String rajaTerkenal, String peninggalanSejarah){
        Kerajaan kerajaan = kerajaanRepository.findById(id).get();
     kerajaan.setNamaIslam(namaIslam);
     kerajaan.setLetak(letak);
     kerajaan.setTahunBerdiri(tahunBerdiri);
     kerajaan.setRajaTerkenal(rajaTerkenal);
     kerajaan.setPeninggalanSejarah(peninggalanSejarah);
        return  kerajaanRepository.save(kerajaan);
    }
    @Override
    public  List<Kerajaan> getAllKerajaan(){
        return kerajaanRepository.findAll();
    }

    @Override
    public void deleteKerajaanById(Long id){
        kerajaanRepository.deleteById(id);
    }
}

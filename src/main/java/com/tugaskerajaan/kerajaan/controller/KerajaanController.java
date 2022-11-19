package com.tugaskerajaan.kerajaan.controller;

import com.tugaskerajaan.kerajaan.model.Kerajaan;
import com.tugaskerajaan.kerajaan.service.KerajaanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kerajaan")
public class KerajaanController {
    @Autowired
    private KerajaanService kerajaanService;

    @PostMapping
    public Kerajaan addKerajaan(@RequestBody Kerajaan kerajaan){
        return kerajaanService.addKerajaan(kerajaan);
    }
    @GetMapping("/{id}")
    public  Kerajaan getKerajaanByIdById(@PathVariable("id") Long id){
        return kerajaanService.getKerajaanById(id);
    }

//    PutMapping digunakan untuk mengedit data di postmen dengan memilih Put didalam pilihan dropdown
    @PutMapping("/{id}")
    public  Kerajaan editKerajaanById(@PathVariable("id") Long id,@RequestBody Kerajaan kerajaan){
        return  kerajaanService.editKerajaanById(id,kerajaan.getNamaIslam(),kerajaan.getLetak(),kerajaan.getTahunBerdiri(),kerajaan.getRajaTerkenal(),kerajaan.getPeninggalanSejarah());
    }
// All supaya untuk menampilkan semua yang ada di dalam data dengan menambahkan (/all) di dalam link
    @GetMapping("/all")
    public List<Kerajaan> getAllKerajaan(){
        return kerajaanService.getAllKerajaan();
    }

//    DeleteMapping berguna untuk menghapus berdasarkan id yg di masukkan didalam link
    @DeleteMapping("/{id}")
    public void deleteSekolahById(@PathVariable("id") Long id){
        kerajaanService.deleteKerajaanById(id);
    }

}

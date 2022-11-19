package com.tugaskerajaan.kerajaan.repository;


import com.tugaskerajaan.kerajaan.model.Kerajaan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KerajaanRepository extends JpaRepository<Kerajaan,Long> {
}
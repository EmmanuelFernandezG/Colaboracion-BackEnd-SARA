package com.example.actualizarBases.Modelo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.actualizarBases.Modelo.pool;

@Repository
public interface poolRepository extends JpaRepository<pool, Long>{

}

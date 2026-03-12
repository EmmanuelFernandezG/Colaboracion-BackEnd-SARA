package com.example.actualizarBases.Modelo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.actualizarBases.Modelo.precios;

@Repository
public interface preciosRepository extends JpaRepository<precios, Long>{

}

package com.example.actualizarBases.Modelo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.actualizarBases.Modelo.Soc;

/*
 * JpaRepository en Spring Boot es una interfaz de Spring Data JPA,
 * simplifica el acceso a bases de datos relacionales
 * Permite realizar operaciones CRUD (crear, leer, actualizar, borrar) y 
 * paginación sin escribir código SQL o implementaciones de clase, ya que Spring 
 * genera la implementación en tiempo de ejecución
 */
@Repository
public interface SocRepository extends JpaRepository<Soc, Long >{ //JpaRepository<Entidad, TipoID>

	/*
	 * MÉTODOS
	 * .save(objeto) inserta o actualiza
     *.saveAll(lista) inserción masiva (como en template batch)
     *.findAll() trae toda la tabla
     *.deleteById(id) borra un registro
	 */
}

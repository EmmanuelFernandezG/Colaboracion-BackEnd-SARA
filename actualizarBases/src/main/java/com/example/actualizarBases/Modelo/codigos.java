package com.example.actualizarBases.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="codigos")
@AllArgsConstructor
@NoArgsConstructor
public class codigos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private int Codigo;
	private String Clave;
	private String Descripcion;
	//@Column(name = "ClvFamSAP")
	private String ClvFamSAP;
	private String FamiliaSAP;
	//@Column(name = "MarcaComercial")
	private String MarcaComercial;
	private String Contactos;
	//@Column(name = "UnidadDeNegocio")
	private String UnidadDeNegocio;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getClave() {
		return Clave;
	}
	public void setClave(String clave) {
		Clave = clave;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public String getClvFamSAP() {
		return ClvFamSAP;
	}
	public void setClvFamSAP(String clvFamSAP) {
		ClvFamSAP = clvFamSAP;
	}
	public String getFamiliaSAP() {
		return FamiliaSAP;
	}
	public void setFamiliaSAP(String familiaSAP) {
		FamiliaSAP = familiaSAP;
	}
	public String getMarcaComercial() {
		return MarcaComercial;
	}
	public void setMarcaComercial(String marcaComercial) {
		MarcaComercial = marcaComercial;
	}
	public String getContactos() {
		return Contactos;
	}
	public void setContactos(String contactos) {
		Contactos = contactos;
	}
	public String getUnidadDeNegocio() {
		return UnidadDeNegocio;
	}
	public void setUnidadDeNegocio(String unidadDeNegocio) {
		UnidadDeNegocio = unidadDeNegocio;
	}
}

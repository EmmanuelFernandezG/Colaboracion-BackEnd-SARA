package com.back.cd.back.cd.Modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="socs_log")
public class socs_log_modelo {
	@Id
	private Long noPo;
	private LocalDate autorizacionPrevia;
	private String comentariosDoc;
	private LocalDate fefiPlan;
	private String comentariosPlan;
	private LocalDate fefCompras;
	private String comentariosCompras;
    private String numeroReimp;
    private String comentariosReimp;
    private String statusReimp;
    private LocalDate fechaFinalPlan;
    private LocalDate fechaFinalCompras;
	public Long getNoPo() {
		return noPo;
	}
	public void setNoPo(Long noPo) {
		this.noPo = noPo;
	}
	public LocalDate getAutorizacionPrevia() {
		return autorizacionPrevia;
	}
	public void setAutorizacionPrevia(LocalDate autorizacionPrevia) {
		this.autorizacionPrevia = autorizacionPrevia;
	}
	public String getComentariosDoc() {
		return comentariosDoc;
	}
	public void setComentariosDoc(String comentariosDoc) {
		this.comentariosDoc = comentariosDoc;
	}
	public LocalDate getFefiPlan() {
		return fefiPlan;
	}
	public void setFefiPlan(LocalDate fefiPlan) {
		this.fefiPlan = fefiPlan;
	}
	public String getComentariosPlan() {
		return comentariosPlan;
	}
	public void setComentariosPlan(String comentariosPlan) {
		this.comentariosPlan = comentariosPlan;
	}
	public LocalDate getFefCompras() {
		return fefCompras;
	}
	public void setFefCompras(LocalDate fefCompras) {
		this.fefCompras = fefCompras;
	}
	public String getComentariosCompras() {
		return comentariosCompras;
	}
	public void setComentariosCompras(String comentariosCompras) {
		this.comentariosCompras = comentariosCompras;
	}
	public String getNumeroReimp() {
		return numeroReimp;
	}
	public void setNumeroReimp(String numeroReimp) {
		this.numeroReimp = numeroReimp;
	}
	public String getComentariosReimp() {
		return comentariosReimp;
	}
	public void setComentariosReimp(String comentariosReimp) {
		this.comentariosReimp = comentariosReimp;
	}
	public String getStatusReimp() {
		return statusReimp;
	}
	public void setStatusReimp(String statusReimp) {
		this.statusReimp = statusReimp;
	}
	public LocalDate getFechaFinalPlan() {
		return fechaFinalPlan;
	}
	public void setFechaFinalPlan(LocalDate fechaFinalPlan) {
		this.fechaFinalPlan = fechaFinalPlan;
	}
	public LocalDate getFechaFinalCompras() {
		return fechaFinalCompras;
	}
	public void setFechaFinalCompras(LocalDate fechaFinalCompras) {
		this.fechaFinalCompras = fechaFinalCompras;
	}
}

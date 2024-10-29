package ej19;

import java.time.LocalDate;

public abstract class Envio {
	private LocalDate fecha;
	private String orDireccion;
	private String deDireccion;
	private double peso;
	
	public Envio(LocalDate fecha, String orDireccion, String deDireccion, double peso) {
		super();
		this.fecha = fecha;
		this.orDireccion = orDireccion;
		this.deDireccion = deDireccion;
		this.peso = peso;
	}

	abstract double getMonto();
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getOrDireccion() {
		return orDireccion;
	}

	public void setOrDireccion(String orDireccion) {
		this.orDireccion = orDireccion;
	}

	public String getDeDireccion() {
		return deDireccion;
	}

	public void setDeDireccion(String deDireccion) {
		this.deDireccion = deDireccion;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}

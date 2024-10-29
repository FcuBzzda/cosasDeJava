package ej19;

import java.util.LinkedList;
import java.util.stream.Stream;
import java.time.LocalDate;

public abstract class Persona {
	private String nombre;
	private String direccion;
	private LinkedList<Envio>envios;
	
	public Persona(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.envios = new LinkedList<>();
	}
	
	public void agregarEnvio(Envio envio){
		this.envios.add(envio);
	}
	
	public double getMontoEnIntervalo(LocalDate to, LocalDate from){
		//Recorrer lista de envios
		//Si el envio esta en el lapso
		//Llamar al metodo para obtener su monto especifico
		//y sumarlo al total
		Stream<Envio> A = envios.stream().filter(Elemento -> Elemento.getFecha().isAfter(from) && Elemento.getFecha().isBefore(to));
		return A.mapToDouble(Elemento -> Elemento.getMonto()).sum();
	}
}

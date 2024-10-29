package ej19;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio {
	private double distancia;

	public EnvioInterurbano(LocalDate fecha, String orDireccion, String deDireccion, double peso, double distancia) {
		super(fecha, orDireccion, deDireccion, peso);
		this.distancia = distancia;
	}
	
	public double getMonto(){
		if(this.distancia < 100){
			return 20*super.getPeso();
		}else{
			if(this.distancia < 500){
				return 25*super.getPeso();
			}else{
				return 30*super.getPeso();
			}
		}
	}
}

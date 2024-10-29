package ej19;

import java.time.LocalDate;

public class EnvioInternacional extends Envio {
	
	public EnvioInternacional(LocalDate fecha, String orDireccion, String deDireccion, double peso, boolean envioRapido) {
		super(fecha, orDireccion, deDireccion, peso);
	}
	
	public double getMonto(){
		if(super.getPeso()<1000){
			return 5000 + 10*super.getPeso();
		}else{
			return 5000 + 12*super.getPeso();
		}
	}
}

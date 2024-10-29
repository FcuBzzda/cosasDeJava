package ej19;

import java.time.LocalDate;

public class EnvioLocal extends Envio {
	
	private boolean envioRapido;

	public EnvioLocal(LocalDate fecha, String orDireccion, String deDireccion, double peso, boolean envioRapido) {
		super(fecha, orDireccion, deDireccion, peso);
		this.envioRapido = envioRapido;
	}
	
	public boolean getEnvioRapido(){
		return this.envioRapido;
	}
	
	public double getMonto(){
		if(this.envioRapido){
			return 1500;
		}else{
			return 1000;
		}
	}
}

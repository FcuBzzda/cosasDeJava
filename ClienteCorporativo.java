package ej19;

public class ClienteCorporativo extends Persona {
	private int CUIT;

	public ClienteCorporativo(String nombre, String direccion, int cUIT) {
		super(nombre, direccion);
		CUIT = cUIT;
	}
	
	
}

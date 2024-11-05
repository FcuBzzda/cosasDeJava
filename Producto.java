package ejercicio23;

public class Producto {
	private String nombre;
	private String categoria;
	private double precio;
	private int cantDisp;
	
	private boolean disponible(int cant){
		return this.cantDisp >= cant;
	}
	
	public boolean solicitarProducto(int cant){
		if(this.disponible(cant)){
			this.cantDisp -= cant;
			return true;
		}else{
			return false;
		}
	}
	
	public double getPrecio(){
		return this.precio;
	}
	
	public String getCat(){
		return this.categoria;
	}
}

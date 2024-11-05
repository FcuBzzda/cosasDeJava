package ejercicio23;

public class Pedido {
	private String formPago;
	private String formEnvio;
	private Producto prod;
	private int cant;
	
	public Pedido(String formP,String formE, Producto p, int c){
		this.formPago = formP;
		this.formEnvio = formE;
		this.prod = p;
		this.cant = c;
	}
	
	public double calcularCosto(){
		double precioBase = prod.getPrecio();
		if (this.formPago.equals("6 cuotas")){
			precioBase += (precioBase/100)*20;
		}
		double precioAdicional = 0;
		if (this.formEnvio.equals("retirar en sucursal del correo")){
			precioAdicional += 3000;
		}else{
			if (this.formEnvio.equals("express a domicilio")){
				precioAdicional += 100;
			}
		}
		return precioBase + precioAdicional;
	}
	
	public Producto getProducto(){
		return this.prod;
	}
}

public class cilindro extends pieza {
	private int radio;
	private  int altura;
	
	public cilindro(int radio, int altura, String material, String color) {
		super(material,color);
		this.radio = radio;
		this.altura = altura;
	}
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public double getVolumen(){
		return (Math.PI * (this.radio*this.radio)*this.altura);
	}
	
	public double getSuperficie(){
		return (2*Math.PI*this.radio*this.altura+2*Math.PI*(Math.pow(this.radio, 2)));
	}
}

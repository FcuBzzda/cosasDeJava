public class esfera extends pieza{
	private int radio;
	
	public esfera(int radio, String material, String color) {
		super(material,color);
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public double getVolumen(){
		return ((4/3)*Math.PI*Math.pow(this.radio, 3));
	}
	
	public double getSuperficie(){
		return (4*Math.PI*Math.pow(this.radio, 2));
	}
}

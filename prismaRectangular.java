public class prismaRectangular extends pieza {
	private int ladoMayor;
	private int ladoMenor;
	private int altura;
	
	public prismaRectangular(int ladoMayor, int ladoMenor, int altura, String material, String color) {
		super(material,color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}
	
	public int getLadoMayor() {
		return ladoMayor;
	}
	public void setLadoMayor(int ladoMayor) {
		this.ladoMayor = ladoMayor;
	}
	public int getLadoMenor() {
		return ladoMenor;
	}
	public void setLadoMenor(int ladoMenor) {
		this.ladoMenor = ladoMenor;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public double getVolumen(){
		return (this.ladoMayor*this.ladoMenor*this.altura);
	}
	
	public double getSuperficie(){
		return (2*(this.ladoMayor*this.ladoMenor+this.ladoMayor*this.altura+this.ladoMenor*this.altura));
	}
	
}

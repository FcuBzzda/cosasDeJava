import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.List;

public class reporteDeConstruccion {
	public LinkedList<pieza> piezas;
	
	public reporteDeConstruccion(){
		this.piezas = new LinkedList<>();
	}
	
	public void addPieza(pieza Item){
		this.piezas.add(Item);
	}
	
	public double volumenDelMaterial(String Mat){
		List<pieza>piezasFiltradas=this.piezas.stream().filter(A -> A.getMaterial().equals(Mat)).collect(Collectors.toList());
		return piezasFiltradas.stream().mapToDouble(pieza::getVolumen).sum();
	}
	
	public double superficieDelColor(String Col){
		List<pieza>piezasFiltradas=this.piezas.stream().filter(A -> A.getColor().equals(Col)).collect(Collectors.toList());
		return piezasFiltradas.stream().mapToDouble(pieza::getSuperficie).sum();
	}
}

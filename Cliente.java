package ejercicio23;

import java.util.LinkedList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.HashMap;

public class Cliente extends Persona{
	private LinkedList<Pedido>pedidos;
	
	public void añadirPedido(String fp, String fe, Producto p, int cant){
		if(p.solicitarProducto(cant)){
			Pedido pedido = new Pedido(fp,fe,p,cant);
			pedidos.add(pedido);
		}
	}
	
	public HashMap<String, Integer>prodPorCat(){
		HashMap<String, Integer> A;
		/////pedidos.stream().collect(Collectors.groupingBy(E -> E.getProducto().getCat()), Collectors.counting());
	}
}

//Ta incompleto esto todavia

//Importar el paquete de listas (LinkedList)
public class Farola {

    private List<Farola>vecinos = new LinkedList();
    private boolean luz;
    
  //Crear una farola. Debe inicializarla como apagada

    public Farola () {
      this.luz = false;
    }
    
  //Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje

    public void pairWithNeighbor( Farola otraFarola ) {
      this.getNeightbors.add(otraFarola);
      otraFarola.pairWithNeighbor(this);
    }
    
 //Retorna sus farolas vecinas
 
    public List<Farola> getNeighbors () {
      return this.vecinos;
    }



 //Si la farola no está encendida, la enciende y propaga la acción.

    public void turnOn () {
      if(!luz){
        this.luz = true;
        
      }
    }

 //Si la farola no está apagada, la apaga y propaga la acción.

    public void turnOff () {
    
    }
    
    
  //Retorna si la farola esta encendida.
  
    public boolean isOn () {
    
    }

}



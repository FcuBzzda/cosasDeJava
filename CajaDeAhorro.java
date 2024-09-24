public class CajaDeAhorro extends Cuenta{
	
	public CajaDeAhorro() {
		super();
	}
	
	public boolean puedeExtraer(double monto) {
		double montoImpuesto = monto * 0.02;
		return this.getSaldo() >= (monto + montoImpuesto);
	}
	
	public void depositar (double monto) {
		double montoImpuesto = monto * 0.02;
		super.depositar(monto - montoImpuesto);
	}
}

public class CuentaCorriente extends Cuenta {
		private double limite;
		
		public CuentaCorriente() {
			super();
			this.limite = 0;
		}
		
		public void setDescubierto(double descubierto) {
			this.limite = descubierto;
		}
		
		public double getDescubierto() {
			return this.limite;
		}
		
		public boolean puedeExtraer(double monto) {
			return ((this.getSaldo() - monto) >= this.getDescubierto());
		}
}

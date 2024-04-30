package ejercicio01;

public class CuentaCorriente extends Cuenta{
	private double descubierto;
	
	public CuentaCorriente() {
		descubierto = 1000; ///El monto del descubierto lo pone el Banco
		saldo += descubierto;
	}
	
	public void extraerCuentaCorriente(double monto) throws Exception {
		extraerCuentaCorriente(monto);		
	}
}

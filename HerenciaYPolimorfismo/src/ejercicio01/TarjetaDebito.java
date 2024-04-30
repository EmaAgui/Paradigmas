package ejercicio01;

public class TarjetaDebito extends Cuenta{
	
	public TarjetaDebito() {
		super();
	}
	
	public void comprar(double monto) throws Exception {
		extraerDinero(monto);
	}
	
}

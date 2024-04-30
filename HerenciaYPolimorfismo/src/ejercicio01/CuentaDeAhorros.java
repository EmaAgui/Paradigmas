package ejercicio01;

public class CuentaDeAhorros extends Cuenta{
	protected double sueldoReservado;
	
	public CuentaDeAhorros() {
		super();
		this.sueldoReservado = 0;
	}
	
	public void reservarSueldo(double monto) throws Exception {
		extraerDinero(monto);
		sueldoReservado = monto;
	}
	
	public void reintegrarSueldo() throws Exception {
		depositarDinero(sueldoReservado);
	}
	
	public double consultarSaldoAhorro() {
		return sueldoReservado;
	}
	
}

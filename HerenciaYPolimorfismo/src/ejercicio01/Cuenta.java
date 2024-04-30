package ejercicio01;


public class Cuenta {
	protected double saldo;
	
	public Cuenta() {
		this.saldo = 0;
	}

	public double consultarSaldo() {
		return saldo;
	}
	
	public void extraerDinero(double monto) throws Exception{
		saldodoMenorAMonto(monto);
		montoNegativo(monto);
		saldo -= monto;	
	}
	
	public void depositarDinero(double monto) throws Exception {
		montoNegativo(monto);
		saldo += monto;
	}
	
	public void saldodoMenorAMonto(double monto) throws Exception {
		if(saldo < monto) 
			throw new Exception("Error: Extracción menor al saldo disponible.");
	}
	
	public void montoNegativo(double monto) throws Exception{
		if(monto <= 0)
			throw new Exception("Error: no puedo depositar montos negativos o cero.");
	}

	public void transferir(double monto, Cuenta cuentaDestino) throws Exception {
		saldodoMenorAMonto(monto);
		cuentaDestino.depositarDinero(monto);
		extraerDinero(monto);
	}
}

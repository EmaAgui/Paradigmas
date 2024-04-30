package ejercicio01;

public class TarjetaCredito extends Cuenta{
    public static final double COMISION = 1.03;

    private double montoTarjeta;
    
    public TarjetaCredito() {
    	super();
    	setMontoTarjeta(montoTarjeta);
	}    
    
    public void comprar(double monto) throws Exception {
    	saldodoMenorAMonto(monto);
		montoNegativo(monto);
		saldo -= COMISION * monto;	
    }

	public double getMontoTarjeta() {
		return montoTarjeta;
	}

	public void setMontoTarjeta(double montoTarjeta) {
		if(this.saldo > 1000)
    		montoTarjeta = saldo * 3;
    	montoTarjeta = 3000;
	}
}

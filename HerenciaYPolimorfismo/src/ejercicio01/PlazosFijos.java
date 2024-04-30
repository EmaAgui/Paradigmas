package ejercicio01;

public class PlazosFijos extends CuentaDeAhorros{
    public static final double INTERES_ANUAL = 1.36;
    
    public PlazosFijos() {
    	super();
	}
    
    public void reintegrarSueldo() throws Exception {
    	depositarDinero(sueldoReservado * INTERES_ANUAL);
    }
}

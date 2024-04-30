package app;

import ejercicio01.Cuenta;

public class App {

	public static void main(String[] args) throws Exception  {
		
		ejemplo0203();

	}
	
	public static void ejemplo0203() throws Exception{
		Cuenta cuentaOrigen = new Cuenta();
		cuentaOrigen.depositarDinero(10000);
		System.out.println(cuentaOrigen.consultarSaldo()); // 10000
		Cuenta cuentaDestino = new Cuenta();
		System.out.println(cuentaDestino.consultarSaldo()); // 0
		cuentaOrigen.transferir(10000, cuentaDestino);
		System.out.println(cuentaOrigen.consultarSaldo()); // 9450
		System.out.println(cuentaDestino.consultarSaldo()); // 550
		
		///Resolver Parte cuatro
	}
	
	public static void ejemplo01() throws Exception{
		Cuenta miCuenta = new Cuenta();
		
		miCuenta.depositarDinero(100);
		System.out.println(miCuenta.consultarSaldo());
		
		miCuenta.extraerDinero(101);
		
		System.out.println(miCuenta.consultarSaldo());
	}
}

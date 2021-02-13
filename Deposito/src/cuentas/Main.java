package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta miCuenta;
        
        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuenta(miCuenta, 13525.14F);
    }

	private static void operativa_cuenta(CCuenta miCuenta, float cantidad) {
		double saldoActual;
		saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
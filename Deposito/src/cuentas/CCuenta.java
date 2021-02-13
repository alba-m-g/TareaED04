package cuentas;

/**
 * Clase que gestiona los datos de una cuenta bancaria.
 * 
 * @author Alba Mangas García 
 */

public class CCuenta {
	
	// Declaración de atributos.
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto.
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor parametrizado.
     * 
     * @param nom Nombre del titular de la cuenta.
     * @param cue Cuenta bancaria.
     * @param sal Saldo de la cuenta.
     * @param tipo Tipo de interés que tiene la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Devuelve el nombre del titular de la cuenta.
     * 
     * @return nombre Nombre del titular.
     */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Modifica el nombre del titular de la cuenta.
	 * 
	 * @param nombre Nombre del titular.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
    /**
     * Devuelve la cuenta bancaria.
     * 
     * @return Cuenta bancaria.
     */
    public String getCuenta() {
		return cuenta;
	}
    
    /**
     * Modifica la cuenta bancaria.
     * 
     * @param cuenta Cuenta bancaria
     */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * Devuelve el saldo de la cuenta.
	 * 
	 * @return saldo Saldo de la cuenta.
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * Modifica el saldo de la cuenta.
	 * 
	 * @param saldo Saldo.
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Devuelve el tipo de interés de la cuenta.
	 * 
	 * @return Tipo de interés.
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}
	
	/**
	 * Modifica el tipo de interés.
	 * 
	 * @param tipoInterés Tipo de interés.
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	
	/**
	 * Devuelve el estado de la cuenta.
	 * 
	 * @return Saldo de la cuenta. 
	 */
	public double estado()
    {
        return saldo;
    }
	
	/**
	 * Devuelve el saldo actual de la cuenta más la cantidad ingresada.
	 * 
	 * @param cantidad Dinero a ingresar.
	 * @throws Exception Si la cantidad es menor a 0 se mostrará un mensaje de error.
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * Método que devuelve el saldo actual de la cuenta menos la cantidad retirada.
     * 
     * @param cantidad Dinero a retirar.
     * @throws Exception Si la cantidad es menor o igual a 0 o menor que el saldo disponible
     *                   se mostrará un mensaje de error.   
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }    
}

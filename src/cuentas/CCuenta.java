package cuentas;

/**
 * Clase que almacena el objeto CCuenta.
 * @author Borja
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacío de CCuenta.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor en el que se dan valor a los atributos.
     * @param nom - nombre de la cuenta
     * @param cue - numero de la cuenta
     * @param sal - saldo de la cuenta
     * @param tipo - tipo de interes de la cuenta 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Devuelve el valor del saldo de la cuenta.
     * @return - saldo de la cuenta
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Suma una cantidad positiva al saldo de la cuenta.
     * @param cantidad - cantidad que se ingresa.
     * @throws Exception - Si la cantidad es negativa, lanza una excepción.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Resta una cantidad menor que el saldo al saldo actual.
     * @param cantidad - cantidad que se retira.
     * @throws Exception - Si la cantidad es mayor que el saldo, lanza una excepción.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * Devuelve el atributo del nombre de la cuenta.
     * @return - devuelve el nombre de la cuenta
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Da valor al atributo del nombre de la cuenta.
     * @param nombre - nuevo valor del nombre de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el atributo del numero de la cuenta.
     * @return - devuelve el numero de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Da valor al atributo del numero de la cuenta.
     * @param cuenta - nuevo valor del numero de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el atributo del saldo de la cuenta.
     * @return - devuelve el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Da valor al atributo del saldo de la cuenta.
     * @param saldo - nuevo valor del saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el atributo del tipo de interes de la cuenta.
     * @return - devuelve el tipo de interes de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Da valor al atributo del tipo de interes de la cuenta.
     * @param tipoInterés - nuevo valor del tipo de interes de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}

package cuentas;

/**
 * Clase CCuenta del ejercicio ED04
 * @author Víctor Tasis González
 */
public class CCuenta {
   //Atributos de CCuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacío CCuenta
     */
    public CCuenta()
    {
    }

    /**
     * Constructor CCuenta usado normalmente
     * @param nom el nombre de cuenta
     * @param cue el número de cuenta
     * @param sal el saldo cuenta
     * @param tipo el tipo de cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Devuelve el saldo de la cuenta
     * @return saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para ingresar saldo en la cuenta
     * @param cantidad saldo a ingresar
     * @throws Exception si se ingresa cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0) //Si la cantidad es menor de "0"
            throw new Exception("No se puede ingresar una cantidad negativa"); //Lanza excepción
        setSaldo(getSaldo() + cantidad); //Guardar el saldo resultante de la operación
    }

    /**
     * Método para retirar saldo de la cuenta
     * @param cantidad saldo a retirar
     * @throws Exception si se retira una cantidad negativa
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0) //Si la cantidad es menor o igual a "0"
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad) //Si el saldo es inferior a la cantidad a retirar
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad); //Guardar el saldo resultante de la operación
    }

    /**
     * Método Get para que devuelve el nombre
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método Set para que guarde el nombre
     * @param nombre el nombre a guardar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método Get para que devuelve la cuenta
     * @return la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método Set para que guarde la cuenta
     * @param cuenta la cuenta a guardar
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método Get para que devuelve el saldo de la cuenta
     * @return el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método Set para que guarde el saldo de la cuenta
     * @param saldo el saldo a guardar
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método Get para que devuelve el tipo de Interés
     * @return el tipo de Interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método Set para que guarde el tipo de Interés
     * @param tipoInterés el tipo de Interés a guardar
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}


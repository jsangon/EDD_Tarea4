package cuentas;

/**
 * Clase CCuenta. 
 *
 * @version 29-01-2023
 * @author Jesús Santos González
 */
public class CCuenta {

    /**
     * Nombre del titular de la cuenta.
     */
    private String nombre;

    /**
     * Número de cuenta. dsa
     * 
     */
    private String cuenta;

    /**
     * Saldo actual de la cuenta.
     */
    private double saldo;

    /**
     * Tipo de interés de la cuenta.
     */
    private double tipoInterés;

    /**
     * Constructor vacío
     */
    public CCuenta() {
    }

    /**
     * Constructor para la cuenta
     *
     * @param nom nombre del titular
     * @param cue identificador de la cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Metodo estado
     *
     * @return get saldo: saldo actual de la cuenta
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Metodo ingresar.Actualiza el saldo con la cantidad recibida como parámetro
     *
     * @param cantidad: cantidad a ingresar en la cuenta
     * @throws java.lang.Exception si cantidad es negativo
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo retirar.Actualiza el saldo con la cantidad recibida como parámetro
     *
     * @param cantidad: cantidad a retirar en la cuenta
     * @throws java.lang.Exception si la cantidad es negativa o no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método getNombre
     *
     * @return nombre: nombre del titular de la cuenta.
     */
    private String getNombre() {
        return nombre;
    }

    /**
     * Método setNombre
     *
     * @param nombre: nombre del titular de la cuenta
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getCuenta
     *
     * @return cuenta: número de cuenta.
     */
    private String getCuenta() {
        return cuenta;
    }

    /**
     * Método setNombre
     *
     * @param cuenta: número de cuenta
     */
    private void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método getSaldo
     *
     * @return saldo: saldo actual de la cuenta.
     */
    private double getSaldo() {
        return saldo;
    }

    /**
     * Método setNombre
     *
     * @param saldo: Saldo de la cuenta
     */
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método getTipoInterés
     *
     * @return tipoInterés: tipo de interes actual de la cuenta.
     */
    private double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método setNombre
     *
     * @param tipoInterés: Tipo de intereés de la cuenta
     */
    private void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}

package cuentas;

/**
 * Clase Main del ejercicio ED04
 * @author Víctor Tasis González
 */
public class Main {
    public static void main(String[] args) {
       //Ejecución método refactorizado en la tarea
        operativa_cuenta(2500);
    }

    /**
     * Método "operativa_cuenta" creado a través de refactorización, por orden de la tarea
     * @param cantidad cantidad de inicio de la cuenta
     */
    public static void operativa_cuenta(float cantidad) {
        //Atributos
        CCuenta cuenta1; //Declaración de objeto
        double saldoActual; 
        //Instanciar objeto cuenta
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",cantidad,0);
        //Guardar saldo actual en variable
        saldoActual = cuenta1.estado();
        //Mostrar saldo
        System.out.println("El saldo actual es"+ saldoActual );
        
        //Realizar operaciones
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        
    }//Fin metodo operativa_cuenta()
}//Fin Main

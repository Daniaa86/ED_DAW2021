/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package daw_ed04_actividad;


public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        String nombre; 
        
        cuenta1 = new CCuenta("Pepe Fernández","1023-2464-90-1232256789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es: " + saldoActual );
        
        opera(cuenta1);
        
        nombre=cuenta1.getNombre_cliente();
        System.out.println ("El nombre del propietario de la cuenta es "+ nombre);
    }

    private static void opera(CCuenta cuenta1) {
        try {
            float cantRetirar=2300;
            cuenta1.retirar(cantRetirar);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            float cantIngresar=695;
            cuenta1.ingresar(cantIngresar);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}

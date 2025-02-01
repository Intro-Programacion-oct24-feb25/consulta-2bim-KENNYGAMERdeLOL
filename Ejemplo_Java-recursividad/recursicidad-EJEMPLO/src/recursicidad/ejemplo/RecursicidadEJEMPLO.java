/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursicidad.ejemplo;

/**
 *
 * @author Usuario
 */
public class RecursicidadEJEMPLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 10;
        System.out.println("El factorial de " + numero + " es: "
                + factorial(numero));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1); // Recursividad
        }

    }
}

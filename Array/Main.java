/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cice
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean esMayor = 2 < 45;
        boolean esMenor = 2 > 10;
        
        int numero = 2;
        //Numero ++; //Numero = numero + 1; numero += 1;
        //numero++ pinta y despues asigna uno mas
        //++ numero primero asigna y despues pinta
        //System.out.println (numero++);
        System.out.println("Valor original de número es: ");
        System.out.println(numero);
        
        System.out.println("Asignación de un numero más despues de llamada:");
        System.out.println (numero++ + ", Nuevo valor: " + numero);
        System.out.println("Asignación de un numero menos antes de llamada:");
        System.out.println (--numero + ", Nuevo valor: " + numero);
        
        System.out.println("Asignación de un numero más antes de llamada:");
        System.out.println (++numero + ", Nuevo valor: " + numero);
        System.out.println("Asignación de un numero menos despues de llamada:");
        System.out.println (numero-- + ", Nuevo valor: " + numero);
        
        System.out.println("\n");
        
        numero *= 4;
        System.out.println("Multiplicacion y asignacion de numero por 4: \n" + numero);
        numero /= 2;
        System.out.println("Division y asignacion de numero entre 2: \n" + numero);
        numero %= 2;
        System.out.println("Modulo y asignación de numero a 2: \n" + numero);
    }
    
}

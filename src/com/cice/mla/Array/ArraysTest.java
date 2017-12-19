
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cice
 */
public class ArraysTest {
    
    static int[] arrayNumeros; // Aqui nunca se asigna el valor directamente

    public static void main (String[] args){
        arrayNumeros = new int[4];
        arrayNumeros[0] = 4;
        
        //otra manera
        int[] arrayNumeros2 = new int[]{1, 2, 3, 4, 5};
        
        //otra manera
        int arrayNumeros3[] = {1, 2, 3, 4};
        
        
        
        int[] arrayNumeros4 = { 4, 5, 6, 8 }; 
        //Pregunta de examen
        // {} Solo si es declaración y asignación inmediata, no funciona las llaves de otra manera
        // Los arrays no pueden crecer, salvo que hagamos una copia sobre otro de mayor tamaño
        
        int[] nuevo = Arrays.copyOf(arrayNumeros4, 30);
        System.out.println(nuevo.length);
        
        // Arrays multidimensionales
        int[][] dos = new int [2] [4];
        int[][][] tres = new int [2][4][8];
        
        int[][][][][][][] muchos = new int [1][2][3][4][5][6][7];
        
        int[] bi[] = new int [2][];
        
        bi[0] = new int []{1, 2, 3};
        bi[1] = new int []{1, 2, 3, 4, 5};
        
        
        
    }
    
}

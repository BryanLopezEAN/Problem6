/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Bryan Lopez Avila
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Problem6 p6 = new Problem6();
        int n_tests;
        String list;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de tests a realizar: ");
        n_tests = sc.nextInt();
        
        for (int i = 0; i < n_tests; i++) {
            System.out.println("Número de elementos de la lista: ");
            int n_list = sc.nextInt();
            
            sc.nextLine();
            
            System.out.println("Ingrese los números de la lista");
            list = sc.nextLine();
            
            if (p6.swaps(n_list, list) != -1) {
                System.out.println("La cantidad de intrecambios es: " + p6.swaps(n_list, list));
            }else {
                System.out.println("El número de elementos no corresponde a la cantidad de numeros ingresados");
            }
        }
    }
    
    /*
    * Función encargada de ordenar la lista y devolver la cantidad de intercambios
    */
    public int swaps(int number, String numbers){
        int swap = 0;
        String[] values = numbers.split(" ");
        
        //Validamos que el numero de elementos corresponda a la cantidad de elementos ingresados
        if (number == values.length) {
            int temp;
            boolean swapped = true; //Iniciamos una variable para romper el ciclo
            
            int[] list = new int[number]; //creamos un arreglo de enteros
            
            //Asignamos los valores que vienen en un string a un arreglo de enteros
            for (int i = 0; i < values.length; i++) {
                list[i] = Integer.parseInt(values[i]);
            }
            
            while(swapped){
                swapped = false;    //Cambiamos el estado de la variable en caso de no entrar a la validación
                for (int j = 0; j < list.length - 1; j++) {
                    //Validamos que la posición actual sea mayor que la pasoción actual + 1
                    if (list[j] > list[j + 1]) {
                        swap++;     //Aumentamos la cantidad de intercambios en 1
                        temp = list[j];
                        list[j] = list[j + 1];
                        list[j + 1] = temp;
                        swapped = true;
                    }
                }
            } 
        }else {
            swap = -1;
        }
        
        return swap;
    }
}

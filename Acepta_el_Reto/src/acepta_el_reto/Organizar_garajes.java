/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta_el_reto;

import java.util.Scanner;

/**
 *
 * @author patsus
 */
public class Organizar_garajes {

    static int indice;
    static int p;

    public static boolean resuelveCaso(int[] hangar, int[] naves) {
        //mira si es posible entrar naves en el hangar
        // primero dime gangar
        // despues lleganave
        // antes de todo comparar si entra o no
        return true;
    }

    public static boolean lleganave(int[] hangar, int tamanonaves) {
        //restarle a hangar el tamaño de la nave y mostrar si ha podido entrar o no
        if (hangar[dimehangar(hangar)] < tamanonaves) {
            return false;
        } else {
            return true;
        }
    }

    public static int dimehangar(int[] hangar) {
        indice = Integer.MIN_VALUE;
        for (int i = 0; i < hangar.length; i++) {
            if (hangar[i] > indice) {
                indice = hangar[i];
                p = i;
            }
        }

        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hangares = 1;
        int naves;
       

        while ((hangares = sc.nextInt()) != 0) {        
            
            // procesamos hangares
            int[] hangar = new int[hangares];
            for (int i = 0; i < hangares; i++) {
                int tamano = sc.nextInt();
                hangar[i] = tamano;//guardo todos los hangares con sus tamaños en un vector
            }
            
            // procesamos naves
            naves = sc.nextInt();//cantidad naves
            int[] nave = new int[naves];
            for (int j = 0; j < naves; j++) {
                int tamanonaves = sc.nextInt();
                nave[j] = tamanonaves;//guardo todas las naves en un vector
            }
            
            // resolver caso
            boolean resultado= resuelveCaso(hangar,nave);
            if(resultado==true)
            System.out.println("SI");
            else
                System.out.println("NO");
        }
    }
}

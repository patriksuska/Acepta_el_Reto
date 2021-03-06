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

   
    static int p;

    public static boolean resuelveCaso(int[] hangar, int[] nave) {
        //mira si es posible entrar naves en el hangar
        // primero dime hangar
        int posicion=dimehangar(hangar);
        // antes de todo comparar si entra o no
        for (int i = 0; i < nave.length; i++) {
            // despues lleganave
            if (lleganave(hangar,nave[i])) {
            }
            else 
                return false;
        }
       return true;
    }

    public static boolean lleganave(int[] hangar, int tamanonaves) {
        //restarle a hangar el tamaño de la nave y mostrar si ha podido entrar o no
        if (hangar[dimehangar(hangar)] < tamanonaves) {
            return false;
        } else {
            hangar[dimehangar(hangar)]=hangar[dimehangar(hangar)]-tamanonaves;
            return true;
        }
    }

    public static int dimehangar(int[] hangar) {
       int indice = Integer.MIN_VALUE;
       p=0;
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
        int hangares=0;
        int naves=0;
        while ((hangares = sc.nextInt()) != 0) {
            sc.nextLine();
            int[] hangar = new int[hangares];
            // procesamos hangares            
            for (int i = 0; i < hangares; i++) {
                hangar[i] = sc.nextInt();//guardo todos los hangares con sus tamaños en un vector
            }
            // procesamos naves
            naves = sc.nextInt();//cantidad naves
            int[] nave = new int[naves];
            for (int j = 0; j < naves; j++) {           
                nave[j] = sc.nextInt();//guardo todas las naves en un vector
            }
            // resolver caso
            boolean resultado = resuelveCaso(hangar, nave);
            if (resultado == true) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}

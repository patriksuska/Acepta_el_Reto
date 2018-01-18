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
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int hangares=1;
        int tamano;
        int naves;
        int tamanonaves;
        
        while (hangares!=0){
        hangares=sc.nextInt();//cantidad hangares
        tamano=0;//tamaño hangares
        naves=sc.nextInt();//cantidad naves
        tamanonaves=0;//tamaño naves
        int []hangar=new int[tamano];
        int []nave=new int[tamanonaves];
        for (int i=0;i<hangares;i++)
        {
            tamano=sc.nextInt();
        }
        for (int j=0;j<naves;j++)
        {
            tamanonaves=sc.nextInt();
        }
        
        }
    }
}

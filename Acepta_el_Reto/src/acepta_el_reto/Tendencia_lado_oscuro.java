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
public class Tendencia_lado_oscuro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cuantos casos de prueba
        Scanner sc=new Scanner (System.in);
        int cant=sc.nextInt();
        int num;
        int y;
        int j;
        int cont=0;
        // Guardamos todos los casos
        int v[]=new int[cant];
        for (int i=0;i<cant;i++)
        {
            num=sc.nextInt();
            v[i]=num;
        }
        
        // Para cada caso
        for (j=0;j<cant;j++){
            cont=0;
            char[] resultado=Integer.toString(v[j],5).toCharArray();
            for(y=0;y<resultado.length;y++){
            
                if(resultado[y]=='4')
                    {
                        cont++;
                    }
            }
            System.out.println(resultado);
            if (cont>=2)
            {
                System.out.println("SI");
            }
            else
                System.out.println("NO");
        }
    }
    
}

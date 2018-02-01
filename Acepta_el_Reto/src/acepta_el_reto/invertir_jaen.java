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

public class invertir_jaen {
    public static int cont=0;
    public static int espai=0;
    public static int contar(char [][] matriz,int i,int j){
       int filas=matriz.length;
       int columnas=matriz[0].length;
       
       if (i<0 || j<0 || i>=filas || j>=columnas)
       {
           return 0;
       }
       if (matriz[i][j]=='#')
       {
           return 1+contar(matriz,i,j+1);
       }
       else//comparar cual es mayor y cuando termina puesto en space,guarda el numero total en una posicion del vector.
        return 0+contar(matriz,i,j+1);
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x0;
        int y0;
        int resultado;
        do {
            //procesar filas
            int filas = sc.nextInt();
            //procesar columnas
            int colum = sc.nextInt();
            sc.nextLine();
            //creo las filas y columnas
            char[][] matriz = new char[filas][colum];
            for (int x=0;x<filas;x++){
                //pido datos
                String linea = sc.nextLine();
                for(int y=0;y<colum;y++){
                    matriz[x][y]=linea.charAt(y);
                    //compruebo que este la #
                }
            }
            resultado=contar(matriz,0,0);
            System.out.println(resultado);
        }while(sc.hasNext());
        sc.close();
    }   
}
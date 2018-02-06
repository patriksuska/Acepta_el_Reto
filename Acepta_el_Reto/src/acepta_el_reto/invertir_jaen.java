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
    public static int contar(char [][] matriz,int i,int j){
       int filas=matriz.length;
       int columnas=matriz[0].length;
       int tamaño=0;
       if (i<0 || j<0 || i>=filas || j>=columnas)
       {
           return 0;
       }
       if(matriz[i][j]==' ')
       {
           return 0;
       }
       if (matriz[i][j]=='#')
       {
           matriz[i][j]=' ';
           
           tamaño++;
           tamaño+=contar(matriz,i,j+1);
           tamaño+=contar(matriz,i,j-1);
           tamaño+=contar(matriz,i+1,j);
           tamaño+=contar(matriz,i-1,j);
           return tamaño;
       }
        //comparar cual es mayor y cuando termina puesto en space,guarda el numero total en una posicion del vector.
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x;
        int y;
        int resultado=0;
        while(sc.hasNext()){
            int resultadomayor=0;
            //procesar filas
            int filas = sc.nextInt();
            //procesar columnas
            int colum = sc.nextInt();
            sc.nextLine();
            //creo las filas y columnas
            char[][] matriz = new char[filas][colum];
            for (x=0;x<filas;x++){
                //pido datos
                String linea = sc.nextLine();
                for(y=0;y<colum;y++){
                    matriz[x][y]=linea.charAt(y);
                }
            }
            for (int d=0;d<filas;d++){
                for (int c=0;c<colum;c++)
                {
                     //compruebo que este la #
                     if(matriz[d][c]=='#')
                        {
                            int a=d;
                            int b=c;
                            resultado=contar(matriz,a,b);
                            if(resultado>resultadomayor){
                                resultadomayor=resultado;
                            }
                        }
                }
            }
            System.out.println(resultadomayor);
        }
        sc.close();
    }   
}
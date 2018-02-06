/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta_el_reto;

import java.util.Scanner;

/**
 *
 * @author PATRIK
 */
public class Escapando_fuerzas_imperiales {
    public static boolean hayCamino(char[][] matriz, int i, int j) {
       int filas=matriz.length;
       int columnas=matriz[0].length;
       if (i<0 || j<0 || i>=filas || j>=columnas)
       {
           return false;
       }
       if (matriz[i][j]=='.' || matriz[i][j]=='S')
       {
           matriz[i][j]='*';
           if (hayCamino(matriz,i,j+1))
           {
               return true;
           }
           if(hayCamino(matriz,i,j-1))
           {
               return true;
           }
           if(hayCamino(matriz,i+1,j))
           {
               return true;
           }
           if(hayCamino(matriz,i-1,j))
           {
               return true;
           }
           else
           {
               return false;
           }
       }
       if (matriz[i][j]=='*')
       {
           return false;
       }
       if (matriz[i][j]=='F')
       {
           return true;
       }
       return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x0=0, y0=0;
        while (sc.hasNext()) {
            //procesar filas
            int filas = sc.nextInt();
            //procesar columnas
            int colum = sc.nextInt();
            sc.nextLine();
            //creo el mapa con las filas y columnas
            char[][] matriz = new char[filas][colum];
            for (int x=0;x<filas;x++){
                //pido datos
                String line = sc.nextLine();
                String linea =line.toUpperCase();
                for(int y=0;y<colum;y++){
                    matriz[x][y]=linea.charAt(y);
                    //compruebo que este la S
                    if(matriz[x][y]=='S'){
                        x0=x;
                        y0=y;
                    }
                }
            }
            //Comprueba el resultado
            if(hayCamino(matriz,x0,y0)){
                System.out.println("SI");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

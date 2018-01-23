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
        
        if(i==j-1){
            return true;
        }
        else
            return false;
    }
    
    public static void ImprimeMapa(char[][] mapa) {
        for(int i=0;i<mapa.length-1;i++){
            for (int j=0;j<mapa[i].length-1;j++) {
                System.out.print("" + mapa[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x0=0, y0=0;
        do {
            System.out.println("F: ");
            int filas = sc.nextInt();
            System.out.println("C: ");
            int colum = sc.nextInt();
            sc.nextLine();
            char[][] matriz = new char[filas][colum];
            for (int x=0;x<filas-1;x++){
                String line = sc.nextLine();
                sc.nextLine();
                String linea =line.toUpperCase();
                for(int y=0;y<colum-1;y++){
                    matriz[x][y]=linea.charAt(y);
                    if(matriz[x][y]=='S'){
                        x0=x;
                        y0=y;
                    }
                }
            }
            ImprimeMapa(matriz);
            if(hayCamino(matriz,x0,y0)){
                System.out.println("SI");
            }
            else{
                System.out.println("NO");
            }
        } while (sc.hasNext());
        
        sc.close();
    }
    
    
}

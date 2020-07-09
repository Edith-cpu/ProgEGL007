
package progegl007;

import java.util.Scanner;

public class ProgEGL007 {

    public static void main(String[] args) {
     int Filas, Columnas, Limite;
     Scanner Leer = new Scanner(System.in);
     System.out.println("Cantidad de filas:");
     Filas=Leer.nextInt();
     System.out.println("Cantidad de columnas:");
     Columnas=Leer.nextInt();
     System.out.println("Números aleatorios, inicia en 1 y termina ...");
     int [][] Matriz= new int[Filas][Columnas];
     Limite=Leer.nextInt();
     System.out.print("Array original:\n");
     for(int x=0; x<Filas;x++)
     {
         for(int y=0; y<Columnas; y++)
         {
             Matriz[x][y]=(int)(Math.random()*Limite+1);
             System.out.print(" "+Matriz[x][y]);
         }
         System.out.print("\n");
     }
     System.out.print("Array traspuesto:\n");
     for(int y=0; y<Columnas;y++)
     {
         for(int x=0; x<Filas; x++)
         {
             System.out.print(" "+Matriz[x][y]);
         }
         System.out.print("\n");
    }
    }
}

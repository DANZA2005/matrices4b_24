package Matrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class matrices {
    //para aprendizaje de las caracteriscas
    public static void main(String[] args) throws IOException{
       // Matriz cuadradas
       int [][] matriz1 = new int[3][3];
       int numero = 0;

       //introducir valores

       for (int i = 0; i<3; i++){
        for (int j = 0; j<3; j++){
            matriz1[i][j] = numero;
            numero++;
            System.out.print(matriz1[i][j] + "      ");
        }
        System.out.println();
       }
       
       //matriz no cuadrada
       int[][] matriz2 = new int[3][5];
       numero = 0 ;
       System.out.println();
       for (int i = 0; i<matriz2.length; i++){
        for (int j = 0; j< matriz2[i].length; j++){
            matriz2[i][j] = numero;
            numero++;
            System.out.print(matriz2[i][j] + "    ");
        }
        System.out.println();
       }
       
       //Ejemplo de una matriz cosntruida con valores
       System.out.println();
       char[][] matriz3 = {{'a','b','c'}, {'d','e'}, {'f'}};
       for (int i = 0 ; i < matriz3.length; i++){
        for (int j = 0 ; j < matriz3[i].length; j++){
            System.out.print(matriz3[i][j] + "      ");
        }
        System.out.println();
       }

       // construccion de una matriz irregular desde teclado
       int[][] matriz4;
       int rengl,colum;
       BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
       String entrada;

       System.out.println("Construccionde una matriz");
       System.out.println("Escribe el numero de renglones: ");
       entrada = bufer.readLine();
       rengl = Integer.parseInt(entrada);
       matriz4 = new int [rengl][];
       for (int i = 0; i < matriz4.length; i++){
        System.out.println("Escribe columnas para renglon" + i + ":");
        entrada = bufer.readLine();
        colum = Integer.parseInt(entrada);
        matriz4[i] = new int[colum];
        for (int  j = 0; j < matriz4[i].length; j++){
            System.out.println("Escribe el valor de ["+i+"]["+j+"]: ");
            entrada = bufer.readLine();
            matriz4[i][j] = Integer.parseInt(entrada);
        }
       }
       System.out.println();
       for (int i = 0 ; i < matriz4.length; i++ ){
        for(int j = 0; j < matriz4[i].length; j++){
            System.out.print(matriz4[i][j]+ "        ");
        }
        System.out.println();
       }
    }
}

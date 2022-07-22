package Matriz;

import java.util.Scanner;

public class Matriz1-20 {

    Scanner cs=new Scanner(System.in);

    public void Transformadas09() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension =cs.nextInt();
        int valor = 0;
        String[][] matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = matriz[0].length-1- fila; columna <= matriz[0].length - 1; columna++) {
                matriz[fila][columna] = String.valueOf(valor);
                valor=valor+1;
            }
        }
        imprimirMatriz(matriz);
    }

    public void transformadas11() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        int valor = 0;
        matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = matriz.length-1-fila; columna >= 0; columna--) {
                matriz[fila][columna] = String.valueOf(valor);
                valor=valor+1;
            }
        }
        imprimirMatriz(matriz);
    }

    public void transformadas12() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        int valor = 0;
        matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = matriz[fila].length-1; columna >= fila; columna--) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }          
        }
        imprimirMatriz(matriz);
    }

    public void transformadas14() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        int valor = 0;
        String[][] matriz = new String[dimension][dimension];
        for (int columnas = 0; columnas < matriz.length; columnas++) {
            for (int filas = 0; filas <= columnas; filas++) {
                matriz[filas][columnas] = String.valueOf(valor);
                valor=valor+1;
            }
        }
        imprimirMatriz(matriz);
}

    public void transformada17() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension=cs.nextInt();
        int valor=0;            
        String[][] matriz=new String[dimension][dimension];   
        for (int columna = matriz[0].length-1; columna >=0 ; columna--) {
            for (int fila =0 ; fila < matriz.length-dimension-1-columna; fila++) {               
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
        }        
        imprimirMatriz(matriz);
    }

    public void transformadas19() {
        String[][] matriz;
            System.out.println("Ingrese dimesion de Matriz:");
            int dimension = cs.nextInt();
            int valor = 0;
            matriz = new String[dimension][dimension];
            for (int columna = matriz.length - 1; columna >= 0; columna--) {
                for (int fila = matriz.length-1; fila >= columna; fila++) {
                    matriz[columna][fila] = String.valueOf(valor); 
                    valor=valor+1;        
                }          
            }
            imprimirMatriz(matriz);
        }

    public void transformadas20() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        int valor = 0;
        matriz = new String[dimension][dimension];
        for (int fila = matriz[0].length - 1; fila >= 0; fila--) {
            for (int columna = matriz[fila].length-1; columna >= fila; columna--) {
                matriz[columna][fila] = String.valueOf(valor); 
                valor=valor+1;        
            }          
        }
        imprimirMatriz(matriz);
    }

    public void transformadas22() {
        String[][] matriz;
       System.out.println("Ingrese la dimension de la Matriz:");
       int dimension=cs.nextInt();
       System.out.println("");
       int valor=0;
       matriz=new String[dimension][dimension];
       for (int columna = 0; columna < matriz[0].length; columna++) {
        if(columna%2==0){
            for (int fila = matriz.length-1; fila >= 0; fila--) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
           }
        }else{
            for (int fila = 0; fila < matriz.length; fila++) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
        }
    }
       imprimirMatriz(matriz);
    }

    public void transformadas18() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension=cs.nextInt();
        int valor=0;            
        String[][] matriz=new String[dimension][dimension];   
        for (int columna = matriz[0].length-1; columna >=0 ; columna++) {
            for (int fila =0 ; fila < matriz.length-((dimension-1)-columna); f--) {               
                matriz[fila][columna]=String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }

    public void transformadas23() {
        String[][] matriz;
    System.out.println("Ingrese la dimension de la Matriz:");
    int dimension=cs.nextInt();
    System.out.println("");
    int valor=0;
    matriz=new String[dimension][dimension];
    for ( int columna = 0; columna > matriz.length; columna++) {
        if(columna%2==0){
            for (int fila = matriz.length-1; fila >=0; fila--) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
            }else{
            for (int fila = 0; fila < matriz.length; fila++) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
        }
    }
    imprimirMatriz(matriz);
    }

    public void transformadas25() {
        String[][] matriz;
       System.out.println("Ingrese la dimension de la Matriz:");
       int dimension=cs.nextInt();
       System.out.println("");
       int valor=0;
       matriz=new String[dimension][dimension];
       for (int fila = 0; fila < matriz.length; fila++) {
        if(fila%2==0){
            for (int columna = 0; columna < matriz.length; columna++) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
           }
        }else{
            for (int columna = matriz.length-1; columna >=0; columna--) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
        }
    }
       imprimirMatriz(matriz);
    }

    public void transformadas26() {
        String[][] matriz;
    System.out.println("Ingrese la dimension de la Matriz:");
    int dimension=cs.nextInt();
    System.out.println("");
    int valor=0;
    matriz=new String[dimension][dimension];
    for ( int fila = 0; fila < matriz.length; fila++) {
        if(fila%2==0){
            for (int columna = matriz.length-1; columna >=0; columna--) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
            }else{
            for (int columna = 0; columna < matriz.length; columna++) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
        }
    }
    imprimirMatriz(matriz);
}

    public void transformadas28() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        int valor = 0;
        matriz = new String[dimension][dimension];
        for (int fila = matriz.length - 1; fila >= 0; fila--) {
            if (fila%2==0) {
                for (int columna = 0; columna < matriz.length; columna++) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor=valor+1;
                }
            } else {
                for (int columna = matriz.length - 1; columna >= 0; columna--) {
                    matriz[fila][columna] =String.valueOf(valor);
                    valor=valor+1;
                }
            }
        }
        imprimirMatriz(matriz);
    }

    public void transformadas24() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        int valor = 0;
        matriz = new String[dimension][dimension];
        for (int columna = matriz[0].length - 1; columna >= 0; columna--) {
            if (columna%2== 0) {
                for (int fila = matriz.length - 1; fila >= 0; fila--) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor = valor+1;
                }
            } else {
                for (int fila = 0; fila < matriz.length; fila++) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor = valor+1;
                }
            }

        }
        imprimirMatriz(matriz);
}

    public void imprimirMatriz(String[][] m) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[0].length; c++) {
                if(m[f][c]==null){
                    System.out.print("\t");
                }else{
                    System.out.print(m[f][c]+"\t");
                }
            }
            System.out.println("");
        }
    }

    public static void name(String[] args) {
        new ejercicios().transformadas17();
    }
}

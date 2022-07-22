package HenrryLidhuardoHS;

import java.util.Scanner;

public class HenrryLHS0418 {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int i, N;
    double Categoria1, Categoria2, Categoria3, Clave, Costo, Impuesto, ImpuestoPagar;
    Categoria1 = 0;
    Categoria2 = 0;
    Categoria3 = 0;
    ImpuestoPagar = 0;
    System.out.print("Ingresa la Cantidad de Autos: ");
    N = in.nextInt();
    in.nextLine();
    for (i=1; i<=N; i++) {
        System.out.print("Ingresa la Clave: ");
        Clave = in.nextDouble();
        System.out.print("Ingrese el Costo del Auto: ");
        Costo = in.nextDouble();
        Impuesto=0;
        if(Clave==1)
        {
            Impuesto=Costo*0.1;
            Categoria1=Categoria1+Impuesto;
        }
        if(Clave==2)
        {
            Impuesto=Costo*0.07;
            Categoria2=Categoria2+Impuesto;
        }
        if(Clave==3)
        {
            Impuesto=Costo*0.05;
            Categoria3=Categoria3+Impuesto;
        }
        ImpuestoPagar=ImpuestoPagar+Impuesto;
        System.out.println("El Impuesto es: " + Impuesto);
    }
    System.out.println("El Impuesto del Auto 1: " + Categoria1);
    System.out.println("El Impuesto del Auto 2: " + Categoria2);
    System.out.println("El Impuesto del Auto 3: " + Categoria3);
    System.out.println("El Total Impuesto a Pagar: " + ImpuestoPagar);
}
}
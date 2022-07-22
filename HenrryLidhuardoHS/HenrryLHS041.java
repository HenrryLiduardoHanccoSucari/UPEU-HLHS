package HenrryLidhuardoHS;

import java.util.Scanner;

public class HenrryLHS041 {
    public static void main(String[] args) {
        int i;
        double SalarioInicial, SalarioRecibido, Año;
        for (i=1; i<=6; i++) {
            System.out.print("Proceso" + i );
            SalarioInicial=1500;
            Año=i;
            SalarioRecibido=SalarioInicial*Math.pow(1.1,Año);
            System.out.println("Salario Inicial es: " + SalarioInicial);
            System.out.println("Porcentaje de Año es: " + Año);
            System.out.println("Salario Recibido es: " + SalarioRecibido);
        }
    }

}
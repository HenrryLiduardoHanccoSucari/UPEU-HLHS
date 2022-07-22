package HenrryLidhuardoHS;

import java.util.Scanner;

public class HenrryLHS042 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int FormadePago, i, n, TipodeHamburguesa;
        double Cargo, Costo, Pago;
        Pago = 0;
        System.out.print("Ingresa la Cantidad de Hamburguesas: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("Proceso" + i);
            System.out.println("Selecciona el Tipo de Hamburguesa.");
            System.out.println("\t1.- S Sencilla");
            System.out.println("\t2.- D Doble");
            System.out.println("\t3.- T Triples");
            do {
                TipodeHamburguesa = in.nextInt();
                in.nextLine();
                if (TipodeHamburguesa<1||TipodeHamburguesa>3)
                    System.out.print("Valor Incorrecto. Ingresa Nuevamente.: ");
            } while (TipodeHamburguesa<1||TipodeHamburguesa>3);
            Costo=0;
            if(TipodeHamburguesa==1)
                Costo=10;
            if(TipodeHamburguesa==2)
                Costo=12;
            if(TipodeHamburguesa==3)
                Costo=14;
            System.out.println("Selecciona la Forma de Pago.");
            System.out.println("\t1.- Efectivo");
            System.out.println("\t2.- Tarjeta");
            do {
                FormadePago = in.nextInt();
                in.nextLine();
                if (FormadePago<1||FormadePago>2)
                    System.out.print("Valor incorrecto. Ingresa Nuevamente.: ");
            } while (FormadePago<1||FormadePago>2);
            if(FormadePago==1)
                Cargo=0;
            else
                Cargo=Costo*0.05;
            Pago=Pago+Costo+Cargo;
            System.out.println("Valor de Cargo: " + Cargo);
            System.out.println("Valor de Costo: " + Costo);
        }
        System.out.println("Valor de Pago: " + Pago);
    }

}

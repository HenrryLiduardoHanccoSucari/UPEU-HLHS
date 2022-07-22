package pe.edu.upeu.hlhs.examen;

import java.util.Scanner;

public class ResolucionExamen {
static Scanner leer = new Scanner(System.in);

    public void exa02hlhs() {
        Scanner in = new Scanner(System.in);
        int i, n;
        double Cat1, Cat2, Cat3, Clave, Costo, Impuesto, ImpuestoFinal;
        Cat1 = 0;
        Cat2 = 0;
        Cat3 = 0;
        ImpuestoFinal = 0;
        System.out.print("Ingrese la Cantidad de Auto: ");
        n = in.nextInt();
        for (i=1; i<=n; i++) {
            System.out.print("Proceso" + i);
            System.out.print(" Ingresa la Clave: ");
            Clave = in.nextDouble();
            System.out.print("Ingresa el Costo: ");
            Costo = in.nextDouble();
            Impuesto=0;
            if(Clave==1)
            {
                Impuesto=Costo*0.12;
                Cat1=Cat1+Impuesto;
            }
            if(Clave==2)
            {
                Impuesto=Costo*0.08;
                Cat2=Cat2+Impuesto;
            }
            if(Clave==3)
            {
                Impuesto=Costo*0.05;
                Cat3=Cat3+Impuesto;
            }
            ImpuestoFinal=ImpuestoFinal+Impuesto;
            System.out.println("Valor de Impuesto: " + Impuesto);
        }
        System.out.println("Costo de la Categoria 1: " + Cat1);
        System.out.println("Costo de la Categoria 2: " + Cat2);
        System.out.println("Costo de la Categoria 3: " + Cat3);
        System.out.println("Total Impuesto Final a Pagar: " + ImpuestoFinal);
    }

}


public void exa03hlhs() {
    int n;
    System.out.print("Ingrese la Altura de la Variable X:");
    n = leer.nextInt();
    if (n >= 3 && n % 2 == 1) {
        for (int i = 1; i <= n; i++) {
            for (int x = 1; x <= n; x++) {
                if (i == x || i + x == n + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

        }
    } else {
        System.out.println("Error ʕ´• ᴥ•̥`ʔ :(");
    }
}


public void exa04hlhs() {
    int i, j, Sum, Ini = 0;
    System.out.println("Ingrese Cuantos Números desea Mostrar: ");
    int Cant = leer.nextInt();
    System.out.println("Los Número Perfectos son: ");
    for (i = 1; i > 0; i++) {

        Sum = 0;
        for (j = 1; j < i; j++) {
            if (i % j == 0) {
                Sum = Sum + j;
            }
        }
        if (i == Sum) {

            Ini++;
            if (Ini <= Cant) {
                System.out.println(i);
            } else {
                break;
            }
        }
    }
}


public void exa05hlhs(int x) {
    if (x < 2) {
        System.out.print(x);
        return;
    } else {
        exa05hlhs(x / 2);
        System.out.print(x % 2);
        return;
    }
}
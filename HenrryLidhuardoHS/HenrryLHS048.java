package HenrryLidhuardoHS;

import java.util.Scanner;

public class HenrryLHS048 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, N;
        double Cantidad_de_Enero, Cantidad_de_Febrero, Cantidad_de_Marzo, Cantidad_de_Abril, Cantidad_de_Mayo, Cantidad_de_Junio, Cantidad_de_Julio, Cantidad_de_Agosto, Cantidad_de_Septiembre, Cantidad_de_Octubre, Cantidad_de_Noviembre, Cantidad_de_Diciembre, Interes, Inversion_Final, Total;
        Total = 0;
        System.out.print("Ingresa la Cantidad de Años: ");
        N = in.nextInt();
        for (i=1; i<=N; i++) {
            System.out.print("Ingresa la Cantidad de Enero: ");
            Cantidad_de_Enero = in.nextDouble();
            System.out.print("Ingresa la Cantidad de Febrero: ");
            Cantidad_de_Febrero = in.nextDouble();
            System.out.print("Ingresa la Cantidad de Marzo: ");
            Cantidad_de_Marzo = in.nextDouble();
            System.out.print("Ingresa la Cantidad de Abril: ");
            Cantidad_de_Abril = in.nextDouble();
            System.out.print("Ingresa la Cantidad de Mayo: ");
            Cantidad_de_Mayo = in.nextDouble();
            System.out.print("Ingresa la Cantidad de Junio: ");
            Cantidad_de_Junio = in.nextDouble();
            System.out.print("Ingresa la Cantidad de Julio: ");
            Cantidad_de_Julio = in.nextDouble();
            System.out.print("Ingresa la Cantidad de Agosto: ");
            Cantidad_de_Agosto = in.nextDouble();
            System.out.print("Ingresa la Cantidad de Septiembre: ");
            Cantidad_de_Septiembre = in.nextDouble();
            System.out.print("Ingresa la Cantidad de Octubre: ");
            Cantidad_de_Octubre = in.nextDouble();
            System.out.print("Ingresa la Cantidad de Noviembre: ");
            Cantidad_de_Noviembre = in.nextDouble();
            System.out.print("Ingresa la Cantidad de Diciembre: ");
            Cantidad_de_Diciembre = in.nextDouble();
            Total=Cantidad_de_Enero+Cantidad_de_Febrero+Cantidad_de_Marzo+Cantidad_de_Abril+Cantidad_de_Mayo+Cantidad_de_Junio+Cantidad_de_Julio+Cantidad_de_Agosto+Cantidad_de_Septiembre+Cantidad_de_Octubre+Cantidad_de_Noviembre+Cantidad_de_Diciembre;
            Interes=Total*0.1;
            Inversion_Final=Total+Interes;
            System.out.println("Ahorro del Año es: " + Total);
            System.out.println("Interes del Año es: " + Interes);
            System.out.println("Total con Interes es: " + Inversion_Final);
    }

  }
}
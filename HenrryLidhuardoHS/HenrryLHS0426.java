package HenrryLidhuardoHS;

public class HenrryLHS0426 {
    public static void main(String[] args) {
        System.out.print("Introduz un Número: ");
        int Introducir_Número = Integer.parseInt(System.console().readLine());
        System.out.println("   n  |    n²   |    n³");
        System.out.println("---------------------------");
        for (int i = Introducir_Número; i < Introducir_Número + 5; i++) {
          System.out.printf("%5d |%8d |%9d\n", i, i * i, i * i * i);
        }
      }
    }
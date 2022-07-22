package pe.edu.upeu.hlhs;

import java.util.Scanner;

import pe.edu.upeu.hlhs.examen.ResolucionExamen;

public class App {
    public static void main( String[] args ){
        Scanner lt=new Scanner(System.in);
        int n;
        System.out.println("Ingrese el número de la Pregunta(2-5):");
        n=lt.nextInt();
        switch (n) {
            case 2: new ResolucionExamen().exa02hlhs(); break;
            case 3: new ResolucionExamen().exa03hlhs(); break;
            case 4: new ResolucionExamen().exa04hlhs(); break;
            case 5: new ResolucionExamen().exa05hlhs(); break;
            default: System.err.println("ʕ´• ᴥ•̥`ʔ"); break;
        }
    }
}
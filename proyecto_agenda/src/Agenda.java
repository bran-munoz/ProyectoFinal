import Model.Contactos;
import Utils.scanner;

import java.util.Scanner;

import static View.Menu.*;


public class Agenda {

    public static void main(String[] args) {
        menu();
        int decicion = scanner.entrada().nextInt();

        while (decicion != 6){
            if(decicion == 1){
                Contactos[] muestra = new Contactos[10];
                for(int i=0; i<muestra.length;i++){
                    System.out.println(muestra[i]);
                }
            }
            menu();
            decicion = scanner.entrada().nextInt();
        }

    }
}

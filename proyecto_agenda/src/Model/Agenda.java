import Model.Contacto;


public class Agenda {

    /*String[] contactos = new String[50];
    int[] id = {1,2,3,4,5,6,7,8,9,10};
    String[] nombres = {"Esther", "David", "Ezequiel", "Francisco", "Josefina", "Marcos", "Maria", "Olga",
            "Patricia", "Pedro"};
    String[] apellidos = {"Del carmen", "Muñoz", "Ventura", "Jimenez", "Cruz", "Rodriguez", "Beriguete",
            "Hernandez", "Feliciano", "Orozco"};
    String[] telefonos = {"809-537-8596","809-963-8956","809-789-4563","809-745-9865","809-123-7896",
            "809-856-3217","809-731-6429","809-746-5631","809-463-5129","809-428-8916"};*/

    /*public static void main(String[] args) {
        menu();
        int decicion = scanner.entrada().nextInt();

        while (decicion != 6){

            if(decicion == 1){
                listarContactos();
            }
            menu();
            decicion = scanner.entrada().nextInt();
        }

    }*/

    public static void listarContactos(){

        Contacto[] muestras = new Contacto[10];
        muestras[0] = new Contacto("Juan","Mu;oz","829-564-2575",1);
        for (int i = 0; i< muestras.length; i++){
            System.out.println(muestras[i]);
        }

    }

    public static void buscarContacto(int id){
        
    }


}

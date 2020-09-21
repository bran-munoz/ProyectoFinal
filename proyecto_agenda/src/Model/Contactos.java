package Model;

public class Contactos {

    /*Hacer un programa que funcione como agenda telefónica
    *El programa debe precargar 10 contactos al iniciar.
    *Al iniciar el programa el usuario debe tener opciones que le permitan agregar, buscar,
    *actualizar y borrar un contacto. También una opción que le permita listar todos los contactos.
    *Cada contacto debe tener al menos 3 campos Id, nombre y teléfono. (puede agregar todos los
    que quiera)
    *El programa debe permitir buscar por id y por nombre.
    *Cuando elija agregar contacto debe de pedir si desea agregar otro.
    *Después de cada opción debe volver al menú.
    *El programa solo terminara cuando el usuario elija salir.*/

    int id;
    String nombre;
    String apellido;
    String telefono;

    public Contactos(){
        String[] contactos = new String[50];
        int[] id = {1,2,3,4,5,6,7,8,9,10};
        String[] nombres = {"Esther", "David", "Ezequiel", "Francisco", "Josefina", "Marcos", "Maria", "Olga",
                "Patricia", "Pedro"};
        String[] apellidos = {"Del carmen", "Muñoz", "Ventura", "Jimenez", "Cruz", "Rodriguez", "Beriguete",
                "Hernandez", "Feliciano", "Orozco"};
        String[] telefonos = {"809-537-8596","809-963-8956","809-789-4563","809-745-9865","809-123-7896",
        "809-856-3217","809-731-6429","809-746-5631","809-463-5129","809-428-8916"};

    }


}

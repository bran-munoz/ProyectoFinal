package View;

public class Menu {

    public static void menu(){
        System.out.println("\t\t\tAGENDA");
        System.out.println("");
        System.out.println("Menu");
        System.out.println("1. Listar todos los contactos.");
        System.out.println("2. Buscar contacto.");
        System.out.println("3. Agregar contacto.");
        System.out.println("4. Actualizar contacto.");
        System.out.println("5. Eliminar contacto.");
        System.out.println("6. Salir.");
    }

    public static void agregarOtro(){
        System.out.println("Desea agregar otro contacto?");
        System.out.println("1. Si");
        System.out.println("2. No");
    }
}

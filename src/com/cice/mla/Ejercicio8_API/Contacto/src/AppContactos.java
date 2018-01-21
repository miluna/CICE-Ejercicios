import java.util.ArrayList;
import java.util.Scanner;

public class AppContactos {

    private ArrayList<Contacto> listaContactos;

    public AppContactos(){
        listaContactos = new ArrayList<>();
    }

    public void showMenu(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("---------------------");
            System.out.println("Bienvenido a esta app");
            System.out.println("Elige tu opcion:");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Mostrar contactos");
            System.out.println("4. Salir");

            opcion = sc.nextInt();
            controles(opcion);
        } while (opcion != 4);
    }

    private void controles(int opcionSeleccionada) {
        switch (opcionSeleccionada) {
            case 1:
                crearContacto();
                break;
            case 2:
                eliminarContacto();
                break;
            case 3:
                mostrarListaContactos();
                break;
            case 4:
                System.out.println("Gracias por su tiempo");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    private void crearContacto() {
        Scanner sc = new Scanner(System.in);
        Contacto nuevoContacto = new Contacto();

        System.out.println("Introduce el nombre: ");
        nuevoContacto.setNombre(sc.nextLine());

        System.out.println("Introduce el dni: ");
        String dniString = sc.nextLine();
        if (isParsable(dniString)){
            nuevoContacto.setDni(Integer.parseInt(dniString));
        } else { System.out.println("El dni introducido no es valido, se creará en 0"); }

        listaContactos.add(nuevoContacto);
        System.out.println("Contacto creado");
        System.out.println(nuevoContacto.getDni() + " : " + nuevoContacto.getNombre());
    }

    private void eliminarContacto(){
        Scanner sc = new Scanner(System.in);
        String respuesta;

        do{
            mostrarListaContactos();
            System.out.println("Introduce dni o nombre a eliminar: ");
            String datoIntroducido = sc.nextLine();
            Contacto contactoSeleccionado = new Contacto();

            if (isParsable(datoIntroducido)){
                int dni = Integer.parseInt(datoIntroducido);
                for (Contacto c: listaContactos) {
                    if (c.getDni() == dni){
                        contactoSeleccionado = c;
                    }
                }
            } else {
                for (Contacto c : listaContactos) {
                    if (c.getNombre().equals(datoIntroducido)){
                        contactoSeleccionado = c;
                    }
                }
            }
            if (listaContactos.contains(contactoSeleccionado)){
                System.out.println("Se ha eliminado de la lista de contactos a " + contactoSeleccionado.getNombre());
                listaContactos.remove(contactoSeleccionado);
            } else { System.out.println("No se ha encontrado el contacto descrito :(");}

            System.out.println("¿Quiere eliminar otro contacto? s/n");
            respuesta = sc.nextLine();
        } while (respuesta.equals("s"));
    }

    private static boolean isParsable(String input){
        boolean parsable = true;
        try{
            Integer.parseInt(input);
        }catch(NumberFormatException e){
            parsable = false;
        }
        return parsable;
    }

    private void mostrarListaContactos(){
        System.out.println("Estos son los contactos listados:");
        for (Contacto c: listaContactos) {
            System.out.println(c.getDni() + " : " + c.getNombre());
        }
    }

}

import java.util.HashMap;
import java.util.Hashtable;

public class Contacto {
    private String nombre;
    private int dni;

    public Contacto () {
        this.nombre = "";
        this.dni = 0;
    }

    public Contacto(String nombre) {
        this.nombre = nombre;
        this.dni = 0;
    }

    public Contacto(int dni) {
        this.nombre = "";
        this.dni = dni;
    }

    public Contacto(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}

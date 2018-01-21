import java.util.HashMap;
import java.util.Hashtable;

public class Contacto {
    private String nombre;
    private String dni;

    public Contacto () {
        this.nombre = "";
        setDni(0);
    }

    public Contacto(String nombre) {
        this.nombre = nombre;
        setDni(0);
    }

    public Contacto(int dni) {
        this.nombre = "";
        setDni(dni);
    }

    public Contacto(String nombre, int dni) {
        this.nombre = nombre;
        setDni(dni);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {

        this.dni = fixDniLength(dni);
    }

    private String fixDniLength(int dni){
        String str = Integer.toString(dni);
        int length = str.length(); // length should be 8
        int cerosNecesarios = 8 - length;
        StringBuilder string = new StringBuilder();

        if (length > 8){
            for(int i = 0; i < 8; i++) {
                string.append(str.charAt(i));
            }
            return string.toString();

        }
        if (cerosNecesarios == 0){
            return str;
        }else {
            for(int i = 0; i < cerosNecesarios; i++){
                string.append("0");
            }
            string.append (str);
            return string.toString();
        }
    }
}

import java.util.Enumeration;
import java.util.Hashtable;

public class Diccionario {

    public static void main(String[] args) {

        Hashtable <Integer, String> diccionario = new Hashtable<>();

        diccionario.put(10, "JAMES");
        diccionario.put(3, "GERARD PIQUE");
        diccionario.put(69, "RENNE HIGUITA");
        diccionario.put(7, "BAUL");
        diccionario.put(10, "MESA");
        diccionario.put(23, "MICHAEL JORDAN");

        System.out.println("-----");
        Enumeration<Integer> claves = diccionario.keys();

        while (claves.hasMoreElements()){
            Integer key = claves.nextElement();
            String value = diccionario.get(key);

            System.out.println(key + " " + value);
        }
    }
}

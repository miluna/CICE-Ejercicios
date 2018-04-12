import java.util.HashSet;

public class Conjuntos {

    public static void main(String[] args) {
        HashSet<String> conjuntoString = new HashSet<>();

        conjuntoString.add("cola");
        conjuntoString.add("tail");
        conjuntoString.add("pepe");
        conjuntoString.add("juan");
        conjuntoString.add("paqui");



        System.out.println(conjuntoString.size());

        conjuntoString.forEach(s -> System.out.println(s));
    }
}

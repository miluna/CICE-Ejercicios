import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ejemplo {

	public static void main(String[] args) {
		//Map utiliza clave asociada a un valor
		
		Map<String, String> map = new HashMap<>();
		
		ArrayList<String> lista = new ArrayList<>();
		
		String a = "Juan";
		String b = "ObiJuan";
		String c = "Paco";
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		
		map.put("primero", a);
		map.put("segundo", b);
		map.put("tercero", c);
		
		System.out.println(lista.get(1));
		System.out.println(lista.get(lista.indexOf("ObiJuan")));
		
		System.out.println("----------------");
		
		System.out.println(map.get("primero"));
		
		lista.remove(lista.indexOf("Paco"));
		
		
		for (String palabra : lista) {
			System.out.println(palabra);
		}
		System.out.println("----------------");
		for (String key : map.keySet()) {
			System.out.println("Clave: " + key);
			System.out.println("Valor: " + map.get(key));
			System.out.println("----------------");
		}
		System.out.println("----------------");
		System.out.println("----------------");
		
		lista.forEach(elemento -> System.out.println(elemento));
		
		System.out.println("----------------");
		
		map.forEach(clave, valor -> (
			System.out.println("Clave con lambda: " + clave);
			System.out.println("Valor con lambda: " + valor);
		);
		
	}

}

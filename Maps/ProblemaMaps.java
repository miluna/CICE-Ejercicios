import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * @author Miguel Angel Luna
 *
 */
public class ProblemaMaps {

	public static void main(String[] args) {
		/*
		* Dados estos dos objetos (mapDeStrings y listaDeStrings):
		* 
		* Añadir todos los elementos del "mapDeStrings" a "listaDeStrings" e imprimir el resultado por consola.
		* 
		* Crear una nueva lista de String con todos los Caracteres PARSEABLES a Integer que encontremos 
		* en todos los elementos "listaDeStrings". Imprimir cada elemento  por consola.
		*
		*/
		Map<String, String> mapDeStrings = new HashMap<>();
		mapDeStrings.put("item1", "4394ddddddd");
		mapDeStrings.put("item2","ooooooo234");
		mapDeStrings.put("clave1", "pepeNoPodiaFaltar2345");

		List<String> listaDeStrings = new ArrayList<>();
		listaDeStrings.add("wq32453js23");
		listaDeStrings.add("SDJRD2332");
		listaDeStrings.add("234324234rt,,,,3");
		listaDeStrings.add("23nhdfe098sdf23");
		
		imprimirLista (listaDeStrings);
		System.out.println("--------------------");
		//Añadir todos los elementos del "mapDeStrings" a "listaDeStrings" e imprimir el resultado por consola.
	
		System.out.println("Añadiendo elementos...");
		for (String key : mapDeStrings.keySet()) {
			listaDeStrings.add(key);
			listaDeStrings.add(mapDeStrings.get(key));
		}
		imprimirLista(listaDeStrings);
		
				
		//Crear una nueva lista de String con todos los Caracteres PARSEABLES a Integer que encontremos 
		//en todos los elementos "listaDeStrings". Imprimir cada elemento  por consola.
		System.out.println("--------------------");
		System.out.println("Procesando elementos parseables...");
		List<String> caracteresParseables = new ArrayList<>();
		
		
		for (String elemento : listaDeStrings) {
			for (int i= 0; i<elemento.length(); i++) {
				String numeroParseable = Character.toString(elemento.charAt(i));
				if (esParseable(numeroParseable)){
					caracteresParseables.add(numeroParseable);
				}
			}
		}
		System.out.println("Contenidos de la nueva lista parseable (en formato String)");
		imprimirLista (caracteresParseables);
	}
	
	
	/**
	 * La funcion imprimirLista sirve para no repetir todo el rato que imprima los contenidos.
	 * @param lista
	 */
	public static void imprimirLista(List<String> lista) {
		System.out.println("CONTENIDO DE LISTA DE STRINGS:");
		for (String elemento : lista) {
			System.out.println(elemento);
		}
	}
	
	
	/**
	 * La funcion esParseable intenta convertir un elemento que nos es dado a través del parametro numeroEnString
	 * y devuelve un booleano si es posible convertirlo en integer o no
	 * @param numeroEnString
	 * @return
	 */
	public static boolean esParseable(String numeroEnString){
		try {
			int numero = Integer.parseInt(numeroEnString);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}

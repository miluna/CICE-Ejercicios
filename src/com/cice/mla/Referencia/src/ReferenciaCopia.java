import java.util.ArrayList;

public class ReferenciaCopia {

	public static void main(String[] args) {

		// copia valor;
		
		int a = 2;
		int b = a;
		
		a = 3;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("----------------");
		//variable
		
		Integer c = 4;
		Integer d = c;
		
		c = 6;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println("----------------");
		//objeto
		
		Integer e = new Integer(3);
		Integer f = e;
		
		e = new Integer(6);
		
		System.out.println(e);
		System.out.println(f);
		System.out.println("----------------");
		
		//Referencia
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add("cadena 1");
		
		ArrayList<String> lista2 = lista;
		
		lista.add("cadena 2");
		
		for (String string : lista) {
			System.out.println(string);
		}
		for (String string : lista2) {
			System.out.println(string);
		}
		
		
	}

}

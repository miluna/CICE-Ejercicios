
public class ejercicio3 {

	public static void main(String[] args) {
		
		String prueba = "pepe manolo ricardo";
		
		//System.out.println(prueba.replace(" ", "/ "));
		String[] nombres= prueba.split(" ");
		for (String nombre : nombres){
			System.out.println(nombre);
		}
		
	}

}

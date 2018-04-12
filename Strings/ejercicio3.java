
public class ejercicio3 {

	public static void main(String[] args) {
		
		String arraybasurero = "pepe manolo ricardo";
		
		//System.out.println(prueba.replace(" ", "/ "));
		String[] nombres= arraybasurero.split(" ");
		for (String nombre : nombres){
			System.out.println(nombre);
		}
		
	}

}

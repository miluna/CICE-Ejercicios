
public class main {

	public static void main(String[] args) {

		long recuentoMaximo = 0;
		
		String s1 = "La primera linea";
		String s2 = "yo la tengo mas larga";
		String s3 = "asdsadsa";
		String s4 = "";
		String s5 = "yo la tengo mas largA";
		
		//Metodo split para separar frases
		String[] s5separada = s5.split(" ");
		System.out.println(s5separada[0]);
		
		
		String[] conjuntoStrings = new String[] {s1, s2, s3, s4, s5};
		
		for (String string : conjuntoStrings){
			if (recuentoMaximo < string.length()){
				recuentoMaximo = string.length();
			}
		}
		
		for (String string : conjuntoStrings){
			if (string.length() == recuentoMaximo){
				System.out.println("Cadena más larga: " + string);
				System.out.println("Recuento total: " + recuentoMaximo);
			}
		}
	}

}

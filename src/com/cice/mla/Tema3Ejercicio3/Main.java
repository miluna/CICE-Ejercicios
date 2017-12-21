
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lista = "1,2,3,4,5,6,7,8,9";
		String[] array = lista.split(",");
		
		int resultado = 0;
		for (String string : array) {
			int numero = 0;
			numero = Integer.parseInt(string);
			resultado += numero;
		}
		System.out.println("Resultado: " + resultado);
	}

}


public class Futbolista {

	private long salario;
	private String nombre;
	private int dorsal;
	
	
	public Futbolista() {}

	
	/**
	 * 
	 * @param salario	Dinero que gana el futbolista mensualmente
	 * @param nombre	Nombre del futbolista
	 * @param dorsal	Numero que lleva en la camiseta
	 */
	public Futbolista(long salario, String nombre, int dorsal) {
		this.salario = salario;
		this.nombre = nombre;
		this.dorsal = dorsal;
	}
	
	public void pintarFutbolista(){
		System.out.println("Nombre: " + nombre);
		System.out.println("salario: " + salario);
		System.out.println("dorsal: " + dorsal);
	}
	
	
	public long getSalario() {
		return salario;
	}

	public void setSalario(long salario) {
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	
	
	
	
}

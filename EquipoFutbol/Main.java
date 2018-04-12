
public class Main {

	public static void main(String[] args) {
		Equipo equipo = new Equipo();
		Futbolista futbolista0 = equipo.crearNuevoFutbolista(1000, "Pakete", 99);
		Futbolista futbolista1 = new Futbolista(2500, "pepe", 25);
		
		equipo.agregarFutbolista(futbolista0);
		equipo.agregarFutbolista(futbolista1);
		equipo.printArray(equipo.getFutbolistas());
	}

}

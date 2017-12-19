
public class Equipo {

	private Futbolista[] futbolistas = new Futbolista[11];
	
	
	
	public Futbolista crearNuevoFutbolista(){
		return new Futbolista();
	}
	
	/**
	 * 
	 * @param salario	sueldo del futbolista
	 * @param nombre	nombre del futbolista
	 * @param dorsal	numero de la camiseta
	 * @return			creacion del objeto
	 */
	public Futbolista crearNuevoFutbolista(long salario, String nombre, int dorsal){
		Futbolista f = new Futbolista(salario, nombre, dorsal);
		return f;
	}
	
	public void agregarFutbolista(Futbolista f){
		//this.futbolistas[0] = f;
		// siempre lo meteria en la posicion 0
		
		for (int i= 0; i< futbolistas.length; i++){
			if (futbolistas[i] == null){
				futbolistas[i] = f;
				break; //Si no hay break, mete el mismo en todos
			}
		}
	}
	public void printArray (Futbolista[] futbolistaArray){
		for (Futbolista futbolista : futbolistaArray){
			if (futbolista != null){
				futbolista.pintarFutbolista();
			}
		}
	}
	
	
	
	public Futbolista[] getFutbolistas() {
		return futbolistas;
	}
	public void setFutbolistas(Futbolista[] futbolistas) {
		this.futbolistas = futbolistas;
	}
	
}

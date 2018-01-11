package modelo;
import java.util.ArrayList;

public class Departamento {
	private Empleado director;
	private ArrayList<Empleado> listaEmpleados = new ArrayList<>();
	private String nombre;
	private String ubicacion;
	private int telefono;
	
	public Departamento(){}
	
	public Departamento(Empleado director, ArrayList<Empleado> listaEmpleados, String nombre, String ubicacion,
			int telefono) {
		super();
		this.director = director;
		this.listaEmpleados = listaEmpleados;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.telefono = telefono;
	}


	public void addEmpleado (Empleado currito){
		this.listaEmpleados.add(currito);
	}
	
	
	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	public Empleado getDirector() {
		return director;
	}
	public void setDirector(Empleado director) {
		this.director = director;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}

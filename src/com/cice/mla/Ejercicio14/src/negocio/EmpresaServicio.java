package negocio;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Departamento;
import modelo.Empleado;

public class EmpresaServicio {

	private ArrayList<Empleado> listaDeEmpleados = new ArrayList<>();
	private ArrayList<Departamento> listaDeDepartamentos = new ArrayList<>();
	private ArrayList<Empleado>	listaDeDirectores = new ArrayList<>();
	
	public void showMenu(){
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		do {
			System.out.println("Bienvenido a esta app");
			System.out.println("Elige tu opcion:");
			System.out.println("1. Crear un empleado");
			System.out.println("2. Crear un departamento");
			System.out.println("3. Asignar director a departamento");
			System.out.println("4. Asignar empleado a departamento");
			System.out.println("5. Mostrar todos los empleados");
			System.out.println("6. Mostrar todos los empleados");
			System.out.println("7. Mostrar empleados de un departamento");
			System.out.println("8. Mostrar director de un departamento");
			System.out.println("6. Salir");
			
			opcion = sc.nextInt();
			controles(opcion);
		} while (opcion < 8);
	}
	
	private void controles(int opcionSeleccionada) {
		switch (opcionSeleccionada) {
		case 1:
			crearEmpleado();
			break;
		case 2:
			crearDepartamento();
			break;
		case 3:
			asignarDirector();
			break;
		case 4:
			asignarDepartamento();
			break;
		case 5:
			mostrarEmpleados();
			break;
		case 6:
			break;

		default:
			System.out.println("Opcion no valida");
			break;
		}
	}
	private void crearEmpleado() {
		Scanner sc = new Scanner(System.in);
		Empleado empleado = new Empleado();
		
		System.out.println("Introduce el nombre: ");
		empleado.setNombre(sc.next());
		
		System.out.println("Introduce el apellido: ");
		empleado.setApellido(sc.next());
		
		listaDeEmpleados.add(empleado);		
	}
	private void crearDepartamento() {
		String respuesta = "";
		do {
			Scanner sc = new Scanner(System.in);
			Departamento departamento = new Departamento();
			System.out.println("Introduce el nombre: ");
			departamento.setNombre(sc.next());
			listaDeDepartamentos.add(departamento);
			
			System.out.println("¿Quieres añadir otro departamento? (s/n)");
			respuesta = sc.next();
		} while (respuesta.equals("s"));
	}
	private void asignarDirector() {
		
	}
	private void asignarDepartamento() {
		
	}
	private void mostrarEmpleados() {
		for (Empleado empleado : listaDeEmpleados) {
			System.out.println(empleado.getNombre());
		}
	}
	private void mostrarDepartamentos(){
		for (Departamento departamento : listaDeDepartamentos) {
			System.out.println(departamento.getNombre());
		}
	}
	private void mostrarDirector(String Nombredirector){
		String Nombredirector;
		Scanner sc = new Scanner(System.in);
		
		
		for (Empleado director : listaDeDirectores) {
			
		}
		System.out.println("Introduce el nombre del director: ");
		String Nombredirector = sc.next();
		
		for (Departamento departamento : listaDeDepartamentos) {
			Empleado director = departamento.getDirector();
			if (director.getNombre() == Nombredirector){
				System.out.println("Pertenece al departamento: " + departamento.getNombre());
			}
		}
	}

}

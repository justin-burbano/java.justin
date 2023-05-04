package exercise1;
import javax.swing.JOptionPane;
public class Arreglos {

	String[] estudiantes;
	int[] edades;
	
	public void iniciar () {
		String menu = "Escoja la opcion \n";
			   menu+="1. llenar la lista de estudiantes \n";
			   menu+="2. mostrar lista de estudiantes\n";
			   menu+="3. promedio de edades\n";
			   menu+="4. estudiantes de mayor edad\n";
			   menu+="5. estudiantes de menor edad\n";
			   menu+="6. estudiantes mayores de 18\n";
			   menu+="7. Busqueda por nombre\n";
			   menu+="8. Busqueda por edad\n";
			   menu+="9.salir";
			int eleccion;
			do {
				eleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
				EscogerOpcion(eleccion);
			} while (eleccion!=9);
	}
	
	private void EscogerOpcion(int opc) {
		switch (opc) {
		case 1:
			llenarEstudiantes();
			break;
		case 2:if (estudiantes != null){
			mostrarEstudiantes();
			}
			break;
		case 3:if (estudiantes != null){
			promedio();
			}
			break;
		case 4:if (estudiantes != null){
			mayorEdad();
			}
			break;
		case 5:if (estudiantes != null){
			menorEdad();
			}
			break;
		case 6:if (estudiantes != null){
			adultos();
			}
			break;
		case 7:if (estudiantes != null){
			buscarNombre();
			}
			break;
		case 8:if (estudiantes != null){
			buscarEdad();
			}
			break;
		case 9:
			break;
		default:
			System.err.println("ingrese una opcion correcta");
			break;
		}
	}
	private void llenarEstudiantes() {
		int cantidad =Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de estudiantes"));
		estudiantes = new String[cantidad];
		
		for (int i = 0; i < edades.length; i++) {
			estudiantes[i]= JOptionPane.showInputDialog("ingrese el nombre del estudiante "+(i+1));
			edades[i]= Integer.parseInt(JOptionPane.showInputDialog("ingrese el nombre del estudiante "+(i+1)));
		}
	}
	private void mostrarEstudiantes () {
		for (int i = 0; i < edades.length; i++) {
			System.out.print("(" +estudiantes[i]+" | " + edades[i] +")");
		}
	}
	private void promedio () {
		int sum = 0;
		for (int i = 0; i < edades.length; i++) {
			sum+=edades[i];
		}
		System.out.println(sum/edades.length);
	}
	private void mayorEdad() {
		int major = 0;
		for (int i : edades) {
			if(i>major) {
				major=i;
			}
		}
		for (int i = 0; i < edades.length; i++) {
			if(edades[i] == major) {
				System.out.println(estudiantes[i] + " que tiene " + edades[i]);
			}
		}
	}
	private void menorEdad() {
		int minor = Integer.MAX_VALUE;
		for (int i : edades) {
			if(i<minor) {
				minor=i;
			}
		}
		for (int i = 0; i < edades.length; i++) {
			if(edades[i] == minor) {
				System.out.println(estudiantes[i] + " que tiene " + edades[i]);
			}
		}
	}
	private void adultos() {
		for (int i = 0; i < edades.length; i++) {
			System.out.println("los estudiantes mayores son");
			if (edades[i] >=18) {
				System.out.println(estudiantes[i]+ " que tiene " + edades[i]);
			}
		}
	}
	private void buscarNombre() {
		String nombre = JOptionPane.showInputDialog("ingrese el nombre a buscar");
		for (int i = 0; i < edades.length; i++) {
			if (estudiantes[i].equalsIgnoreCase(nombre)) {
				System.out.println(estudiantes[i] + " y tiene " + edades[i]);
			}
		}
	}
	private void buscarEdad() {
		int edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese el nombre a buscar"));
		for (int i = 0; i < edades.length; i++) {
			if (edades[i]==edad) {
				System.out.println(estudiantes[i] + " y tiene " + edades[i]);
			}
		}
	}
}

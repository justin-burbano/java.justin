package exercise2;
import javax.swing.JOptionPane;
import java.util.ArrayList;


	public class Procesos{
		
		ArrayList<String> estudiantes = new ArrayList<String>();
		ArrayList<Integer> edades = new ArrayList<Integer>();
		
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
			case 2:if (!estudiantes.isEmpty()){
				mostrarEstudiantes();
				}
				break;
			case 3:if (!estudiantes.isEmpty()){
				promedio();
				}
				break;
			case 4:if (!estudiantes.isEmpty()){
				mayorEdad();
				}
				break;
			case 5:if (!estudiantes.isEmpty()){
				menorEdad();
				}
				break;
			case 6:if (!estudiantes.isEmpty()){
				adultos();
				}
				break;
			case 7:if (!estudiantes.isEmpty()){
				buscarNombre();
				}
				break;
			case 8:if (!estudiantes.isEmpty()){
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
			
			
			for (int i = 0; i < edades.size(); i++) {
				estudiantes.add(JOptionPane.showInputDialog("Ingrese el nombre del estudiante " + (i+1)));
			    edades.add(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante " + (i+1))));
			}
		}
		private void mostrarEstudiantes() {
		    for (int i = 0; i < estudiantes.size(); i++) {
		        System.out.print("(" + estudiantes.get(i) + " | " + edades.get(i) + ")");
		    }
		}

		private void promedio() {
		    int sum = 0;
		    for (int i = 0; i < edades.size(); i++) {
		        sum += edades.get(i);
		    }
		    System.out.println(sum / edades.size());
		}

		private void mayorEdad() {
		    int mayor = 0;
		    for (int i = 0; i < edades.size(); i++) {
		        if (edades.get(i) > mayor) {
		            mayor = edades.get(i);
		        }
		    }
		    for (int i = 0; i < edades.size(); i++) {
		        if (edades.get(i) == mayor) {
		            System.out.println(estudiantes.get(i) + " que tiene " + edades.get(i));
		        }
		    }
		}

		private void menorEdad() {
		    int menor = Integer.MAX_VALUE;
		    for (int i = 0; i < edades.size(); i++) {
		        if (edades.get(i) < menor) {
		            menor = edades.get(i);
		        }
		    }
		    for (int i = 0; i < edades.size(); i++) {
		        if (edades.get(i) == menor) {
		            System.out.println(estudiantes.get(i) + " que tiene " + edades.get(i));
		        }
		    }
		}

		private void adultos() {
		    System.out.println("Los estudiantes mayores son:");
		    for (int i = 0; i < edades.size(); i++) {
		        if (edades.get(i) >= 18) {
		            System.out.println(estudiantes.get(i) + " que tiene " + edades.get(i));
		        }
		    }
		}

		private void buscarNombre() {
		    String nombre = JOptionPane.showInputDialog("Ingrese el nombre a buscar");
		    for (int i = 0; i < edades.size(); i++) {
		        if (estudiantes.get(i).equalsIgnoreCase(nombre)) {
		            System.out.println(estudiantes.get(i) + " y tiene " + edades.get(i));
		        }
		    }
		}

		private void buscarEdad() {
		    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad a buscar"));
		    for (int i = 0; i < edades.size(); i++) {
		        if (edades.get(i) == edad) {
		            System.out.println(estudiantes.get(i) + " y tiene " + edades.get(i));
		        }
		    }
		}

	}


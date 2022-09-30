import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Operaciones {
	
	ArrayList<String> nommbrePersona = new ArrayList <String>();
	ArrayList<String> Documento = new ArrayList <String>();
	ArrayList<String> Telefono = new ArrayList <String>();
	String nombreCompleto, documento, telefono;
	int indice;

public void registrarPersonas() {
		nombreCompleto = JOptionPane.showInputDialog("Ingrese el nombre");
		nommbrePersona.add(nombreCompleto);
		documento = JOptionPane.showInputDialog("Ingrese el numero de documento");
		Documento.add(documento);
		telefono = JOptionPane.showInputDialog("Ingrese el numero de telefono");
		Telefono.add(telefono);
	}
	
	public void consultarPersonas() {
		
		System.out.println("Consultar personas");
		
		String buscar = JOptionPane.showInputDialog("¿A quien desea buscar?");
		
		if(nommbrePersona.contains(buscar)) {
			indice = nommbrePersona.indexOf(buscar);
			System.out.println("Persona: "+ nommbrePersona.get(indice)+ " Documento: "+Documento.get(indice) + " Telefono: "+Telefono.get(indice));
			System.out.println("--------------------------------------");
		}
	}
	
	
	public void consultarListasPersonas() {
		
		System.out.println();
		
		System.out.println("Lista de personas");
		
		for (int i = 0; i < nommbrePersona.size(); i++) {
			System.out.println("Persona: "+ nommbrePersona.get(i)+ " Documento: "+Documento.get(i) + " Telefono: "+Telefono.get(i));
			System.out.println("--------------------------------------");
		}
	}
	
	public void actualizarPersonas() {
		
		System.out.println();
		
		System.out.println("Actualizacion de datos");
		
		String buscar = JOptionPane.showInputDialog("Nombre que desea actualizar");
		
		int i2= 0;
		
		if(nommbrePersona.contains(buscar)) {
			String dato = JOptionPane.showInputDialog("¿Actualizar nombre, documento o telefono?");
			i2 = nommbrePersona.indexOf(buscar);
			if(dato.equalsIgnoreCase("documento")) {
				String doc = JOptionPane.showInputDialog("Introduzca el nuevo documento");
				Documento.set(i2, doc);
			}else if(dato.equalsIgnoreCase("telefono")) {
				String tel = JOptionPane.showInputDialog("Introduzca el nuevo telefono");
				Telefono.set(i2, tel);
			}else if(dato.equalsIgnoreCase("nombre")) {
				String nom = JOptionPane.showInputDialog("Introduzca el nuevo nombre");
				nommbrePersona.set(i2,nom);
			}else {
				System.out.println("No se encontro");
			}
			
		}
		System.out.println("Datos actualizados");
	}
	
	public void eliminarPersonas() {
		
		System.out.println();
		
		System.out.println("Eliminar datos");
		
		String eliminar = JOptionPane.showInputDialog("Persona que desea eliminar");
		
		int i2= 0;
		
		if(nommbrePersona.contains(eliminar)) {
			i2 = nommbrePersona.indexOf(eliminar);
			
			System.out.println("Persona: "+ nommbrePersona.remove(i2)+ " Documento: "+Documento.remove(i2) + " Telefono: "+Telefono.remove(i2));
			System.out.println("Datos eliminados con exito");
			System.out.println("--------------------------------------");
			
		}
	}
	
	public void cantidadPersonas() {
		
		System.out.println();
		
		System.out.println("Cantidad de personas");
		
		System.out.println("La cantidad de personas es: "+nommbrePersona.size());
	}
}


public class Principal {

	public static void main(String[] args) {
		
		String menu = "Menú de opciones\n";
		menu+= "1. Registrar Persona\n";
		menu+="2. Consultar Persona\n";
		menu+="3. Consultar lista de personas\n";
		menu+="4. Actualizar Persona\n";
		menu+="5. Eliminar Persona\n";
		menu+="6. Cantidad de personas\n";
		menu+="7. Salir\n";
		
		RegistroPersonas misProcesos = new RegistroPersonas();
		misProcesos.inicial(menu);

	}

}







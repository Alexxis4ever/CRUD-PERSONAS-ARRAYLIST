

import javax.swing.JOptionPane;

public class RegistroPersonas {
	
	Operaciones operacion = new Operaciones();
	
	public void inicial(String menu) {
		
		int cod = 0;
		
		do {
			cod = Integer.parseInt(JOptionPane.showInputDialog(menu));
			SeleccionMenu(cod);
		}while(cod!=7);
		
		System.out.println("Terminaste");
	}
	
	public void SeleccionMenu(int cod) {
		switch(cod){
		case 1: operacion.registrarPersonas(); break;
		case 2: operacion.consultarPersonas(); break;
		case 3: operacion.consultarListasPersonas(); break;
		case 4: operacion.actualizarPersonas(); break;
		case 5: operacion.eliminarPersonas(); break;
		case 6: operacion.cantidadPersonas(); break;
		case 7: break;
		default: System.out.println("No existe");
		break;
		}
	}
	
	
}

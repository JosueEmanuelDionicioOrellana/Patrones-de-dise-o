package Factory_Metodo;

public class Main {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
	
		Dialogo dialogo;
		
		int uno = 2;
		
		if(uno==1 ) {
			dialogo = new DialogoHTML();
		}else {
			dialogo = new DialogoWindows();
		}
		
		System.out.print(dialogo.crearBoton().getModelo());
	}

}

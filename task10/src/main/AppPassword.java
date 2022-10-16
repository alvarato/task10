package main;

import javax.swing.JOptionPane;

public class AppPassword {
	
	public void ejecutar() {
		int rangoArray = cargarInt("Ingrese el tamaño del arrray");
		Password[] passwords = new Password[rangoArray];
		for (int i = 0; i < passwords.length; i++) {
			int aux = cargarInt(("Ingrese el tamaño de la contraseña número " + (i+1)));
			passwords[i] = new Password(aux);
		}
		Boolean[] esFuerte = new Boolean[rangoArray];
		for (int i = 0; i < esFuerte.length; i++) {
			esFuerte[i] = passwords[i].esFuerte();
		}
		
		show(esFuerte,passwords);
	}
	
	//muestra la contaseña y si es fuerte o no ;
	public void show(Boolean[] esFuerte, Password[] passwords) {
		String aux  = "";
		for (int i = 0; i < passwords.length; i++) {
			aux += "Password: " + passwords[i] + " " + "Es Fuerte: " + esFuerte[i] + "\n"; 
		}
		JOptionPane.showConfirmDialog(null, aux + "\n" + "Porfe le deje en la consola como analiza "
				+ "y compara los datos de los dos for para ver si esFuerte()");
	}
	
	//devuelve un string capturando el error y la funcion se llama asi misma hasta obtener el
	//dato correcto
	public int cargarInt(String ms) {
		int data;
		try {
			data = Integer.parseInt(JOptionPane.showInputDialog(null,
					ms));
			return data;
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, "Error al ingresar el dato intente de nuevo");
			return cargarInt(ms);
		}
	}
	
	//devuelve un string capturando el error y la funcion se llama asi misma hasta obtener el
	//dato correcto
	public String cargarString() {
		String data;
		try {
			data = JOptionPane.showInputDialog(null,"Ingrese la Contraseña");
			return data;
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, "Error al ingresar el dato intente de nuevo");
			return cargarString();
		}
	}
}

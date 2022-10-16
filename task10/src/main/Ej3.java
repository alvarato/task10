package main;

import javax.swing.JOptionPane;

import Exception.ParImparException;

public class Ej3 {
	public void ejecutar() {
		try {
			int random = (int) (Math.random() * 999 + 1);
			String ms = "|Generando número alertorio...       | \n"
					 + "|El número alertorio generado es: "+ random + "|" +"\n vea la consola";
			JOptionPane.showConfirmDialog(null, ms);
			System.out.println(ms);
			if(random%2 == 0) {throw new ParImparException(110);}
			else {throw new ParImparException(111);}
		} catch (ParImparException ex) {
			System.out.println(ex.getMessage());
		}
 	}
}

package main;

import javax.swing.JOptionPane;

public class Ej1 {
	private int num;
	private int intentos;

	public Ej1() {
		this.num = (int) (Math.random() * 500 + 1);
		this.intentos = 0;
	}

	public void ejecutar() {
		int key = 0;
		String s = "";
		do {
			try {
				if (key == 0) {
					key = Integer.parseInt(JOptionPane.showInputDialog(null, "Intente adivinar el número del 1 al 500"));
				}else {
					key = Integer.parseInt(JOptionPane.showInputDialog(null, "EL número a adivinar es " + s + " que el elegido intentende de nuevo"));
				}
				s = (key > this.num)?"menor":"mayor";
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null,"El dato ingresado no es valido");
				System.out.println(e);
			}finally {
				this.intentos += 1;
			}
		} while (key != num);
		JOptionPane.showConfirmDialog(null,"El número: " + this.num + " es correcto \n Intentos: " + this.intentos);
	}
}

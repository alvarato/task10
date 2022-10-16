package main;

import javax.swing.JOptionPane;

public class mainApp {
	public static void main(String[] args) {
		AppPassword appPassword = new AppPassword();
		boolean flag;
		do {
			String ms = "Ingrese el número correspondiente para ejecutar al APP"
					+ "\n" + "(1) Adivina el Número" + "\n" + "(2) Exception ParImpar" + "\n" + "(3) Calculadora" + "\n"
					+ "(4) Password";
			int key = appPassword.cargarInt(ms);
			switch (key) {
			case 1:
				Ej1 ej1 = new Ej1();
				ej1.ejecutar();
				break;
			case 2:
				Ej3 ej3 = new Ej3();
				ej3.ejecutar();
				break;
			case 3:
				Calculadora calculadora = new Calculadora();
				calculadora.calculo();
				break;
			case 4:
				appPassword.ejecutar();
				break;
			default:
				break;
			}
			ms = "Ingrese 1 para selecionar otra opcion, 2 para salir";
			int auxFlag = appPassword.cargarInt(ms);
			flag = (auxFlag == 1) ? true : false;
		} while (flag);
	}
}

package main;

import javax.swing.JOptionPane;

public class Calculadora {
	private double a;
	private double b;
	private double result;

	public void calculo() {
		boolean flag;
		do {
			String key = JOptionPane.showInputDialog(null,
					"Ingrese el número que corresponda con la operacion \n" + "(+) Suma  \n" + "(-) Resta  \n"
							+ "(*) Multiplicacion \n" + "(/) Division \n" + "(p) Potencia \n" + "(r2) Raiz cuadrada \n"
							+ "(r3) Raiz cubica");
			switch (key) {
			case "+":
				suma();
				break;
			case "-":
				resta();
				break;
			case "*":
				multiplicacion();
				break;
			case "/":
				division();
			case "p":
				potencia();
				break;
			case "r2":
				r2();
				break;
			case "r3":
				r3();
				break;

			default:
				break;
			}
			try {
				int auxFlag = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese 1 para selecionar otra opcion, 2 para salir"));
				flag = (auxFlag == 1) ? true : false;
			} catch (Exception e) {
				flag = true;
			}

		} while (flag);
	}

	// suma a+b;
	public void suma() {
		try {
			a = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número"));
			b = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número"));
			result = a + b;
			JOptionPane.showConfirmDialog(null, a + " + " + b + " = " + result);
		}catch(Exception ex) {
			JOptionPane.showConfirmDialog(null,"El dato ingresado no es valido");
			System.out.println(ex);
		}
	}

	// resta a-b;
	public void resta() {
		try {
			a = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número"));
			b = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el número que sustracción"));
			result = a - b;
			JOptionPane.showConfirmDialog(null, a + " - " + b + " = " + result);
		}catch(Exception ex) {
			JOptionPane.showConfirmDialog(null,"El dato ingresado no es valido");
			System.out.println(ex);
		}
	}

	// multiplica a*b;
	public void multiplicacion() {
		try {
			a = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número"));
			b = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número"));
			result = a * b;
			JOptionPane.showConfirmDialog(null, a + " * " + b + " = " + result);
		}catch(Exception ex) {
			JOptionPane.showConfirmDialog(null,"El dato ingresado no es valido");
			System.out.println(ex);
		}

	}

	// divide a en b;
	public void division() {
		try {
			a = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el dividendo"));
			b = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el divisor"));
			if (b == 0) {
				System.out.println("No se puede dividir en 0");
			}else {
			result = a / b;
			JOptionPane.showConfirmDialog(null, a + " / " + b + " = " + result);
			}
		}catch (Exception ex) {
			System.out.println(ex);
			JOptionPane.showConfirmDialog(null,"El dato ingresado no es valido");
		}

	}

	// a elevado en b
	public void potencia() {
		try {
			a = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base"));
			b = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el exponente"));
			result = Math.pow(a, b);
			JOptionPane.showConfirmDialog(null, a + " ^ " + b + " = " + result);	
		}catch(Exception ex) {
			JOptionPane.showConfirmDialog(null,"El dato ingresado no es valido");
			System.out.println(ex);
		}

	}

	// raiz cuadrada de a
	public void r2() {
		try {
			a = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base"));
			result = Math.sqrt(a);
			JOptionPane.showConfirmDialog(null, "2√ " + a + " = " + result);
		}catch(Exception ex) {
			JOptionPane.showConfirmDialog(null,"El dato ingresado no es valido");
			System.out.println(ex);
		}

	}

	// raiz cubica de a
	public void r3() {
		try {
			a = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base"));
			result = Math.cbrt(a);
			JOptionPane.showConfirmDialog(null, "3√ " + a + " = " + result);
		}catch(Exception ex) {
			JOptionPane.showConfirmDialog(null,"El dato ingresado no es valido");
			System.out.println(ex);
		}

	}
}

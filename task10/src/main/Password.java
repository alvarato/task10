package main;

public class Password {
	private String contraseña;
	private int longitud;

	final private int LONGITUD = 8;
	final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz012345678901234567890123456789012345678901234567890123456789";

	public Password() {
		this.longitud = LONGITUD;
	}

	public Password(int longitud) {
		this.contraseña = generaContraseña(longitud);
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	// genera una contraseña alertiria con la longitud ingresada
	public String generaContraseña(int longitud) {
		String aux = "";
		for (int i = 0; i < longitud; i++) {
			int random = (int) (Math.random() * CHARS.length());
			aux += CHARS.charAt(random);
		}
		return aux;

	}

	// contrtola todos los datos para ver si la contraseña (esfuerte)?true:false;
	public boolean esFuerte() {
		//count[0]= numeros//count[0]= mayus//count[0]= minus;
		String[] count = {"","",""};
		// indice del array chars;
		int ronda;
		// se ejecuta x cantidad dependiendo de la contraseña;
		for (int i = 0; i < contraseña.length(); i++) {
			ronda = 0;
			esFuerteControl(ronda,i,count);
		}
		System.out.print("Números= " + count[0] + " total="+ count[0].length() + "\n" + 
				"Mayúsculas= " + count[1] + " total= " + count[1].length() + "\n" +
				"Minúsculas= " + count[2] + " total=" + count[2].length());
		return (count[0].length() >= 5 && count[1].length() >= 2 && count[2].length() >= 1) ? true : false;
	}
	// se ejecuta como maximo 3 rondas si se enceutnra coicidencia se suma
	// +1 al contador de la ronda correspondiente y rompe el 2do for y se vuelve a
	// ejecutar hasta terminar la cantida de letras
	public void esFuerteControl(int ronda,int index, String[] count){
		System.out.println("Password: "+contraseña +"("+index+")");
		String[] chars = { "0123456789", " ABCDEFGHIJKLMNOPQRSTUVWXYZ", " abcdefghijklmnopqrstuvwxyz" };
		for (int j = 0; j < chars[ronda].length(); j++) {
			//charcontraseña el valor de la contraseña en la posision del index;
			String charContraseña = String.valueOf(contraseña.charAt(index));
			String compare = String.valueOf(chars[ronda].charAt(j));
			System.out.println(charContraseña + "-" + compare  + "- ronda: " + ronda);
			if (charContraseña.equals(compare)) {
				System.out.println(true);
				count[ronda] += charContraseña;
				break;
			}
			// si se ejecuto todo el for reiniciamos el index y aumentamos la ronda
			// y si ronda es == 2 ronda sale el for analizar
			// la siguiente parte de la contraseña
			if (j == (chars[ronda].length() - 1) && ronda < 2) {
				ronda += 1;
				j = 0;
			}
		}
	}

	@Override
	public String toString() {
		return contraseña;
	}

}

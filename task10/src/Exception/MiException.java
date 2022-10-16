package Exception;

public class MiException extends Exception{
	
	public String getMensage() {
		return "Mensaje mostrado por pantalla \n"
				+ "Excepcion capturada con mensaje: Esto es un objeto Exception \n"
				+ "Programa Terminado";
	}
}

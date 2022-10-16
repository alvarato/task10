package Exception;

public class ParImparException extends Exception{
	private int codigoException;

	public ParImparException(int codigoException) {
		this.codigoException = codigoException;
	}

	public String getMessage() {
		switch (codigoException) {
		case 110:
			return "|Es Par                              |\n"+
					"|____________________________________|";
		case 111:
			return "|Es ImPar                            |\n"+
					"|____________________________________|";
		default:
			return "Exception no encontrada";
		}
	}
}

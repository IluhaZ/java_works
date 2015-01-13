package MyExeptions;

@SuppressWarnings("serial")
public class NoSuchCurrencyCodeExeption extends Exception {

	public NoSuchCurrencyCodeExeption() {
		super();
	}

	public NoSuchCurrencyCodeExeption(String message) {
		super(message);
	}


}

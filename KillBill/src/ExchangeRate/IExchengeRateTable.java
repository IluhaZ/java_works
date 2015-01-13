package ExchangeRate;

import MyExeptions.NoSuchCurrencyCodeExeption;

public interface IExchengeRateTable {

	Double rateOf(String currencyCode) throws NoSuchCurrencyCodeExeption;

	String rateTo();

}

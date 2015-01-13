package ExchangeRate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

import MyExeptions.NoSuchCurrencyCodeExeption;

public class ExchangeRateTable implements IExchengeRateTable {

	Map<String, Double> exRateTable = new HashMap<>();
	static Scanner scanner = null;
	String mainCurrRate;
	
	public static IExchengeRateTable getExchangeTable(String srcFile){
		
		try {
			scanner = new Scanner(new File(srcFile));
		} catch (FileNotFoundException e) {
			
			System.out.println("File Not Found");
			return null;
		}
		
		return ExHolder.inst;
	}
	
	private static class ExHolder{
		static IExchengeRateTable inst = new ExchangeRateTable();
	}
	
	private ExchangeRateTable(){
		Scanner scan = scanner.useDelimiter("\\s|\\n");
		mainCurrRate = scan.next();
		scan.nextLine();
		exRateTable.put(mainCurrRate, (double) 1);
		while(scan.hasNext() ){
			try{
				String currencyCode = scan.next();
				Double exchangeRate = scan.nextDouble();
				exRateTable.put(currencyCode, exchangeRate);
				scan.nextLine();
			}catch(NoSuchElementException ex){
				break;
			}
		
		}
		scanner.close();
	}
	
	@Override
	public Double rateOf(String currencyCode) throws NoSuchCurrencyCodeExeption{
		if(!exRateTable.containsKey(currencyCode))
			throw new NoSuchCurrencyCodeExeption();
		return  exRateTable.get(currencyCode);
	}
	
	@Override
	public String rateTo(){
		return mainCurrRate;
	}
}

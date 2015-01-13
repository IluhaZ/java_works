package KillBill;

import java.util.List;

import BillParser.BillParserV1;
import BillParser.IBillParse;
import ExchangeRate.ExchangeRateTable;
import ExchangeRate.IExchengeRateTable;
import MyExeptions.NoSuchCurrencyCodeExeption;
import OrderDetails.OrderDetails;

public class KillBill {
	IBillParse bp;
	IExchengeRateTable ext;
	String currCode;
	public KillBill(String bill, String exRate, String currCode) {
		bp = BillParserV1.getBillParser(bill);
		ext = ExchangeRateTable.getExchangeTable(exRate);
		this.currCode = currCode;
	}
	
	public Double calculate() throws NoSuchCurrencyCodeExeption{
		Double sum = (double) 0;
		List<OrderDetails> ordList = bp.getOrderDetailsList();
		for (OrderDetails od : ordList) {
			Double temp;
			System.out.println(od.currencyCode);
			System.out.println(ext.rateOf(od.currencyCode));
			temp = od.price * od.quantity*ext.rateOf(od.currencyCode);
			sum += temp / ext.rateOf(currCode);
		}
		
		return sum;
			
	}

	

}

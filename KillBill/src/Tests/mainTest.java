package Tests;

import java.io.IOException;

import KillBill.KillBill;
import MyExeptions.NoSuchCurrencyCodeExeption;

public class mainTest {

	public static void main(String[] args) throws IOException, NoSuchCurrencyCodeExeption {

		KillBill kb = new KillBill("C:\\Users\\Iluha\\Desktop\\bill.txt", "C:\\Users\\Iluha\\Desktop\\exchang.txt", "YEN");
		
		System.out.println(kb.calculate());
//		IExchengeRateTable ext = ExchangeRateTable.getExchangeTable("C:\\Users\\Iluha\\Desktop\\exchang.txt");
//		
//		System.out.println(ext.rateOf("YEN"));
//		System.out.println(ext.rateTo());
//		IBillParse bp = BillParserV1.getBillParser("C:\\Users\\Iluha\\Desktop\\bill.txt");
//		
//		List<OrderDetails> l = bp.getOrderDetailsList();
//		for (OrderDetails orderDetails : l) {
//			System.out.println(orderDetails);
//		}
//		bp.printOrderList();
	}

	

}

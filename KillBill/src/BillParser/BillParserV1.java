package BillParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import OrderDetails.OrderDetails;

public class BillParserV1 implements IBillParse{
	
	List<OrderDetails> orderList = new ArrayList<>();
	static Scanner scanner = null;
	
	public static IBillParse getBillParser(String srcFile){
		
		try {
			scanner = new Scanner(new File(srcFile));
		} catch (FileNotFoundException e) {
			
			System.out.println("File Not Found");
			return null;
		}
		
		return Holder.inst;
	}
	
	private static class Holder{
		static IBillParse inst = new BillParserV1();
	}
	
	private BillParserV1() {
		Scanner scan = scanner.useDelimiter(":|:|\\s:\\s|\\n");
		
		while( scan.hasNext() ){
			try{
				OrderDetails od= new OrderDetails();
				od.name = scan.next();
				od.quantity = scan.nextInt();
				od.price = scan.nextDouble();
				od.currencyCode = scan.next();
				od.currencyCode = od.currencyCode.substring(0, 3);
				orderList.add(od);
				scan.nextLine();
			}catch(NoSuchElementException ex){
				break;
			}
		}
		scanner.close();
	}
	
	@Override
	public List<OrderDetails> getOrderDetailsList(){
		return orderList;
	}
	
//	public void printOrderList(){
//		for (OrderDetails orderDetails : orderList) {
//			System.out.println(orderDetails);
//		}
//	}
}

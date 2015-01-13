package OrderDetails;

public class OrderDetails {
	public String name;
	public Integer quantity;
	public Double price;
	public String currencyCode;
	@Override
	public String toString() {
		return "OrderDetails: " + name+", "  + quantity + ", "
				 + price + ", " + currencyCode;
	}
	
	
}

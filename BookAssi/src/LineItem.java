//import java.text.NumberFormat; //Combine to BookApp.java

public class LineItem {
	private Book myBook;
	private double price;
	private int quantity;
	private double total;
	
	public LineItem() {
		myBook = new Book();
	}
	
	public void setBook(Book book) {
		myBook = book;
	}
	
	public Book getBook() {
		return myBook;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setQuantity(int q) {
		quantity = q;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getSubtotal() {
		calculateSubtotal();
		return total;
	}
	
	private void calculateSubtotal() {
		if (myBook.getInStock()) {
			total = quantity * myBook.getPrice();
		} else {
			total = 0;
		}
	}
	
	/* public String getFormattedTotal() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(this.getSubtotal());
	}*/

}
//import java.text.NumberFormat; //Combine to BookApp.java

public class Book {
	private String title;
	private String author;
	private String description;
	private double price;
	private boolean isInStock;
	
	public Book() {
		title = "";
		author = "";
		description = "";
		price = 0;
		isInStock = false;
	}
	
	public void setTitle(String t) {
		title = t;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String a) {
		author = a;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setDescription(String d) {
		description = d;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	
	public double getPrice() {
		return price;
	}
	
	/* public String getFormattedPrice() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}*/
	
	public void setInStock(boolean s) {
		isInStock = s;
	}
	
	public boolean getInStock() {
		return isInStock;
	}

}

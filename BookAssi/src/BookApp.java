import java.util.Scanner;
import java.text.NumberFormat;

public class BookApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String choise = "y";
		double taxableSubtotal = 0, tax = 0, untaxableSubtotal = 0;
		
		System.out.println("Welcome to the BookApp");
		System.out.println();
		while (choise.equalsIgnoreCase("y")) {
			String title = Validator.getString(keyboard, "Enter book title: ");
			double price = Validator.getDouble(keyboard, "Enter price: ", 0, 1000);
			int quantity = Validator.getInt(keyboard, "Enter quantity: ", 0, 50);
			boolean untaxable = Validator.getBoolean(keyboard, "Untaxable (true or false): ");
			
			Book myBook = BookDB.getBook(title, price);
			
			LineItem lineItem = new LineItem();
			lineItem.setBook(myBook);
			lineItem.setPrice(price);
			lineItem.setQuantity(quantity);
			
			System.out.println();
			System.out.println("LINE ITEM");
			System.out.println("Title: " + title);
			System.out.println("Author: " + myBook.getAuthor());
			System.out.println("Description: " + myBook.getDescription());
			System.out.println("Price: " + getFormattedPrice(price));
			System.out.println("Quantity: " + getFormattedQuantity(quantity));
			System.out.println("In Stock Status: " + myBook.getInStock());
			System.out.println("Subtotal: " + getFormattedPrice(lineItem.getSubtotal()));
			
			if (!myBook.getInStock()) {
				System.out.println("The book is not in stock.");
			}
			
			if (untaxable == true) {
				untaxableSubtotal += lineItem.getSubtotal();
			} else {
				taxableSubtotal += lineItem.getSubtotal();
			}
			System.out.println();
			
			choise = Validator.getString(keyboard, "Continue? (y/n): ");
			System.out.println();
		}
		tax = taxableSubtotal * 0.05;
		System.out.println("========================================");
		System.out.println();
		System.out.println("Taxable Subtotal: " + getFormattedPrice(taxableSubtotal));
		System.out.println("Untaxable Subtotal: " +getFormattedPrice(untaxableSubtotal));
		System.out.println("Tax: " + getFormattedPrice(tax));
		System.out.println("Grand Total: " + getFormattedPrice(taxableSubtotal + untaxableSubtotal + tax));
	}
	
	public static String getFormattedPrice(double amount) {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(amount);
	}
	
	public static String getFormattedQuantity (int q) {
		NumberFormat number = NumberFormat.getNumberInstance();
		return number.format(q);
	}

}
public class BookDB {
	public static Book getBook(String title, double price) {
		Book myBook = new Book();
		
		myBook.setTitle(title);
		
		if (title.equalsIgnoreCase("java")) {
			myBook.setAuthor("Murach");
			myBook.setDescription("Murach's Beginning Java");
			myBook.setPrice(price);
			myBook.setInStock(true);
		} else if (title.equalsIgnoreCase("jsps")){
			myBook.setAuthor("Murach");
			myBook.setDescription("Murach's Java Servlets and JSP");
			myBook.setPrice(price);
			myBook.setInStock(true);
		} else if (title.equalsIgnoreCase("mcb2")) {
			myBook.setAuthor("Murach");
			myBook.setDescription("Murach's Mainframe COBOL");
			myBook.setPrice(price);
			myBook.setInStock(true);
		} else {
			myBook.setAuthor("Unknown");
			myBook.setDescription("Unknown");
		}
		return myBook;
	}
}

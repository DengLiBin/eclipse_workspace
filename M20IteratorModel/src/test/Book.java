package test;

public class Book {
	private String ISBN;
	private String name;
	private double price;
	public Book(String iSBN, String name, double price) {
		super();
		ISBN = iSBN;
		this.name = name;
		this.price = price;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void DisplayString() {
		System.out.println("Book [ISBN=" + ISBN + ", name=" + name + ", price=" + price + "]");
	}
	
}

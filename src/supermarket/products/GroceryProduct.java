package supermarket.products;

public abstract class GroceryProduct {  //its a shell to contain all the products---ABSTRACTION
	private String name;     //genaral practice of keeping methods public and var private
	private double price;
	private double discount;
	public GroceryProduct(String name, double price, double discount) {	//constructor
		super();
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	//Making getter and setter function for private variables----ENCAPSULATION
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
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getActualPrice() {
		return (price-(price*(discount/100)));
	}
	public String toString() {
		return ("Name:"+name+"\n"+"Price:"+price+"\n"+"Discount:"+discount+"\n");
	}
	
	
}

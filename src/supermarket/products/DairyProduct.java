package supermarket.products;

public class DairyProduct extends GroceryProduct {	//INHERITANCE
	//now DairyProduct is a polymorph as it has multiple forms as it is a DairyProduct as well as GroceryProduct-----POLYMORPHISM
	private Fat Fat; //declaring enum Fat as private
public DairyProduct(String name, double price, double discount, Fat Fat) {  //constructor created as these three variables name,discount and price are in the GroceryProduct which is its parent class
	//we add Fat to initiate it too
		super(name, price, discount);// TODO Auto-generated constructor stub
		this.Fat=Fat;   //added by me
	}
public Fat getFat() {	//Making getter and setter function for Fat
	return Fat;
}
public void setFat(Fat fat) {
	Fat = fat;
}
//creating overriding function
public String toString() { //toString() function doesn't have fat so we will add this to the returned string of that function
	return super.toString()+"Fat Level:"+Fat;
}

}

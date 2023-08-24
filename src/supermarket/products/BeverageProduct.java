package supermarket.products;

public class BeverageProduct extends GroceryProduct implements Drinkable {		//extends is INHERITANCE
	private SugarLevel SugarLevel;    //SugarLevel is enum for which a variable SugarLevel has been defined
	public BeverageProduct(String name, double price, double discount, SugarLevel SugarLevel) {  //constructor created as these three variables name,discount and price are in the GroceryProduct which is its parent class
		//we add SugarLevel to initiate it too
			super(name, price, discount);  //auto-generated part of the constructor which will call super class and get the values
			this.SugarLevel=SugarLevel; 	//added by me
			// TODO Auto-generated constructor stub
		}
	public SugarLevel getSugarLevel() {  //Creating getter and setter function for SugarLevel
		return SugarLevel;
	}
	public void setSugarLevel(SugarLevel sugarLevel) {
		SugarLevel = sugarLevel;
	}
	public String toString() {
		return super.toString()+"SugarLevel:"+SugarLevel;
	}
//	@Override
//	public boolean isHealthy() {
//		// TODO Auto-generated method stub
//		return SugarLevel!=SugarLevel.ADDED_SUGAR;
//	} 
	@Override
	public boolean isHealthy() {
		return SugarLevel!=SugarLevel.ADDED_SUGAR;
	}



}

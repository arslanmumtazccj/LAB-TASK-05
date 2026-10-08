public class Product{
	private static String id;
	private static int countId = 0;
	private static double maxPrice = 0;
	private static double minPrice = 0;
	private String name;
	private double price;
	private int qty;
	private Date mfg;


	public Product(String name,double price,int qty){
	this(name,price,qty,new Date(1,1,1));
}

	public Product(String name,double price,int qty,Date mfg){
	this.name = name;
	this.price = price;
	this.qty = qty;
	this.mfg = mfg;
	countId++;
	id = String.format("P%03d",countId);
	if(maxPrice < price){
	maxPrice = price;
	}
	if(minPrice > price){
	minPrice = price;
	}
	else if(minPrice == 0){
	minPrice = price;
}
}





	public void displayProduct(){
	System.out.println("Name : " + name);
	System.out.println("Price : " + price);
	System.out.println("Quantity : " + qty);
	System.out.println("MAXIMUM PRICE : " + maxPrice);
	System.out.println("MINIMUM PRICE : " + minPrice);
	System.out.println("ID : " + id);
	mfg.displayDate();
	

}
	


}

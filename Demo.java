public class Demo{
	
	public static void main(String args[]){
	Product p1 = new Product("cooking oil",2000,03);
	p1.displayProduct();
	System.out.println("\n");

	Product p2 = new Product("Shampoo",500,40);
	p2.displayProduct();
	System.out.println("\n");

	Product p3 = new Product("Car",2000000,40,new Date());
	p3.displayProduct();

}



}

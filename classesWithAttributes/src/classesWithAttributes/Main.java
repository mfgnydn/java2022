package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		//Constructor
		/*
		 
		 Product product=new Product(1,"Asus Laptop","Asus Laptop",2500,7);
		 
		 */
		
		
		Product product=new Product();
		product.set_name("Asus Laptop");
		product.set_id(1);
		product.set_price(2500);
		product.set_stockAmount(7);
		product.set_despricion("Asus Laptop");
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		

	}

}

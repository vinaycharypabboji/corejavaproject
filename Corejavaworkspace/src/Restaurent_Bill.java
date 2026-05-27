
public class Restaurent_Bill {

	String customer_name;
	String food_item;
	int quantity;
	double price;

	
	Restaurent_Bill(String customer_name,String food_item,int quantity,double price){
		this.customer_name = customer_name;
		this.food_item = food_item;
		this.quantity = quantity;
		this.price = price;
		
	}
	
	void Bill_info(){
		System.out.println("Customer name:" + customer_name);
		System.out.println("Food Item:" + food_item);
		System.out.println("Price:" + price);
		System.out.println("Quantity:" + quantity);
		System.out.println("Total Price:" + (price*quantity));
		
	}
	public static void main(String[] args) {
		
		Restaurent_Bill r1 = new Restaurent_Bill("Vinay","Cup cake",3,45.0);
		r1.Bill_info();
		

	}

}

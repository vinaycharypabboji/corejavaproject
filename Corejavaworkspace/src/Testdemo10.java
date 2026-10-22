import java.util.Scanner;

public class Testdemo10 {
		static double total(int quantity,double price) {
		double total_price = quantity*price;
		return total_price;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quantity of products :");
		int quantity = sc.nextInt();
		
		System.out.println("Enter th price of the products :");
		double price = sc.nextDouble();
		
		double TP = total(quantity,price);
		
		System.out.println("totla price is: " + TP);
		
	}
}

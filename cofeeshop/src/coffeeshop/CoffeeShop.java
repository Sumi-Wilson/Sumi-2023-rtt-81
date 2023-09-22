package coffeeshop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {
	// menu of coffee shop
	List<Product> products = new ArrayList<>();
	// List of items in your order
	List<Product> order = new ArrayList<>();
	Scanner input = new Scanner(System.in);

	// setting values
	public void setupProducts() {
		Product coffee = new Product();
		coffee.setName("coffee");
		coffee.setPrice(5.44);
		products.add(coffee);

		Product tea = new Product();
		tea.setName("tea");
		tea.setPrice(4.33);
		products.add(tea);

		Product cookie = new Product();
		cookie.setName("cookie");
		cookie.setPrice(6.77);
		products.add(cookie);

		Product sandwich = new Product();
		sandwich.setName("Donut ");
		sandwich.setPrice(19.99);
		products.add(sandwich);

		
	}

	public void printProduct(Product product) {

		System.out.println("product name:\t" + product.getName() + "\t price:$" + product.getPrice()+"\n");
		

	}

	public void printAllProducts() {
		for (Product product : products) {

			printProduct(product);
		}
	}

	public void example() {
		double coffee = 5.43d;
		double tea = 4.33d;
		double cookie = 6.76d;
		double subTotal = 0;
		subTotal = coffee * 1;
		subTotal = subTotal + (tea * 1);
		subTotal = subTotal + (cookie * 1);
		// System.out.println("subtotal is : "+ subTotal);
		DecimalFormat df = new DecimalFormat("00.00");
		System.out.println("Subtotal is\t" + df.format(subTotal));
		double salesTax = subTotal * 0.10;
		System.out.println("salesTax is \t " + df.format(salesTax));
		double totalSale = subTotal + salesTax;
		System.out.println("total sale is \t" + totalSale);
	}

	public int displayMainUserMenu() {

		System.out.println("1) print the menu item and price");
		System.out.println("2) add an item to your order");
		System.out.println("3) print the items in your order");
		System.out.println("4) checkout");
		System.out.println("5) Exit");
		System.out.println("\nwhatdo you want to do:");
		int select = input.nextInt();
		input.nextLine();
		return select;
	}

	// For user to select item from menu to his order list
	public void userSelectProduct() {
		// Product product =new Product();
		System.out.println("Enter product name to order");
		String orderSelection = input.nextLine();
		for (Product product : products) {
			if (product.getName().equalsIgnoreCase(orderSelection)) {
				order.add(product);

				System.out.println("ADDED " + product.getName() + " TO YOUR ORDER\n ");

			}
		}
	}

	
	public void printOrder() {
		System.out.println("\n*********** Your Order ******************");
		for (Product order : order) {
			System.out.println("Product name : " + order.getName() + "Price : " +"$"+ order.getPrice());
			
		}
		System.out.println("*****************************************\n");
	}

	public static void main(String[] args) {

		CoffeeShop cf = new CoffeeShop();
		cf.setupProducts();
		
		
		while(true) {
			int userSelection = cf.displayMainUserMenu();
			if(userSelection == 1) {
				cf.printAllProducts();
			
			}else if(userSelection == 2) {
			    cf.userSelectProduct();
				
		          
			}else if(userSelection == 3) {
			   cf.printOrder();
			}else if(userSelection == 5) {
				System.exit(0);	
			}else {
				System.out.println("User selection "+ userSelection + " is unknown Try Again!!");
				
			}
		}
	}
}
	

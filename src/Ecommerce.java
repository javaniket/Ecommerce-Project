import java.util.Scanner;

public class Ecommerce {

	public static void main(String[] args) {
		System.out.println("Welcome to the Ecommers=ce Store!");
		System.out.println("Which type of User are you? 1.Customer 2.Seller 3.Admin");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		String typeOfUser;
		if (choice == 1) {
			typeOfUser = "Customer";
			Customer current = new Customer();
			System.out.println("What is your userId?");
			sc.nextLine();
			current.setUserId(sc.nextLine());
			System.out.println("What is your passWord?");
			sc.nextLine();
			current.setPassword(sc.nextLine());
			if (current.verifyUser() == true) {
				System.out.println("User Verified!");
				while (true) {
					System.out.println("Do you want to 1.View products 2.View Cart 3.Contact Us 4.Exit");
					choice = sc.nextInt();
					if (choice == 1) {
						Catalogue catalogue = new Catalogue();
						Product[] allProducts = catalogue.getListOfAllProducts();
						for (int i = 0; i < allProducts.length; i++) {
							System.out.println(allProducts[i].getProductId() + " " + allProducts[i].getProductName()
									+ " " + allProducts[i].getCost());

						}
						System.out.println("Do you want to add any product to the cart? Y/N");
						sc.nextLine();
						String addToCart = sc.nextLine();

						if (addToCart.equals("Y")) {
							System.out.println("Input the product id of the product which you want to add to cart.");
							String productId = sc.nextLine();
							Product[] cartProducts = new Product[1];
							for (int i = 0; i < allProducts.length; i++) {
								if (allProducts[i].getProductId().equals(productId))
									cartProducts[0] = allProducts[i];
							}

							Cart cart = new Cart();
							cart.setCartId("1");
							cart.setListOfProducts(cartProducts);
							current.setCart(cart);
							System.out.println("The product is syccessfully added to the cart");
						}
					}

					else if (choice == 2) {
						Product[] cartProducts = current.getCart().getListOfProducts();
						for (int i = 0; i < cartProducts.length; i++) {
							System.out.println(cartProducts[i].getProductId() + " " + cartProducts[i].getProductName()
									+ " " + cartProducts[i].getCost());
						}
						System.out.println("Do you want to Checkout? Y/N");
						sc.nextLine();
						String checkout = sc.nextLine();
						if (checkout.equals("Y"))
							if (current.getCart().checkOut())
								System.out.println("Your order is placed Successfully");

					} else if (choice == 3) {
						System.out.println("To contact us, please email on Ecommerce@ecommerce.com");
					} else if (choice == 4) {
						break;
					} else
						System.out.println("Invalid Request, Please try again");
				}
			}
			}
		System.out.println("Which type of User are you? 1.Customer 2.Seller 3.Admin");
		choice = sc.nextInt();
		
			 if (choice == 2) {
				typeOfUser = "Seller";
				Seller current1 = new Seller();
				System.out.println("What is your userId?");
				sc.nextLine();
				current1.setUserId(sc.nextLine());
				System.out.println("What is your passWord?");
				sc.nextLine();
				current1.setPassword(sc.nextLine());
				if (current1.verifyUser() == true) {
					System.out.println("User Verified!");
				}
			 else if (choice == 3) {
				typeOfUser = "Admin";
				Admin current2 = new Admin();
				System.out.println("What is your userId?");
				sc.nextLine();
				current2.setUserId(sc.nextLine());
				System.out.println("What is your passWord?");
				sc.nextLine();
				current2.setPassword(sc.nextLine());
				if (current2.verifyUser() == true) {
					System.out.println("User Verified!");
				}
				
				else if (choice == 1) {
					typeOfUser = "Customer";
					Customer current = new Customer();
					System.out.println("What is your userId?");
					sc.nextLine();
					current.setUserId(sc.nextLine());
					System.out.println("What is your passWord?");
					sc.nextLine();
					current.setPassword(sc.nextLine());
					if (current.verifyUser() == true) {
						System.out.println("User Verified!");
					}
			 else {
				System.out.println("Invalid input. Try Again!");
			 }
				}
			 }
				
	}
}
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Product product1 = new Product(101, "Shirt", 49.99);
        Product product2 = new Product(102, "Pants", 69.99);
        Product product3 = new Product(103, "Jacket", 99.99);


        User user = new User(1);
        Seller seller = new Seller(1);

        while (true) {
            System.out.println("|\tWelcome to E-commerce\t|");
            System.out.println("1. User Login");
            System.out.println("2. Seller Login");
            System.out.println("3. Exit");
            System.out.print("Choose your role (1/2/3): ");
            int choice = sc.nextInt();

            if (choice == 1) {

                user.signUp();
                boolean userActive = true;
                while (userActive) {
                    System.out.println("\n|\tUser Menu\t|");
                    System.out.println("1. View Products");
                    System.out.println("2. View Cart");
                    System.out.println("3. Add Product to Cart");
                    System.out.println("4. Log Out");
                    System.out.print("Choose an option: ");
                    int userChoice = sc.nextInt();

                    switch (userChoice) {
                        case 1:
                            user.showProducts();
                            break;
                        case 2:
                            user.showCart();
                            break;
                        case 3:
                            user.addToCart(product1);
                            break;
                        case 4:
                            userActive = false;
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                }
            } else if (choice == 2) {

                seller.signUp();
                boolean sellerActive = true;
                while (sellerActive) {
                    System.out.println("\n|\tSeller Menu\t|");
                    System.out.println("1. Remove Product");
                    System.out.println("2. Add Product");
                    System.out.println("3. Log Out");
                    System.out.print("Choose an option: ");
                    int sellerChoice = sc.nextInt();

                    switch (sellerChoice) {
                        case 1:
                            seller.removeProduct();
                            break;
                        case 2:
                            seller.addProduct(product1);
                            System.out.println("Product's added.");
                            seller.addProduct(product2);
                            System.out.println("Product's added.");
                            seller.addProduct(product3);
                            System.out.println("Product's added.");

                            break;
                        case 3:
                            sellerActive = false;
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                }
            } else if (choice == 3) {
                System.out.println("Exiting the application...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

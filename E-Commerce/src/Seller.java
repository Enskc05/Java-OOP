import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Seller implements IPerson {
    private int sellerId;
    private String sellerPassword;
    private String sellerUsername;
    private String sellerName;
    private String sellerCategory;

    private List<Product> products;
    private Scanner sc = new Scanner(System.in);

    public Seller(int id) {
        this.sellerId = id;
        this.products = new ArrayList<>();
    }

    @Override
    public void showPersonDetail() {
        if (sellerName == null) {
            System.out.println("\tNo record found. Please sign up first!");
            signUp();
        } else {
            System.out.println("|\tSeller Details\t|");
            System.out.println("\tSeller's ID\t: " + sellerId);
            System.out.println("\tSeller's Name\t: " + sellerName);
            System.out.println("\tSeller's Category\t: " + sellerCategory);
            viewProducts();
        }
    }

    @Override
    public void signUp() {
        System.out.println("|\tWelcome to the e-commerce sign-up page\t|");

        this.sellerName = getInput("Enter your name");
        this.sellerCategory = getInput("Enter the category you want to sell");
        this.sellerUsername = getInput("Enter your username");
        this.sellerPassword = getInput("Enter your password");

        System.out.println("\n|***** Sign-up successful! You are directed to the login page *****|");
        signIn();
    }

    @Override
    public void signIn() {
        System.out.println("|\tWelcome to the e-commerce sign-in page\t|");

        String inputUsername = getInput("Username");
        String inputPassword = getInput("Password");

        if (inputUsername.equals(this.sellerUsername) && inputPassword.equals(this.sellerPassword)) {
            System.out.println("\n|***** Login successful! *****|");
            showPersonDetail();
        } else {
            System.out.println("\n|***** Incorrect username or password. Please try again. *****|");
            signIn();
        }
    }

    public void addProduct(Product product) {
        products.add(product);  // Directly add the given product to the list
        System.out.println("Product added: " + product.getProductName());
    }

    public void viewProducts() {
        System.out.println("\n|\tProduct List\t|");
        if (products.isEmpty()) {
            System.out.println("\tNo products available.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    public void removeProduct() {
        System.out.println("\n|\tRemove a Product\t|");
        int id = Integer.parseInt(getInput("Enter the product ID to remove"));

        Product productToRemove = null;
        for (Product product : products) {
            if (product.getProductId() == id) {
                productToRemove = product;
                break;
            }
        }

        if (productToRemove != null) {
            products.remove(productToRemove);
            System.out.println("\n|***** Product removed successfully! *****|");
        } else {
            System.out.println("\n|***** Product not found! *****|");
        }
    }

    private String getInput(String prompt) {
        System.out.print("\t" + prompt + ": ");
        return sc.nextLine();
    }
}

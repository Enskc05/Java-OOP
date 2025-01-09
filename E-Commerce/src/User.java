import java.util.*;

public class User implements IPerson {
    private int userId;
    private String userName;
    private String name;
    private String userPassword;
    private List<String> cart;
    private List<Product> productList;

    private Scanner sc = new Scanner(System.in);

    public User(int id) {
        this.userId = id;
        this.cart = new ArrayList<>();
        this.productList = new ArrayList<>();
    }

    @Override
    public void showPersonDetail() {
        if (userName == null) {
            System.out.println("\tNo record found. Please sign up first!");
            signUp();
        } else {
            System.out.println("|\tUser Details\t|");
            System.out.println("\tUser ID\t: " + userId);
            System.out.println("\tName\t: " + name);
            System.out.println("\tCart\t: " + cart);
        }
    }

    @Override
    public void signUp() {
        System.out.println("|\tWelcome to the e-commerce sign-up page\t|");
        this.name = getInput("Enter your name");
        this.userName = getInput("Enter your username");
        this.userPassword = getInput("Enter your password");

        System.out.println("\n|***** Sign-up successful! You are directed to the login page *****|");
        signIn();
    }

    @Override
    public void signIn() {
        System.out.println("|\tWelcome to the e-commerce sign-in page\t|");

        String inputUsername = getInput("Username");
        String inputPassword = getInput("Password");

        if (inputUsername.equals(this.userName) && inputPassword.equals(this.userPassword)) {
            System.out.println("\n|***** Login successful! *****|");
            showPersonDetail();
        } else {
            System.out.println("\n|***** Incorrect username or password. Please try again. *****|");
            signIn();
        }
    }


    public void showProducts() {
        if (productList.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("|\tAvailable Products\t|");
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }


    public void addProduct(Product product) {
        productList.add(product);
    }


    public void addToCart(Product product) {
        cart.add(product.getProductName());
        System.out.println(product.getProductName() + " added to your cart.");
    }


    public void showCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("|\tProducts in your Cart\t|");
            for (String productName : cart) {
                System.out.println(productName);
            }
        }
    }

    private String getInput(String prompt) {
        System.out.print("\t" + prompt + ": ");
        return sc.next();
    }
}

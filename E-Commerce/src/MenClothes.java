public class MenClothes extends Clothes {
    private String occasion;

    public MenClothes(int productId, String productName, double productPrice, String size, String color, String material, String occasion) {
        super(productId, productName, productPrice, size, color, material);
        this.occasion = occasion;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    @Override
    public void displayCategory() {
        System.out.println("This is a men's clothing item.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Occasion: " + occasion;
    }
}

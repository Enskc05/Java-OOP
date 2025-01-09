public class WomenClothes extends Clothes {
    private boolean hasAccessories;

    public WomenClothes(int productId, String productName, double productPrice, String size, String color, String material, boolean hasAccessories) {
        super(productId, productName, productPrice, size, color, material);
        this.hasAccessories = hasAccessories;
    }

    public boolean isHasAccessories() {
        return hasAccessories;
    }

    public void setHasAccessories(boolean hasAccessories) {
        this.hasAccessories = hasAccessories;
    }

    @Override
    public void displayCategory() {
        System.out.println("This is a women's clothing item.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Has Accessories: " + (hasAccessories ? "Yes" : "No");
    }
}

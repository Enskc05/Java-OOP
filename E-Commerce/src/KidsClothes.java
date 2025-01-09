public class KidsClothes extends Clothes {
    private int ageGroup; // Örneğin: 0-2, 3-5, 6-10 yaş

    public KidsClothes(int productId, String productName, double productPrice, String size, String color, String material, int ageGroup) {
        super(productId, productName, productPrice, size, color, material);
        this.ageGroup = ageGroup;
    }

    public int getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(int ageGroup) {
        this.ageGroup = ageGroup;
    }

    @Override
    public void displayCategory() {
        System.out.println("This is a kids' clothing item.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Age Group: " + ageGroup + " years";
    }
}

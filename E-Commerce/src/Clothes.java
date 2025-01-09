public abstract class Clothes extends Product {
    private String size;
    private String color;
    private String material;

    // Constructor
    public Clothes(int productId, String productName, double productPrice, String size, String color, String material) {
        super(productId, productName, productPrice);
        this.size = size;
        this.color = color;
        this.material = material;
    }

    // Getter ve Setter'lar
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Ortak davranışları tanımlamak için bir abstract metot
    public abstract void displayCategory();

    @Override
    public String toString() {
        return super.toString() +
                ", Size: " + size +
                ", Color: " + color +
                ", Material: " + material;
    }
}

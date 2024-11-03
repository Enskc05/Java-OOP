


public class Main {
    public static void main(String[] args) {

        Kitap kitap = new Kitap();
        kitap.setIsim("Java Programlama");
        System.out.println("Kitap İsmi: " + kitap.getIsim());


        DersKitabı dersKitabi = new DersKitabı();
        dersKitabi.setIsim("Matematik Kitabı");
        dersKitabi.setKonu("Cebir");
        System.out.println("Ders Kitabı İsmi: " + dersKitabi.getIsim());
        System.out.println("Ders Kitabı Konusu: " + dersKitabi.getKonu());
    }
}

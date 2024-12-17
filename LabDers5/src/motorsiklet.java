public class motorsiklet implements arac,suratMotoru{
    @Override
    public void sur(){
        System.out.println("İleri gidiliyor  ");
    }
    @Override
    public void solaSagaDon(){
        System.out.println("Sola veya sağa dönülüyor");
    }
    @Override
    public void cokHizYap(){
        System.out.println("Motor çok hız yapmak için bekliyor");
    }
    public void motorCalistir(){
        System.out.println("Çalıştı");
    }

}

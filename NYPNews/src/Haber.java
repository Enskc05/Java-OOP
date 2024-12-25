
import java.util.Scanner;
public abstract class Haber implements IHaber{
    public String haberBasligi;
    public String haberAltBasligi;
    public String haberIcerigi;
    public String haberBasligi2;
    public String haberAltBasligi2;
    public String haberIcerigi2;

    public Haber(String HaberBasligi,String HaberAltBasligi,String HaberIcerigi){
        this.haberBasligi=HaberBasligi;
        this.haberAltBasligi=HaberAltBasligi;
        this.haberIcerigi=HaberIcerigi;
    }
    public Haber(String HaberBasligi,String HaberAltBasligi,String HaberIcerigi,String HaberBasligi2,String HaberAltBasligi2,String HaberIcerigi2){
        this.haberBasligi=HaberAltBasligi;
        this.haberAltBasligi=HaberAltBasligi;
        this.haberIcerigi=HaberIcerigi;
        this.haberBasligi2=HaberBasligi2;
        this.haberAltBasligi2=HaberAltBasligi2;
        this.haberIcerigi2=HaberIcerigi2;
    }
    public Haber(){}

    public String getHaberBasligi() {
        return haberBasligi;
    }

    public String getHaberAltBasligi() {
        return haberAltBasligi;
    }

    public String getHaberIcerigi() {
        return haberIcerigi;
    }
    public abstract void haberGoster(int haberDeger);
    public abstract void haberGoster();
    @Override
    public int haberPuanlama() {
        Scanner scanner = new Scanner(System.in);
        int puan = 0;

        while (true) {
            System.out.print("1 ile 10 arasinda bir deger girin: ");
            puan = scanner.nextInt();

            if (puan >= 1 && puan <= 10) {
                break;
            } else {
                System.out.println("Belirtilen aralik disinda girdiniz tekrar deneyin");
            }
        }
        return puan;
    }
    @Override
    public void puanGoster(int puan) {
        System.out.println("Girdiginiz deger: " + puan);
    }

}


import java.util.Scanner;

public class HaberSiyaset extends Haber{

    public HaberSiyaset(){}
    public HaberSiyaset(String HaberBasligi , String HaberAltBasligi , String HaberIcerigi){
        super(HaberBasligi,HaberAltBasligi,HaberIcerigi);
    }
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
    @Override
    public void haberGoster(){
        System.out.println(getHaberBasligi());
        System.out.println(getHaberAltBasligi());
        System.out.println(getHaberIcerigi());
    }
    @Override
    public void haberGoster(int deger){
        System.out.println("------------------------");
        System.out.println(deger + ".");
        System.out.println(getHaberBasligi());
        System.out.println(getHaberAltBasligi());
    }
}


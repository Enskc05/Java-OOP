
import java.util.Scanner;


public class HaberSpor extends Haber {

    public HaberSpor(String HaberBasligi, String HaberAltBasligi, String HaberIcerigi) {
        super(HaberBasligi, HaberAltBasligi, HaberIcerigi);
    }
    public HaberSpor(){}

    public String kategori(){

        return "Spor haberleri";
    }

    class Futbol implements IHaberSpor,IHaber{
        @Override
        public String altKategori(){
            return "Futbol";
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
            scanner.close();
            return puan;
        }
        @Override
        public void puanGoster(int puan) {
            System.out.println("Girdiginiz deger: " + puan);
        }

    }
    class  Basketbol implements IHaberSpor,IHaber{
        @Override
        public String altKategori(){
            return "Basketbol";
        }

        @Override
        public int haberPuanlama() {
            return puanHesaplama();
        }

        @Override
        public void puanGoster(int puan) {

            System.out.println("Girdiginiz deger: " + puan);
        }
    }
    class Voleybol implements IHaberSpor,IHaber{
        @Override
        public String altKategori(){
            return "Voleybol";
        }
        @Override
        public int haberPuanlama() {
            return puanHesaplama();
        }
        @Override
        public void puanGoster(int puan) {
            System.out.println("Girdiginiz deger: " + puan);
        }
    }
    public int puanHesaplama(){
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
        scanner.close();
        return puan;
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

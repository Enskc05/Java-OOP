public class HaberMagazin extends Haber {
    public HaberMagazin(){
    }
    public HaberMagazin(String HaberBasligi , String HaberAltBasligi , String HaberIcerigi){
        super(HaberBasligi,HaberAltBasligi,HaberIcerigi);
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

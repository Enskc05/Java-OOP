public class MakinaMüh extends Ogrenci {


    public MakinaMüh(int ogrenciNo, String ogrenciAd, String ogrenciSoyad, String girisTarih, String fakulte, String bolum) {
        super(ogrenciNo, ogrenciAd, ogrenciSoyad, girisTarih, fakulte, bolum);
    }


    @Override
    public void dersCalis() {
        System.out.println(getOgrenciAd() + " Makina Mühendisliği derslerini çalışıyor.");
    }


    @Override
    public void bilgiGoster() {
        System.out.println("Öğrenci No: " + getOgrenciNo());
        System.out.println("Ad: " + getOgrenciAd());
        System.out.println("Soyad: " + getOgrenciSoyad());
        System.out.println("Fakülte: " + getFakulte());
        System.out.println("Bölüm: " + getBolum());
    }
}

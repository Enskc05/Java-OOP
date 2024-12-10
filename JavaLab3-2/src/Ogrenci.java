public abstract class Ogrenci {
    private int ogrenciNo;
    private String ogrenciAd;
    private String ogrenciSoyad;
    private String girisTarih;
    private String fakulte;
    private String bolum;


    public Ogrenci(int ogrenciNo, String ogrenciAd, String ogrenciSoyad, String girisTarih, String fakulte, String bolum) {
        this.ogrenciNo = ogrenciNo;
        this.ogrenciAd = ogrenciAd;
        this.ogrenciSoyad = ogrenciSoyad;
        this.girisTarih = girisTarih;
        this.fakulte = fakulte;
        this.bolum = bolum;
    }


    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getOgrenciAd() {
        return ogrenciAd;
    }

    public void setOgrenciAd(String ogrenciAd) {
        this.ogrenciAd = ogrenciAd;
    }

    public String getOgrenciSoyad() {
        return ogrenciSoyad;
    }

    public void setOgrenciSoyad(String ogrenciSoyad) {
        this.ogrenciSoyad = ogrenciSoyad;
    }

    public String getGirisTarih() {
        return girisTarih;
    }

    public void setGirisTarih(String girisTarih) {
        this.girisTarih = girisTarih;
    }

    public String getFakulte() {
        return fakulte;
    }

    public void setFakulte(String fakulte) {
        this.fakulte = fakulte;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }


    public abstract void dersCalis();


    public void bilgiGoster() {
        System.out.println("No: " + ogrenciNo);
        System.out.println("Ad: " + ogrenciAd);
        System.out.println("Soyad: " + ogrenciSoyad);
        System.out.println("Fakülte: " + fakulte);
        System.out.println("Bölüm: " + bolum);
    }
}

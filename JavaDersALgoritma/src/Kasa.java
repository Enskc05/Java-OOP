

class Kasa {
    int toplamSatisMiktari = 0, tatliSayisi = 0, salataSayisi = 0;
    double gunlukKar = 0, salatalardanEldeEdilenKar = 0;

    public Kasa() {
        System.out.println("Hoş geldin!");
    }

    public Kasa(String isim) {
        System.out.println("Hoş geldin, " + isim + "!");
    }

    public void hesapla(int secim, double fiyat) {
        topSatHesapla(fiyat);
        gunlukKrHesapla(secim, fiyat);
    }

    private void topSatHesapla(double fiyat) {
        toplamSatisMiktari += fiyat;
    }

    private void gunlukKrHesapla(int secim, double fiyat) {
        switch (secim) {
            case 1: // Salata
                salatalardanEldeEdilenKar += fiyat * 0.3;
                salataSayisi++;
                break;
            case 4: // Tatlı
                tatliSayisi++;
                gunlukKar += fiyat * 0.2;
                break;
            case 2: // Hamburger
                gunlukKar += fiyat * 0.25;
                break;
            case 3: // Pizza
                gunlukKar += fiyat * 0.35;
                break;
        }
    }

    public void fisYazdir() {
        double ortalamaSalataKari = (salataSayisi > 0) ? salatalardanEldeEdilenKar / salataSayisi : 0;
        System.out.println("----- Gün Sonu Fişi -----");
        System.out.println("Toplam Satış Miktarı: " + toplamSatisMiktari);
        System.out.println("Günlük Kâr Miktarı: " + gunlukKar);
        System.out.println("Ortalama Salata Kârı: " + ortalamaSalataKari);
        System.out.println("Tatlı Sayısı: " + tatliSayisi);
    }
}
import java.util.Scanner;

class Kasiyer {
    Kasa kasa;

    public Kasiyer() {
        this.kasa = new Kasa();
    }

    public Kasiyer(String isim) {
        this.kasa = new Kasa(isim);
    }

    public void isVakti() {
        Scanner scanner = new Scanner(System.in);
        int secim;
        double fiyat;

        do {
            System.out.println("Lütfen yiyecek kodunu girin (1: Salata, 2: Hamburger, 3: Pizza, 4: Tatlı, 5: Çıkış): ");
            secim = scanner.nextInt();

            if (secim == 5) break;

            System.out.println("Fiyatı girin: ");
            fiyat = scanner.nextDouble();

            kasa.hesapla(secim, fiyat);

        } while (secim != 5);

        kasa.fisYazdir();
    }
}
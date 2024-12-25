

import java.util.Scanner;
public class Core {
    HaberSpor[] sporNesneleri ={
            new HaberSpor("Derbi Heyecanı: Galatasaray Fenerbahçe'yi Mağlup Etti","Uzatmalarda Gelen Gol Maça Damga Vurdu","Lig'in merakla beklenen derbisinde Galatasaray, Fenerbahçe'yi 2-1 mağlup etti. Maçın galibiyet golü uzatma dakikalarında genç yıldız Kerem Aktürkoğlu'ndan geldi. Taraftarlar, bu zaferi büyük coşkuyla kutladı."),
            new HaberSpor("NBA Finali Heyecanı: İki Süper Yıldızın Mücadelesi","LeBron James ve Giannis Antetokounmpo, Şampiyonluk İçin Kapışıyor","NBA finalleri, LeBron James ve Giannis Antetokounmpo'nun liderliğindeki takımlar arasında geçiyor. İki süper yıldızın da takımları, şampiyonluk için sonuna kadar mücadele ediyor. Taraftarlar, bu yılki finalde basketbolun en büyük isimlerinden iki tanesinin performansını merakla izliyor."),
            new HaberSpor("Kadınlar Voleybol Şampiyonası: Türkiye Finalde","Türk Kadın Voleybol Takımı, Dünya Şampiyonası Finaline Çıktı","Türkiye Kadın Voleybol Takımı, dünya şampiyonası finaline yükseldi. Turnuvada gösterdikleri üstün performansla büyük bir başarıya imza atan milliler, finalde güçlü rakipleriyle karşılaşacak. Spor severler, tarihi başarıyı kutlamak için final maçı öncesi heyecanla bekliyor.")
};
    HaberMagazin[] magazinNesneleri  = {
            new HaberMagazin("Ünlü Oyuncu Gizemli Tatilde Görüntülendi","Tatil Rotası ve Yanındaki Kişi Merak Uyandırdı","Sevilen oyuncu Ayşe Kaya, gizemli bir sahil kasabasında görüntülendi. Yanındaki kişinin kimliği bilinmezken, çiftin keyifli halleri dikkat çekti."),
            new HaberMagazin("Ünlü Şarkıcı Ariana Grande, Yeni Albümünü Tanıttı","Ariana Grande, Hayranlarına Yeni Bir Müzikal Deneyim Sunuyor","Ariana Grande, uzun süredir beklenen yeni albümünü geçtiğimiz hafta yayımladı. Albüm, şarkıcının müziğinde farklı bir tarzı benimsediği ve daha derin duygulara yer verdiği bir çalışma olarak öne çıkıyor. Hayranlar, sosyal medyada albümle ilgili olumlu yorumlar yaparken, konser tarihleri de merakla bekleniyor."),
            new HaberMagazin("Ünlü Oyuncu Brad Pitt, Yeni Film Projesini Açıkladı","Brad Pitt, Yine Bir Aksiyon Filmiyle Sinemaseverlerin Karşısında ","Brad Pitt, Hollywood’un en çok aranan isimlerinden biri olarak yeni bir aksiyon filmi projesine imza atacağını duyurdu. Filmin yönetmeni ise daha önce büyük başarı yakalamış bir isim. Pitt, filmde yine aksiyon dolu sahneleriyle hayranlarını ekran başına kilitlemeyi hedefliyor.")
    };

    HaberBilim[] bilimNesneleri = {
            new HaberBilim("NASA, Yeni Bir Asteroid Keşfi Yaptı","Yaşamın İzlerini Taşıyabilecek Potansiyel Bulundu","NASA, Dünya’ya yakın bir asteroitte organik moleküllere rastladı. Araştırmacılar, bu keşfin uzayda yaşamın izlerini arama konusunda umut verici olduğunu söylüyor."),
            new HaberBilim("Yenilikçi Yapay Zeka Modeli, Tıp Alanında Devrim Yaratabilir","Yapay Zeka, Erken Teşhislerde İnsan Doktorlarını Geride Bırakıyor","Yeni geliştirilen yapay zeka modeli, hastalıkları erken aşamada tespit etme konusunda insan doktorlarına kıyasla daha yüksek doğruluk oranları gösteriyor. Özellikle kanser ve nörolojik hastalıkların teşhisinde büyük bir potansiyel taşıyor. Uzmanlar, bu modelin zaman içinde tıbbi tanılarda devrim yaratabileceğini belirtiyor."),
            new HaberBilim("Mars’a Yolculukta Yeni Bir Dönem Başladı: İlk İnsanlı Görev 2025’te","NASA, Mars'a İlk İnsanlı Görevi İçin Tarih Verdi","NASA, 2025 yılında Mars’a yapılacak ilk insanlı görevin tarihini açıkladı. Bu görev, astronotların Mars yüzeyine ilk adımlarını atacak ve gezegenin atmosferi ile yer yapısını daha ayrıntılı inceleyecek. Bu misyon, uzay keşifleri için bir dönüm noktası olacak.")
    };
    HaberSaglik[] saglikNesneleri ={
            new HaberSaglik("Yapay Zeka, Kanser Teşhisinde Çığır Açan Bir Yöntem Sunuyor","Yapay Zeka Destekli Sistemler, Kanser Tespitini Erken Aşamada Yapabiliyor","Yeni geliştirilen yapay zeka algoritmaları, kanserin erken aşamalarında daha doğru sonuçlar vererek, geleneksel yöntemlere göre çok daha hızlı ve doğru teşhis koyabiliyor. Uzmanlar, bu teknoloji sayesinde kanser tedavisinde önemli bir ilerleme kaydedileceğini belirtiyor."),
            new HaberSaglik("Günde 10 Dakikalık Egzersiz Ömrü Uzatıyor","Basit Hareketlerle Sağlıklı Bir Hayat Mümkün","Uzmanlar, günlük 10 dakikalık yürüyüşün kalp sağlığına büyük fayda sağladığını açıkladı. Hareketsiz bir yaşam tarzını benimseyenler için bu küçük adım büyük bir fark yaratabilir."),
            new HaberSaglik("Dijital Sağlık Uygulamaları, Mental Sağlığı Desteklemek İçin Güçlü Bir Araç Oluyor","Telefonlar, Mental Sağlık Uygulamalarıyla Daha Etkili Destek Sunuyor","Akıllı telefonlar ve dijital sağlık uygulamaları, depresyon, anksiyete ve stres gibi ruhsal sağlık sorunlarıyla mücadele eden bireylere önemli faydalar sağlıyor. Uzmanlar, bu tür uygulamaların tedaviye yardımcı olduğunu ve kullanıcıların zihinsel sağlıklarını iyileştirmelerine destek olduğunu vurguluyor.")
    };

    HaberSiyaset[] siyasetNesneleri = {
            new HaberSiyaset("Yeni Ekonomik Paket Mecliste Kabul Edildi","Vergi Reformları ve Destek Paketleri Geliyor","Mecliste yapılan oylamada, ekonomik kalkınmayı hızlandırmayı hedefleyen yeni paket onaylandı. Pakette özellikle küçük işletmelere yönelik destekler öne çıkıyor."),
            new HaberSiyaset("ABD Başkanı, İklim Değişikliğiyle Mücadele İçin Yeni Yatırım Paketi Açıkladı","İklim Krizine Karşı Global Çabalar Güçleniyor","ABD Başkanı, iklim değişikliğiyle mücadele için yeni bir yatırım paketi sundu. Paket, yenilenebilir enerji projelerine yapılan yatırımları artırmayı ve karbon salınımını azaltmayı hedefliyor. Başkan, bu adımın sadece ülke içinde değil, küresel anlamda da iklim krizine karşı büyük bir hamle olacağını belirtti."),
            new HaberSiyaset("Türkiye Cumhurbaşkanı, Yeni Ekonomik Reform Paketi Duyurdu","Ekonomik Büyümeyi Desteklemek İçin Yapılacak Değişiklikler Açıklandı ","Türkiye Cumhurbaşkanı, ülkenin ekonomik yapısını güçlendirecek yeni bir reform paketini açıkladı. Paket, özellikle istihdam yaratma, yatırımcı dostu bir ortam oluşturma ve dış ticareti artırma odaklı olacak. Reformların, ülkenin ekonomik istikrarını sağlamada önemli bir adım olacağı ifade ediliyor.")
    };

    private Scanner tarayici;
    private String oncekiMenu;

    public Core() {
        this.tarayici = new Scanner(System.in);
        this.oncekiMenu = "";
    }

    public boolean GirisYap(String kullaniciAdi, String sifre) {
        while (true){
            try{
                if (bosmu(kullaniciAdi) || bosmu(sifre)) {
                    throw new IllegalArgumentException("Kullanıcı adı ve şifre boş olamaz!");
                }

                if (kullaniciAdi.equals("admin") && sifre.equals("1234")) {
                    System.out.println("Giriş başarılı! Hoş geldiniz, " + kullaniciAdi + ".");
                    return true;
                } else {
                    System.out.println("Hatalı kullanıcı adı veya şifre! Lütfen tekrar deneyin.");
                    System.out.print("Kullanıcı adı: ");
                    kullaniciAdi = tarayici.nextLine();
                    System.out.print("Şifre: ");
                    sifre = tarayici.nextLine();
                }
            }
            catch (IllegalArgumentException e) {
                System.err.println("Hata: " + e.getMessage());
                return false;
            }
        }
    }

    public void MainMenu() {
        oncekiMenu = "MainMenu";
        while (true) {
            System.out.println("\n--- Ana Menü ---");
            System.out.println("1. Haberleri Görüntüle");
            System.out.println("2. Kategorileri Listele");
            System.out.println("3. Çıkış Yap");
            System.out.print("Seçiminizi yapın: ");

            int secim = tarayici.nextInt();
            try{
                switch (secim) {
                    case 1 -> HaberlerMenu();
                    case 2 -> KategoriListeleMenu();
                    case 3 -> {
                        cikisYap();
                        return;
                    }
                    default -> System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
                }
            }
            catch(IllegalArgumentException e){

                System.err.println("Hata: " + e.getMessage());
                return;
            }


        }
    }

    public void HaberlerMenu() {
        oncekiMenu = "anaMenu";
        while (true) {
            System.out.println("\n--- Haberler ---");
            System.out.println("1. Uzayda Yeni Keşifler");
            System.out.println("2. Yapay Zekadaki Gelişmeler");
            System.out.println("3. Bir Önceki Menüye Dön");
            System.out.println("4. Ana Menüye Dön");
            System.out.print("Seçiminizi yapın: ");

            int secim = tarayici.nextInt();

            switch (secim) {
                case 1 -> HaberGoruntule("Uzayda Yeni Keşifler");
                case 2 -> HaberGoruntule("Yapay Zekadaki Gelişmeler");
                case 3 -> OncekiMenuyeDon();
                case 4 -> MainMenu();
                default -> System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }
    }

    public void KategoriListeleMenu() {
        oncekiMenu = "anaMenu";
        Kategoriler kategori = new Kategoriler();

        while (true) {
            kategori.kategoriSema();

            int secim = tarayici.nextInt();

            switch (secim) {
                case 1 -> KategoriGoruntule("Spor");
                case 2 -> KategoriGoruntule("Magazin");
                case 3 -> KategoriGoruntule("Bilim");
                case 4 -> KategoriGoruntule("Saglik");
                case 5 -> KategoriGoruntule("Siyaset");
                case 6 -> OncekiMenuyeDon();
                case 7 -> MainMenu();
                default -> System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }
    }

    public void HaberGoruntule(String haberBasligi) {
        System.out.println("\n--- Haber Detayı ---");
        System.out.println("Haber Başlığı: " + haberBasligi);
        System.out.println("Bu haberin detayları burada yer alacak.");

        System.out.println("\n1. Bir Önceki Menüye Dön");
        System.out.println("2. Ana Menüye Dön");
        System.out.print("Seçiminizi yapın: ");
        int secim = tarayici.nextInt();

        switch (secim) {
            case 1 -> HaberlerMenu();
            case 2 -> MainMenu();
            default -> {
                System.out.println("Geçersiz seçim! Ana menüye yönlendiriliyorsunuz.");
                MainMenu();
            }
        }
    }

    public void cikisYap() {
        System.out.println("\nProgramdan çıkış yapılıyor. İyi günler!");
        System.exit(0);
    }

    public void OncekiMenuyeDon() {
        switch (oncekiMenu) {
            case "anaMenu" -> MainMenu();
            case "haberlerMenu" -> HaberlerMenu();
            case "kategoriListeleMenu" -> KategoriListeleMenu();
            default -> {
                System.out.println("Önceki menü bulunamadı. Ana menüye dönülüyor...");
                MainMenu();
            }
        }
    }

    private boolean bosmu(String metin) {

        return metin == null || metin.trim().isEmpty();
    }

    private void KategoriGoruntule(String kategori) {
        System.out.println("\n--- " + kategori + " Haberleri ---");
        System.out.println(kategori + " kategorisine ait haberler listeleniyor...");
        if (kategori == "Spor") {
            haberGosterVePuanla(sporNesneleri,tarayici);
        } else if (kategori == "Magazin") {
            haberGosterVePuanla(magazinNesneleri,tarayici);

        }else if (kategori.equals("Bilim")) {
            haberGosterVePuanla(bilimNesneleri,tarayici);
        }
        else if (kategori == "Saglik") {
            haberGosterVePuanla(saglikNesneleri,tarayici);
        } else if (kategori == "Siyaset") {
            haberGosterVePuanla(siyasetNesneleri,tarayici);
        }
        else {
            System.out.println("Yanlış kategori");
        }

        System.out.println("1. Bir Önceki Menüye Dön");
        System.out.println("2. Ana Menüye Dön");
        System.out.print("Seçiminizi yapın: ");
        int secim = tarayici.nextInt();

        switch (secim) {
            case 1 -> KategoriListeleMenu();
            case 2 -> MainMenu();
            default -> {
                System.out.println("Geçersiz seçim! Ana menüye yönlendiriliyorsunuz.");
                MainMenu();
            }
        }
    }
    public static void haberGosterVePuanla(Haber[] haberler, Scanner tarayici) {
        for (int i = 0; i < haberler.length; i++) {
            haberler[i].haberGoster(i + 1); // Haberleri listele
        }
        System.out.println("--------------------");
        System.out.println("Görmek istediğiniz haberin numarasını girin:");

        int deger = tarayici.nextInt();

        if (deger >= 1 && deger <= haberler.length) {
            haberler[deger - 1].haberGoster();  // Seçilen haberi göster
            haberler[deger - 1].haberPuanlama(); // Puanlama yap
        } else {
            System.out.println("Geçersiz seçim!");

        }
    }

}



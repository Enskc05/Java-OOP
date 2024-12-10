public class Test{
    public static void main(String[] args) {
        GPSAlicisi gpsAlicisi = null;


        do {
            gpsAlicisi = new GPSAlicisi();
            if (!gpsAlicisi.aktif) {
                System.out.println("GPS alıcısı uygun sıcaklıkta değil, tekrar deneniyor...");
            }
        } while (!gpsAlicisi.aktif);
        Uydu uydu1 = new Uydu();
        Uydu uydu2 = new Uydu(gpsAlicisi);
        GPSProgrami gpsProgrami = new GPSProgrami(gpsAlicisi);
    }
}
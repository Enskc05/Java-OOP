public class Uydu extends GPSAlicisi{
    public Uydu(){
        System.out.println("GPS alıcısı tanımlanmadı");
    }
    public Uydu(GPSAlicisi gA){
        System.out.println("Bağlandı");
        gA.uydudanVeriAl(veriTuruSec());
    }

    private int veriTuruSec (){
        return (int)Math.random()*2+1;
    }

}

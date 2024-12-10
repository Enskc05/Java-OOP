
public class GPSAlicisi {
    private int sicaklik;
    public boolean aktif;
    private String GpsCumle;

    public GPSAlicisi(){
        sicaklik = sicaklikOlc();
        if(5<=sicaklik && sicaklik<=40){
            aktif = true;
        }else {
            aktif = false;
        }
    }

    private int sicaklikOlc(){
        return (int)(Math.random()*39)+1;
    }
    public String programaVeriGonder (){
        return GpsCumle;
    }
    public void uydudanVeriAl (int cumleCesidi){
        switch (cumleCesidi){
            case 1:
                GpsCumle = "$GPGGA,N, 40, 30, E";
                break;
            case 2:
                GpsCumle = "$GPRMC, 41, N, E, 31";
                break;
            case 3:
                GpsCumle = "$GPGLL, N, E, 42, 32";
                break;
            default:
                System.out.println("Yanlış değer");
        }
    }
}

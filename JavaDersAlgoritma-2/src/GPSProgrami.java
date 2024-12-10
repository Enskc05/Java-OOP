public class GPSProgrami extends GPSAlicisi{
    private String konumVerisi;
    private String enlemVerisi;
    private String boylamVerisi;

    public GPSProgrami(GPSAlicisi gA){
        konumBilgisi(gA.programaVeriGonder());
    }
    private void konumBilgisi(String konumVerisi){
        System.out.println("Konum verisi" + konumVerisi);
    }
}

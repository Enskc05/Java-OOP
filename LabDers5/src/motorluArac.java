public abstract class  motorluArac{
    public int beygirGucu;
    benzin b;
    motor mm;

    public void motorCalistir(int a){
        if (b.tip == "Motorin"){
            System.out.println("Motorinli araç çalışmak için " + a + "saniye bekliyor.");
        }
        else{
            System.out.println("Araç çalışıyor");
        }
    }

    public boolean arizaKontrol(){
        System.out.println("Arıza yok");
        return true;
    }
}



public class Main{
    public static void main(String[] args){
        ikiTekerlekli ikiTekerlekli = new ikiTekerlekli();
        bisiklet bisiklet = new bisiklet();
        motor motor = new motor();
        motorsiklet motorsiklet = new motorsiklet();


        if(motor.motorHacmi > 1000){
            System.out.println("Güçlü motor");
            motor.ds.calistir();
        }
        else{
            System.out.println("Zayıf motor");

        }


        ikiTekerlekli.sur();
        ikiTekerlekli.solaSagaDon();
        ikiTekerlekli.dengeSagla();
        System.out.println("*****************************");

        bisiklet.sur();
        bisiklet.solaSagaDon();
        System.out.println("*****************************");

        motorsiklet.motorCalistir();
        motorsiklet.cokHizYap();
        motorsiklet.solaSagaDon();
        System.out.println("*****************************");
    }
}
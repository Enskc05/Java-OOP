public class motor extends motorluArac{
    public class disliSeti{
        public void calistir(){
            System.out.println("Çalıştı");
        }
    }

    public int motorHacmi = 1400;
    disliSeti ds;


    public motor(){
        ds = new disliSeti();
    }

    public void calistirDisliSet(){
        ds.calistir();
    }
}

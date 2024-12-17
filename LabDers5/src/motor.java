
public class motor extends motorluArac {
    public class disliSeti {
        public void calistir() {
            System.out.println("Çalıştı");
        }
    }

    public int motorHacmi = 1400;
    disliSeti ds;

    public motor() {
        super(); 
        ds = new disliSeti();
        System.out.println("motor sınıfı constructor çalıştı");
    }

    public void calistirDisliSet() {
        ds.calistir();
    }

    public void bilgiGoster() {

        System.out.println("Motor hacmi: " + motorHacmi);
    }

    public static void main(String[] args) {
        motor m = new motor();
        m.calistirDisliSet();
        m.bilgiGoster();
    }
}

public class Personel extends Human {
    private String job;
    private int pay;
    private double time;
    private int school_in = 15;
    private int school_out = 13;
    private int brut = 18;

    public Personel(String name, String surname, String male, int age, String job, double time, int pay) {
        super(name, surname, male, age);
        this.job = job;
        this.time = time;
        this.pay = pay - (pay * this.brut / 100);
    }


    public void checkJobAndTime() {
        if (this.job.equals("Teacher")) {
            System.out.println("Job is Teacher.");
            if (this.time >= school_in && this.time <= school_out) {
                System.out.println("Working within school hours.");
            } else {
                System.out.println("Outside of school hours.");
            }
        } else if (this.job.equals("Engineer")) {
            System.out.println("Job is Engineer.");
            if (this.time > 40) {
                System.out.println("Overtime hours for Engineer.");
            } else {
                System.out.println("Regular hours for Engineer.");
            }
        } else {
            System.out.println("Job is " + this.job + ". No special time rules apply.");
        }
    }

    public void displayPay() {
        System.out.println("Net Pay: " + this.pay + "\n");
    }
}

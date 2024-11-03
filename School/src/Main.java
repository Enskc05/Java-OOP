
public class Main{
    public static void main(String[] args){
        Personel personel1 = new Personel("Enes","Koç","Erkek",19,"Student",18,100);
        Personel personel2 = new Personel("Ömer","Demir","Erkek",21,"Student",20,100);

        Student student1 = new Student("Oğuz","Oğuz","Erkek",22);
        Student student2 = new Student("Alperen","Kundak","Erkek",19);

        personel1.checkJobAndTime();
        personel1.displayPay();

        personel2.checkJobAndTime();
        personel2.displayPay();

        student1.setDepartment("Enerji");
        student2.setDepartment("İngilizce");

        student1.display();
        student2.display();

    }
}



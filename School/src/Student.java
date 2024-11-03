

public class Student extends Human{
    private String department;

    public Student(String name, String surname, String male , int age){
        super(name,surname,male,age);
    }
    //Setter method
    public void setDepartment(String department){
        this.department = department;
    }

    //Getter method
    public String getDepartment(){
        return department;
    }
    public void display(){
        System.out.println("İsmi = " + name);
        System.out.println("Soyismi = " + surname);
        System.out.println("Bölümü = " + department);
        System.out.println("Yaşı = " + age + "\n");

    }
}

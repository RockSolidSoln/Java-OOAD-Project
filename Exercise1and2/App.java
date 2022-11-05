package Exercise1;

public class App{
    public static void main(String[] args){
        Person p = new Person();
        p.setName("Abul");

        Student s = new Student();
        Student s1 = new Student("Abu bhai", 2.3);

        s1.modifyCgpa(2.9);
        System.out.println(s1.getCgpa());
        //s1.getCgpa()
    }
}
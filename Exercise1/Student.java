package Exercise1;

public class Student extends Person {
    private double cgpa;
    
    //default constructor
    Student(){}

    //overloaded constructor
    Student(String name, double cgpa) {
        super(name);
        this.cgpa = cgpa;
    }

    //setters
    public void modifyCgpa(double cgpa){
        this.cgpa = cgpa;
    }

    //getters
    public double getCgpa(){
        return cgpa;
    }
}
// package Exercise1and2;

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
        System.out.println("The cgpa have been updated to- "+ cgpa + "for the student named " + this.getName());
    }

    //getters
    public double getCgpa(){
        return cgpa;
    }
}
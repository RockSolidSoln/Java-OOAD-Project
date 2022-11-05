// package Exercise1;

public class Person {
    private String name;

    //default constructor
    Person (){}

    //overloaded constructor
    Person(String name){
        this.name = name;
    }

    //setters
    public void setName(String name){
        this.name = name;
        System.out.println("The name have been updated to " + name);
    }

    //getters
    public String getName(){
        return name;
    }
}

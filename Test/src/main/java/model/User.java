package model;

public class User {
    private String username;
    private String password;
    private String name;
    private String email;
    private String phone;

    User(String username, String password, String name, String email, String phone){
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPhone(){
        return phone;
    }

}

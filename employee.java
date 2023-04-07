package Employee;

public class Employee{

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private enum Gender{Male, Female}
    private String username;
    private String password;

    public Employee(){}

    public Employee(int id, String firstName, String lastName, int age, Gender gender, String username, String password){
        this.id = id;
        this.firstName = firstNamer;
        this.lastName = lastName
        this.age = age;
        this.gender = gender;
        this.username = username;
        this.password = password;
    }

    public void setId(){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public void setFirstName(){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(){
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setAge(){
        this.age = age;
    }

    public String getAge(){
        return  this.age;
    }

    public void setGender(){
        this.gender = gender;
    }

    public String getGender(){
        return this.gender = gender;
    }

    public void setUsername(){
        this.username = username;
    }

    public String getUsername(){
        return this.username = username;
    }

    public void setPassword(){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }
}
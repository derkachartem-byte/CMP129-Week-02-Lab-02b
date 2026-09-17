public class Person {
    private String name = "";  
    private String email = ""; 
    private String info = ""; 
    private int age = 0; 
    public Person(){ 
        name = ""; 
        age = 0; 
        email = ""; 
    } 
    public Person(String name, int age, String email){ 
        this.name = name; 
        this.age = age;
        this.email = email; 
    }
    public String displayInfo(){ 
        info = "Person Information\n" +  
               "------------------\n" + 
               "Name:   " + name + "\n" + 
               "Age:    " + Integer.toString(age) + "\n" + 
               "Email:  " + email; 
        return info;  
    } 
}

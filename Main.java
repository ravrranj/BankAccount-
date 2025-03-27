

class Person {
    private String name; //Private variable 

    //Getter method to retrive value
    public String getName(){
        return name;
    }

    //Setter Method to set value
    public void setName(String newName) {
        if(newName.length() > 2) {  //Simple validation
           this.name = newName;
        } else {
            System.out.println("Name too short!");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Chunchun"); //Setting value
        System.out.println(p.getName()); // Getting value 
    }
}
// New Task Write a Java program to create a class called "Person" with a name and age attribute. 
// Create two instances of the "Person" class, set their attributes using the constructor, 
// and print their name and age. created

public class person {
    String name;
    int age;
    

    public person(String empname,int empage){
        name=empname;
        age=empage;


    }
    public static void main(String[] args) {
        person obj=new person("hari",2);
        System.out.println(obj.name+""+obj.age);
    }
}
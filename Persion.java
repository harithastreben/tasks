// New Task Write a Java program to create a class called Person with private instance variables name, age.
//  and country.
//  Provide public getter and setter methods to access and modify these variables. created


public class Persion {
    private String name;
    private int age;
    private String country;
    public String getName(){
        return name;

    }
    public void setName(String newname){
        this.name=newname;
    }
    public int getAge(){
        return age;

    }
    public void setAge(int newage){
        this.age=newage;
    }

    public String getCountry(){
        return country;

    }
    public void setCountry(String newCountry){
        this.country=newCountry;
    }


    public static void main(String[] args) {
        Persion obj=new Persion();
        obj.setName("jnok");
        System.out.println(obj.getName());
        obj.setAge(6);
        System.out.println(obj.getAge());
        obj.setCountry("jnkkkk");
        System.out.println(obj.getCountry());
  
    }

}

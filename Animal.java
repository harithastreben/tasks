// New Task Write a Java program to create a class called Animal with a method called makeSound(). 
// Create a subclass called Cat that overrides the makeSound() method to bark. created

public class Animal {
    public void makeSound(){
        System.out.println("animal sound");

    }




} 

class Cat extends Animal{
    public void makeSound(){
        System.out.println("meow");
    }


}

class Main{
    public static void main(String[] args) {
        Cat obj=new Cat();
        obj.makeSound();
     }
}



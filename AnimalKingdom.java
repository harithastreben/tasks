// Write a Java program to create a class called Animal with a method named move(). 
// Create a subclass called Cheetah that overrides the move() method to run.
public class AnimalKingdom {
    public void move(){
        System.out.println("running");
    }
    
}

class Cheetah extends AnimalKingdom{
    public void move(){
        System.out.println("cheetah running");
    }
}

class test {
    public static void main(String[] args) {
        
        Cheetah c1=new Cheetah();
        c1.move();
    }
}

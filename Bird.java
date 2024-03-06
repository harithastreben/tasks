public class Bird {
    public void sound() {
        System.out.println("making a sound.");
    }
    
}

class Birds extends Animal {
   
    public void sound() {
        System.out.println("bakka bakka");
    }
}

class Cats extends Animal {
    
    public void sound() {
        System.out.println("meow meow....");
    }
}


 class term {
    public static void main(String[] args) {
        Birds bird = new Birds();
        Cats cat = new Cats();

        bird.sound();
        cat.sound();
    }
}

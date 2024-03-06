// New Task Write a Java program to create an interface Resizable with methods resizeWidth(int width) 
// and resizeHeight(int height) that allow an object to be resized.
//  Create a class Rectangle that implements the Resizable interface and implements the resize methods.

/**
 * InnerRectangle
 */
interface Resizable {
    public void resizeWidth(int width);
    public void resizeHeight(int height);
}

class Rectangle implements Resizable{
     private int width;
     private int height;
    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;


    }
    public void resizeWidth(int width){
        this.width=width;
        


    }
    public void resizeHeight(int height){
        this.height=height;

    }
    public void print(){
        System.out.println(width+" "+height);
    }
    
}



class Rectangl{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(8, 4);
        r1.print();
        r1.resizeWidth(6);
        r1.resizeHeight(7);
        r1.print();

    }
    
}

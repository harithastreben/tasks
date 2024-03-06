import java.util.Scanner;

public class farhen {
    public static void main(String[] args) {
        float temp;
        System.out.println("enter temparature in farhenheit");
        Scanner s=new Scanner(System.in);
        temp=s.nextFloat();
        System.out.println(temp);
        float celsious=(temp-32)*5/9;
        System.out.println("temparature in celcious:"+celsious);
    }
    
}

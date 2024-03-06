// Write a Java recursive method to reverse a given string.
// import java.util.Scanner;

import java.util.Scanner;

public class reverse2 {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        String rev=s.nextLine();
        // rev.substring(1, rev.length()0)
        System.out.println(rev);
    
        String nullstr="";
        for(int i=0;i<rev.length();i++){
            nullstr=rev.charAt(i)+nullstr;
        }
        System.out.println(nullstr);
    }
    
}

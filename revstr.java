public class revstr {
    public static void main(String[] args) {
        String sentance="hari";
        String reversed=reverse(sentance);
        System.out.println("reversed :"+reversed);
    }
    public static String reverse(String sentance){
        if(sentance.isEmpty())
            return sentance;
        
     
        return reverse(sentance.substring(1))+sentance.charAt(0);

        
        
        
    }

    
}

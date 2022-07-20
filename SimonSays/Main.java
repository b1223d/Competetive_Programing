import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String phrase = "Simon says ";
        //System.out.println("enter num");
        int n = s.nextInt();
        String str = "";
        str = s.nextLine();
        for(int i = 0; i<n; i++){
            //System.out.println("enter command");
            str = s.nextLine();
            //System.out.println(str.substring(0,phrase.length()));
            
            if(str.length() > 11 && str.substring(0,phrase.length()).equals(phrase)){
                str= str.substring(11);
                System.out.println(str);  
            }
        }
        
    }    
}
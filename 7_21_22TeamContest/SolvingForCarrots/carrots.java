import java.util.Scanner;

public class carrots{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] sep = str.split(" ");
        System.out.println(sep[1]);
        
    }
}
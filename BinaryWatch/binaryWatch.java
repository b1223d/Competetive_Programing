import java.util.Scanner;

public class binaryWatch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //int input = s.nextInt();

        String str = s.next();
        int one = Integer.parseInt(str.substring(0,1));
        int two = Integer.parseInt(str.substring(1,2));
        int three = Integer.parseInt(str.substring(2,3));
        int four = Integer.parseInt(str.substring(3));
        int[] lst = {one, two, three, four};

        for(int i = 8; i>=1; i=i/2){
            if(lst[0]>=i){
                System.out.print("* ");
                lst[0] = lst[0] - i;
            }
            else{
                System.out.print(". ");    
            }
            if(lst[1]>=i){
                System.out.print("*   ");
                lst[1] = lst[1] - i;
            }
            else{
                System.out.print(".   ");    
            }
            if(lst[2]>=i){
                System.out.print("* ");
                lst[2] = lst[2] - i;
            }
            else{
                System.out.print(". ");    
            }
            if(lst[3]>=i){
                System.out.print("*");
                lst[3] = lst[3] - i;
                System.out.println();
            }
            else{
                System.out.print(".");
                System.out.println(); 
            }
        }
    }
}

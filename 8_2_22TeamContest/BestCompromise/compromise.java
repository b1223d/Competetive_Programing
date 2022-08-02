package BestCompromise;
import java.util.*;
public class compromise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tests = Integer.parseInt(scan.nextLine());
        for(int x = 0; x< tests; x++){
            int people = scan.nextInt();
            int question = scan.nextInt();
            int[] totals = new int[question];
            scan.nextLine();
            for(int p =0; p<people;p++){
                String s = scan.nextLine();
                for(int q =0; q<question; q++){
                    if(s.charAt(q)=='0'){
                        totals[q] --;
                    }
                    else totals[q] ++;
                }
            }
            for(int i : totals){
                if(i>=0) System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
            
        }
    }
    
}

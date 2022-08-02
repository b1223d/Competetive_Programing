package pot;
import java.util.*;

class pot{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tot = scan.nextInt();
        scan.nextLine();
        int ans = 0;
        int pow = 0;
        for(int i=0; i<tot; i++){
            String cur = scan.nextLine();
            pow = Integer.parseInt(cur.substring(cur.length()-1,cur.length()));
            int base = Integer.parseInt(cur.substring(0, cur.length()-1));
            ans += Math.pow(base, pow);
        }
        System.out.println(ans);
        
    }
}
package BuildingPyramids;
import java.util.*;
public class pyramids {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int block = scan.nextInt();
        int ans = 0;
        int i = 1;
        int tot =0;
        while(tot<=block && block>0){
            tot += (int)(4*Math.pow(i, 2)-4*i+1);
            i++;
        }
        i -= 2;
        //tot= (int)(4*Math.pow(i, 2)-4*i+1);
        System.out.println(i);
        
    }
}

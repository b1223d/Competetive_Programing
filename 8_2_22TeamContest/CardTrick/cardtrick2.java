import java.util.*;
class cardtrick2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = Integer.parseInt(scan.nextLine());
        for(int i = 0; i<cases; i++){
            int max = Integer.parseInt(scan.nextLine());
            ArrayList<Integer> nums = new ArrayList<Integer>();
            ArrayList<Integer> sequence = new ArrayList<Integer>();
            for(int j = 1; j<=max;j++){
                nums.add(j);
            }
            while(max>0){
                sequence.add(nums.get(max-1));
                for(int j = max; j>0; j--){
                    sequence.add(sequence.get(0));
                    sequence.remove(0);
                }
                max--;
            }
            Collections.reverse(sequence);
            for(int prnt:sequence){
                System.out.print(prnt + " ");   
            }
            System.out.println();

        }
    }
}
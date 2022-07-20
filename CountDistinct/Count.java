import java.util.*;
public class Count {
    public int countDistinct(int[] nums, int k, int p){
        HashSet hash = new HashSet();
            for(int i=0;i<nums.length;i++){
                int max=0;
                String str = "";
                for(int j=i;j<nums.length;j++){
            
                if(nums[j]%p==0){
                    max++;
                }
                if(max>k){
                    break;
                }
                str+= (nums[j] + ".");
                hash.add(str.toString());
            }
        }
    return hash.size();

    }
    
}

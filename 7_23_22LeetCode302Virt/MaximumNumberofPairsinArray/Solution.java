package MaximumNumberofPairsinArray;

import java.util.*;

class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] ans = new int[2];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i:nums){
            list.add(i);
        }
        for(int x = 0; x<list.size();x++){
            int i = list.get(x);
            if(list.indexOf(i) != list.lastIndexOf(i)){
                list.remove(list.indexOf(i));
                list.remove(list.lastIndexOf(i));
                ans[0]++;
                x--;
            }
        }
        ans[1] = list.size();

        return ans;
    }
}

package NumberofExcellentPairs;

import java.util.*;

class Solution {
    public long countExcellentPairs(int[] nums, int k) {
        HashSet<Integer> numSet = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: nums){
            if(!numSet.add(num)){
                continue;
            }
            int bits = 0;
            while(num!=0){
                if((num&1)==1) bits++;
                num = num>>1;
            }
            list.add(bits);
        }
        long ans = Long.valueOf(0);
        list.sort(null);
        int front=0;
        int end=list.size()-1;
        while(front<=end){
            while(front<=end && list.get(front)+list.get(end)<k){
                front++;
            }
            if(list.get(end)*2>=k){
                ans++;
            }
            if(front>=end){
                break;
            }
            ans += (long)(end-front)*2;
            end--;
        }
        return ans;
    }
}

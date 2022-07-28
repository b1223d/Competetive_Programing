package MaxSumofaPairWithEqualSumofDigits;

import java.util.HashMap;

public class Solution {
    public int maximumSum(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
        int ans = -1;

        for (int i : nums) {
            int tot = 0;
            int key;
            int curdigits=i;
            while(curdigits>0){
                tot += curdigits%10;
                curdigits = curdigits/10;
            }
            key = tot;

            if (!map.containsKey(key))
                map.put(key, i);
            else {
                ans = Math.max(ans, map.get(key) + i);
                map.put(key, Math.max(map.get(key), i));
            }
        }

        return ans;
    }
}

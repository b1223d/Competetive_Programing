package QueryKthSmallestTrimmedNumber;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int[] ans = new int[queries.length];
        int iter =0;
        for(int[] i: queries){

            int trim = i[1];
            int k = i[0];
            ArrayList<Integer> trimmed = new ArrayList<Integer>();
            for(String s : nums){
                //System.out.println(s.substring(s.length()-trim,s.length()-1));
                
                trimmed.add(Integer.parseInt(s.substring(s.length()-trim,s.length())));
            }
            ArrayList<Integer> sort = new ArrayList<>(trimmed);
            Collections.sort(sort);
            
            ans[iter] = trimmed.indexOf(sort.get(k-1));
            iter++;
        }
        return ans;
    }
}
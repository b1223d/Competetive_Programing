package LongestCycleinaGraph;

import java.util.*;

public class Solution {
    public int longestCycle(int[] edges) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        boolean[] tracking = new boolean[edges.length];
        HashSet<Integer> set = new HashSet<Integer>();
        int ans=0;
        for(int i=0; i<edges.length; i++){
            if(tracking[i]){
                continue;
            }
            set.add(i);
            map.put(i,0);
            tracking[i]= true;
        }
        return ans;
    }  
}

import java.util.*;

class Solution {
    public int minimumCardPickup(int[] cards) {
                int min = -1;
        for(int i = 0; i< cards.length; i++){
            for(int j = i+1; j< cards.length;j++){
                if(cards[i]==cards[j]){
                    if(min == -1){
                        min = j-i+1;
                        break;
                    }
                    else if(j-i+1<min){
                        min = j-i+1;
                        break;
                    }
                }
            }
        }
        return min;
    }
}
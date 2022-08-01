import java.util.ArrayList;

class Solution {
    public char repeatedCharacter(String s) {
        char ans = s.charAt(0);
     ArrayList<Character> chars=new ArrayList<Character>();     
        for(int i=0;i<s.length();i++){
            if(chars.contains(s.charAt(i))){
                ans = s.charAt(i);
                break;
            }
         chars.add(s.charAt(i));
        }
    return ans;
    }
}
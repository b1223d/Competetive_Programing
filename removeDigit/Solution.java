import java.util.*;
public class Solution {
    public static void main(String[] args) {
        String number = "1231"; char digit='1';
        ArrayList<String> sorter = new ArrayList<String>();
        for(int i = 0; i< number.length(); i++){
            if(number.charAt(i) == digit){
                sorter.add(number.substring(0,i) + number.substring(i+1, number.length()));
            }
        }
        Collections.sort(sorter);
        System.out.println(sorter.get(sorter.size() -1));

    }
    
}

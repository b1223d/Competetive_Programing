//https://open.kattis.com/problems/numbertree

import java.util.*;
public class numbertree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int num = 0;
        String[] splitStr = str.split(" ");        
        int highest = (int)(Math.pow(2, (Integer.parseInt(splitStr[0])+1))-1);




        if(splitStr.length == 1){
            num = highest;
        }
        else{
            char[] splitLet = splitStr[1].toCharArray();
            int sub =highest;
            for(int i = 0; i<splitLet.length; i++ ){
                if(splitLet[i] == 'L'){
                    sub = 2*sub - highest -1;
                }
                else{
                    sub = 2*sub - highest-2;
                }
            }
            num = sub;
        }
        System.out.println(num);
        
    }
}

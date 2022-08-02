package Yoda;

import java.util.ArrayList;
import java.util.Scanner;

public class yoda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> int1 = new ArrayList<Integer>();
        ArrayList<Integer> int2 = new ArrayList<Integer>();
        String ans1 = "";
        String ans2 = "";
        int number = scan.nextInt();
        while (number > 0){
            int digit = number %10;
            number/=10;
            int1.add(digit);
        }
        scan.nextLine();
        number= scan.nextInt();
        while (number > 0){
            int digit = number %10;
            number/=10;
            int2.add(digit);
        }
        System.out.println();
        for(int i=0; i<Math.min(int1.size(), int2.size()); i++){
            if(int1.get(i)>=int2.get(i)){
                ans1= int1.get(i) + ans1;
            }
            if(int2.get(i)>=int1.get(i)){
                ans2= int2.get(i) + ans2;
            }
        }
        if(int1.size()>int2.size()){
            for(int i = int2.size(); i<int1.size(); i++){
                ans1 = int1.get(i) + ans1;
            }
        }
        if(int2.size()>int1.size()){
            for(int i = int1.size(); i<int2.size(); i++){
                ans2 = int2.get(i) + ans2;
            }
        }
        //if(ans1 != "") System.out.println(ans1);
        if(ans1 == "") System.out.println("YODA");
        else if(Integer.parseInt(ans1) == 0) System.out.println("0");
        else System.out.println(ans1);

        //if(ans2 != "") System.out.println(ans2);
        //else if(Integer.parseInt(ans2) == 0) System.out.println("0");
        //else System.out.println("YODA");

        if(ans2 == "") System.out.println("YODA");
        else if(Integer.parseInt(ans2) == 0) System.out.println("0");
        else System.out.println(ans2);
        
        
        
    }
}

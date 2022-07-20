import java.util.*;
//https://open.kattis.com/problems/cprnummer
public class cprnummer{
    public static void main(String[] args) {   
        Scanner s = new Scanner(System.in);
        String cprIn = s.nextLine();
        cprIn = cprIn.replace("-", "");
        char[] cpr = cprIn.toCharArray();
        
        if((((Character.getNumericValue(cpr[0]))*4)+(Character.getNumericValue(cpr[1])*3)+(Character.getNumericValue(cpr[2])*2)+(Character.getNumericValue(cpr[3])*7)+(Character.getNumericValue(cpr[4])*6)+(Character.getNumericValue(cpr[5])*5)+(Character.getNumericValue(cpr[6])*4)+(Character.getNumericValue(cpr[7])*3)+(Character.getNumericValue(cpr[8])*2)+(Character.getNumericValue(cpr[9])*1))%11==0){
            System.out.println("1");
            
        }
        else{
            System.out.println("0");
            
        }
    }
}

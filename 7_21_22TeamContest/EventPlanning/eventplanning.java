import java.util.Scanner;

public class eventplanning {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      String[] s = str.split(" |\n");
      int people = Integer.parseInt(s[0]);
      int budget = Integer.parseInt(s[1]);
      int numHotels = Integer.parseInt(s[2]);
      int numWeeks = Integer.parseInt(s[3]);
      int best = Integer.MAX_VALUE;

      System.out.println("");
      
      for(int i = 0; i<numHotels; i++){
        int price = Integer.parseInt(scan.nextLine().trim());
        for(int j = 0; j<numWeeks; j++){
            int beds = scan.nextInt();
            if(beds>=people){
                best = Math.min(best, people*price);
            }
            if(j == numWeeks-1){
                scan.nextLine();
            }
        }
      }
      if(best > budget){
        System.out.println("stay home");
      }
      else{
        System.out.println(best);
        
      }

    }
}

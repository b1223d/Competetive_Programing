public class Main {
    public static void main(String[] args) {
        
    Solution s = new Solution();
    int[][] t1 = {{3,4,4,2},
                   {2,3,4,5}};
    int[][] t2 = {{1,2,3,4,5},
                   {1,2,3,4,5}};

    System.out.println(s.mostPoints(t1));
    System.out.println(s.mostPoints(t2));
    }
    
}

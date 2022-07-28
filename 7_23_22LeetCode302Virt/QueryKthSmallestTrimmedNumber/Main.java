package QueryKthSmallestTrimmedNumber;

public class Main {
    public static void main(String[] args) {
        String[] nums = {"24", "37", "96", "04"};
        int[][] queries = {{2,1} , {2,2}};

        Solution s = new Solution();

        int[] ans = s.smallestTrimmedNumbers(nums, queries);
        System.out.println(ans);
        
    }
}

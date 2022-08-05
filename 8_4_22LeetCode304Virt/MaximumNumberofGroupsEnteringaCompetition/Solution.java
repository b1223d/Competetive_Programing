package MaximumNumberofGroupsEnteringaCompetition;
class Solution {
    public int maximumGroups(int[] grades) {
        int ans = 0;
        int tot = 0;
        int i = grades.length;
        while (tot + ans + 1 <= i)
            tot += ++ans;
        return ans;
    }
}

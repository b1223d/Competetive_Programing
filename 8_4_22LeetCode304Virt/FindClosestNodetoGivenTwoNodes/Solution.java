package FindClosestNodetoGivenTwoNodes;

class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        boolean[] one = new boolean[edges.length];
        boolean[] two = new boolean[edges.length];
        one[node1] = true;
        two[node2] = true;
        while(true){
            if(one[node2] && two[node1]){
                return Math.min(node1,node2);
            }
            if(one[node2]){
                return node2;
            }
            if(two[node1]){
                return node1;
            }
            if(edges[node1] == -1 && edges[node2] == -1){
                return -1;
            }
            if(edges[node1]>=0){
                node1=edges[node1];
            }
            if(edges[node2]>=0){
                node2 = edges[node2]; 
            }
            if(one[node1] && two[node2]){
                return -1;
            }
            one[node1]=true;
            two[node2]=true;
        }
    }
}

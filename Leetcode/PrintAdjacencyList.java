import java.util.*;
public class PrintAdjacencyList {
    static class Solution {
        public List<List<Integer>> printGraph(int V, int edges[][]) {
            List<List<Integer>> adj = new ArrayList<>(); // create adjacency list
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            for (int[] e : edges) {
                int u = e[0];
                int v = e[1];
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            for (int i = 0; i < V; i++) {
                Collections.sort(adj.get(i));
            }

            return adj;
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int V = 5;
        int[][] edges = {
            {0,1}, {0,4}, {4,1}, {4,3}, {1,3}, {1,2}, {3,2}
        };

        List<List<Integer>> ans = sol.printGraph(V, edges);

        System.out.println(ans);
    }
}


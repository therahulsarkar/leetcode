class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new LinkedList();
        List<Integer> curr = new ArrayList<>();

        curr.add(0);
        dfs(graph, curr, res, 0, graph.length - 1);
        return res;
    }

    public void dfs(int[][] graph, List<Integer> curr, List<List<Integer>> res, int source, int dest) {
        if (source == dest) {
            res.add(new ArrayList(curr));
            return;
        }

        for (int adj : graph[source]) {
            curr.add(adj);
            dfs(graph, curr, res, adj, dest);
            curr.remove(curr.size() - 1);
        }
    }
}
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[rooms.size()];

        visited[0] = true;
        q.add(0);

        for(int adjNode: rooms.get(0)){
            visited[adjNode] = true;
            q.add(adjNode);
        }

        while(!q.isEmpty()){
            int currNode = q.poll();
            for(int adjNode : rooms.get(currNode)){
                if(!visited[adjNode]){
                    visited[adjNode] = true;
                    q.add(adjNode);
                }
            }
        }

        for(boolean vis : visited){
            if(vis == false) return false;
        }
        return true;
    }
}
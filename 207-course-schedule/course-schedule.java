class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //Convert IP to directed grapgh
        ArrayList<ArrayList<Integer>> graph = new  ArrayList<>();
        for(int i =0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<prerequisites.length; i++){
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        int[] indegree = new int[graph.size()];
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0; i<graph.size(); i++){
            for(int adjNode: graph.get(i)){
                indegree[adjNode]++;
            }
        }
        
        for(int i = 0; i<graph.size(); i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }
        
        while(!queue.isEmpty()){
            int curr_node = queue.peek();
            queue.remove();
            int i = 0;
            result.add(curr_node);
            
            for(int adjNode : graph.get(curr_node)){
                indegree[adjNode]--;
                if(indegree[adjNode] == 0){
                    queue.add(adjNode);
                }
            }
            
        }

        return result.size() == numCourses ? true : false;
    }
}
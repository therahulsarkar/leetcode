class LRUCache {

    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    int capacity;
    //To contain the nodes 
    HashMap<Integer, Node> map = new HashMap();
    

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        //If the node with that key exists in the map then get the node, and bring it to front as per the rule
        if(map.containsKey(key)){ 
            Node node = map.get(key); 
            removeNode(node);
            insertNode(node);
            return node.value;
        } else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        //If the node with that key already exists then just remove the node so that we can add it to the start later
        if(map.containsKey(key)){
            removeNode(map.get(key));
        }

        //If the node doesn't exist but out capacity is full then remove the last node
        if(map.size() == capacity){
            removeNode(tail.prev);
        }

        //Finally add the node 
        insertNode(new Node(key, value));
    }

    //Remove a node by connecting the previous and next node of that node 
    private void removeNode(Node node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    //Insert the node by adding it to map and inserting the node between head and first node 
    private void insertNode(Node node){
       map.put(node.key, node);
       node.next = head.next;
       node.next.prev = node;
       head.next = node;
       node.prev = head;
    }

    class Node{
        Node prev, next;
        int key, value;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
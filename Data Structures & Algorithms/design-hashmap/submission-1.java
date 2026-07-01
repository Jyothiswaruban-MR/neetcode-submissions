public class Node{
    int key;
    int value;
    public Node(int key, int value){
        this.key=key;
        this.value=value;
    }
}


class MyHashMap {
    private static final int size = 769;
    ArrayList<LinkedList<Node>>list = new ArrayList<>();
    public MyHashMap() {
       for(int i=0; i<size; i++){
        list.add(new LinkedList<>());
       }
    }
    
    public void put(int key, int value) {
        int index = key%size;
        LinkedList<Node> putList = list.get(index);
        for(Node node: putList){
            if(node.key==key){
                node.value=value;
                return;
            }
        }
        putList.add(new Node(key,value));
    }
    
    public int get(int key) {
        int index = key%size;
        LinkedList<Node> getList = list.get(index);
        for(Node node: getList){
            if(node.key==key){
                return node.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = key%size;
        LinkedList<Node> removeList = list.get(index);
        Iterator<Node> iterator = removeList.iterator();
        while(iterator.hasNext()){
            Node node = iterator.next();
            if(node.key==key){
                iterator.remove();
                return;
            }
        }

    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
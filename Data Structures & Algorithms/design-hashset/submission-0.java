class MyHashSet {
    private static final int SIZE = 10;
    ArrayList<LinkedList<Integer>>buckets = new ArrayList<>();
    public MyHashSet() {
        for(int i=0; i<SIZE; i++){
            buckets.add(new LinkedList<>());
        }
    }
    
    public void add(int key) {
        int index = key%SIZE;

        if(!buckets.get(index).contains(key)){
            buckets.get(index).add(key);
        }
    }
    
    public void remove(int key) {
        int index = key%SIZE;
        buckets.get(index).remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int index = key%SIZE;
        if(buckets.get(index).contains(key)){
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
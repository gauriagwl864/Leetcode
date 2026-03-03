class LRUCache {
    int capacity;
    LinkedHashMap<Integer,Integer>map;
    //ArrayList<Integer>list;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new LinkedHashMap<>(capacity,0.75f,true);
        //list=new ArrayList<>();
    }
    
    public int get(int key) {
        return map.getOrDefault(key,-1);
        // if(!map.containsKey(key)){
        //     return -1;
        // }
        // list.remove((Integer)key);
        // list.add(key);
        // return map.get(key);
    }
    
    public void put(int key, int value) {
        // if(map.containsKey(key)){
        //     list.remove((Integer)key);
        // }else if(map.size()==capacity){
        //     int oldKey=list.remove(0);
        //     map.remove(oldKey);
        // }
        map.put(key,value);
        if(map.size()>capacity){
            int lruKey=map.keySet().iterator().next();
            map.remove(lruKey);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
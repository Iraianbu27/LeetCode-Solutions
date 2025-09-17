class Node{
    int key;
    int val;
    Node next;
    Node prev;
    public Node(int key, int val)
    {
        this.key = key;
        this.val = val;
        next = null;
        prev = null;
    }
    public Node(int key,int val,Node next,Node prev)
    {
        this.key = key;
        this.val = val;
        this.next = next;
        this.prev = prev;
    }

}
class LRUCache {
    Map<Integer,Node> mpp;
    Node head;
    Node tail;
    int k;

    public LRUCache(int capacity) {
        k = capacity;
        mpp = new HashMap<>();
        head = new Node(-1,-1,null,null);
        tail = new Node(-1,-1,null,head);
        head.next = tail;
    }
    //Deletion of DLL
    public  void  deleteLL(Node current)
    {
        Node back = current.prev;
        Node front = current.next;
        back.next = front;
        front.prev = back;
    }
    //Insertion after head
    public  void insertAfterHead(Node current)
    {
        Node temp = head;
        current.next = temp.next;
        temp.next.prev = current;
        temp.next = current;
        current.prev = temp;
    }
    
    
    public int get(int key) {
        if(!mpp.containsKey(key)) return -1;
        Node curr = mpp.get(key);
        deleteLL(curr);
        insertAfterHead(curr);
        return curr.val;
    }
    
    public void put(int key, int value) {
        if(mpp.containsKey(key))
        {
            Node curr = mpp.get(key);
            curr.val = value;
            deleteLL(curr);
            insertAfterHead(curr);
        }
        else{
            if(mpp.size() == k)
            {
                Node tailCopy = tail;
                Node present = tailCopy.prev;
                mpp.remove(present.key); // made mistake instead of deleting present.key just deleted key
                deleteLL(present);
            }
                //add given key value as new node
                Node newHead = new Node(key,value,head.next,head);
                insertAfterHead(newHead);
                mpp.put(key,newHead);
        }
        
      
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
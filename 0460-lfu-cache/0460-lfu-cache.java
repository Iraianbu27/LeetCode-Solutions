class Node
{
    int key,val,freq;
    Node next,prev;
    public Node(int key,int val,int freq)
    {
        this.key = key;
        this.val = val;
        this.freq = freq;
        next = null;
        prev = null;
    }
}
class DLL{
    Node head,tail;
    int size;
    public DLL()
    {
        head = new Node(0,0,0);
        tail = new Node(0,0,0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    public void addToTail(Node present)
    {
        tail.prev.next = present;
        present.prev = tail.prev;
        present.next = tail;
        tail.prev = present;
        size++;
    }

    public void removeNode(Node present)
    {
        Node back = present.prev;
        Node front = present.next;
        back.next = front;
        front.prev = back;
        size--;
    }

    public Node deleteAfterHead()
    {
        if(size == 0) return null;
        Node present = head.next;
        // head.next = present.next;
        // present.next.prev = head;
        removeNode(present);
        return present;
    }
}
class LFUCache {
    Map<Integer,Node> mpp;
    Map<Integer,DLL> freqMpp;
    int k,size;
    int minFreq;
    public LFUCache(int capacity) {
        k = capacity;
        minFreq = 0;
        size  = 0;
        mpp = new HashMap<>();
        freqMpp = new HashMap<>();
    }
    
    public void update(Node present)
    {
        int freq = present.freq;
        freqMpp.get(freq).removeNode(present);
        if(freqMpp.get(freq).size == 0)
        {
            freqMpp.remove(freq);
            if(minFreq == freq) minFreq++;
            //need to update the min freq here in future
        }
        present.freq = present.freq + 1;
        freqMpp.putIfAbsent(present.freq,new DLL());
        freqMpp.get(present.freq).addToTail(present);
    }

    public int get(int key) {
        if(!mpp.containsKey(key)) return -1; 
        Node present = mpp.get(key);
        int presentValue = present.val; // need to return
        update(present);
        return presentValue;
    }
    
    public void put(int key, int value) {
        if(k == 0) return;
        if(mpp.containsKey(key))
        {
            Node present = mpp.get(key);
            present.val = value;
            update(present);
        }
        else{
            if(size == k)
            {
                Node node = freqMpp.get(minFreq).deleteAfterHead();
                mpp.remove(node.key);
                size--;
            }
            Node newHead = new Node(key,value,1);
            // addToTail(newHead);
            
            mpp.put(newHead.key,newHead);
            freqMpp.putIfAbsent(1,new DLL());
            freqMpp.get(1).addToTail(newHead);
            size++;
            minFreq = 1;


        }
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
import java.nio.Buffer;

import org.w3c.dom.Node;

public class HashTable<K, V> {
    
    private static final int DEFAULT_SIZE = 4;
    private static final double LOAD_FACTOR = 0.75;
    private int size;
    private Bucket<K, V>[] buckets;

    public HashTable() {this(DEFAULT_SIZE);}
    
    public HashTable (int _size) {
        if (_size <= DEFAULT_SIZE)
            buckets = new Bucket[DEFAULT_SIZE];
        else
            buckets = new Bucket[_size];
        size = 0;
    }
    
    private int calculateIndex(K key) {return key.hashCode();}

    public boolean add(K key, V value) {
        int index = calculateIndex(key);
        Bucket<K, V> bucket = buckets[index];
        if (bucket == null) {
            bucket = new Bucket<>();
            buckets[index] = bucket;
        }
        boolean added = bucket.add(key, value);
        if (added)
            size++;
        return added;
    }

    public boolean remove(K key){
        int index = calculateIndex(key);
        Bucket<K, V> bucket = buckets[index];
        if (bucket == null)
            return false;
        boolean removed = bucket.remove(key);
        if(removed)
            size--;
        return removed;
    }

    public void print() {
        for (var item : buckets) {
            
        }
    }

    private class Bucket<K, V> {
        
        Node root;

        public boolean add(Pair pair) {
            Node newNode = new Node(pair);
            if(root == null) {
                root = newNode;
                return true;
            }
            Node currNode = root;
            while(currNode != null) {
                if (currNode.pair.equals(pair))
                return false;
                if (currNode.next == null) {
                    currNode.next = newNode;
                    return true;
                }
                currNode = currNode.next;
            }
            return false;
        }
        public boolean add(K key, V value) {
            Pair pair = new Pair(key, value);
            return this.add(pair);
        }

        public boolean remove(K key) {
            if (root == null)
                return false;
            if(root.pair.key.equals(key)) {
                root = root.next;
                return true;
            }
            Node currNode = root;
            while(currNode.next != null) {
                if(currNode.next.pair.key.equals(key)){
                    currNode.next = currNode.next.next;
                    return true;
                }
                currNode = currNode.next;
            }
            return false;
        }

        public V getValue(K key) {
            Node currNode = root;
            while(currNode != null) {
                if(currNode.pair.key.equals(key))
                    return currNode.pair.value;
                currNode = currNode.next;
            }
            return null;
        }

        public boolean set(K key, V value) {
            Node currNode = root;
            while(currNode != null) {
                if(currNode.pair.key.equals(key)) {
                    currNode.pair.value = value;
                    return true;
                }
                currNode = currNode.next;
            }
            return false;
        }

        private class Node {
            Pair pair;
            Node next;

            public Node() {}
            public Node(Pair _pair) { this.pair = _pair; this.next = null;}
        }

        private class Pair {

            K key;
            V value;

            public Pair(){}

            public Pair(K _key, V _value){
                this.key = _key;
                this.value = _value;
            }
        }
    }
}

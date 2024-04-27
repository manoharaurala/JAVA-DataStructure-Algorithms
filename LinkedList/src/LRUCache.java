import java.util.*;
public class LRUCache {

    // Space Complexity: O(capacity), where capacity is the maximum size of the cache.
    // Time Complexity: O(1) for each get and set operation, as we are using a HashMap for constant time lookups.

    // Creating a class for the cache node.
    class ListNode {
        int key;
        int value;
        ListNode prev;
        ListNode next;

        // Constructor for the ListNode class.
        public ListNode(int key, int value) {
            this.key = key;
            this.value = value;
            prev = null;
            next = null;
        }
    }

    // Default head and tail nodes that won't affect the cache capacity.
    ListNode head = new ListNode(0, 0);
    ListNode tail = new ListNode(0, 0);

    // Default HashMap to store key-node pairs for quick lookups.
    HashMap<Integer, ListNode> cacheMap = new HashMap<>();

    // Default capacity for the cache.
    int capacity;

    // Constructor to create a cache object with the given capacity.
    public LRUCache(int capacity) {
        this.capacity = capacity;

        // Connecting head to tail node.
        head.next = tail;
        tail.prev = head;
    }

    // Method to get the value of a key from the cache.
    public int get(int key) {

        // Check if the key is present in the cache.
        if (cacheMap.containsKey(key)) {

            // Need to update the key-node to recently used.

            // Step 1: Get the key-node address and delete it.
            ListNode temp = cacheMap.get(key);
            remove(temp);

            // Step 2: Insert the key address again so it becomes the recently used node.
            insert(temp);

            // Return the value of the key.
            return temp.value;

        } else {
            // If the key is not present, return -1.
            return -1;
        }
    }

    // Method to insert a key and value into the cache.
    public void set(int key, int value) {

        // Check if the key is already present in the cache.
        if (cacheMap.containsKey(key)) {

            // Remove the existing node.
            ListNode temp = cacheMap.get(key);
            remove(temp);
        }

        // Check if the cache capacity is not full.
        if (cacheMap.size() == capacity) {

            // Remove the first node after the default head.
            remove(head.next);
        }

        // Create a new node.
        ListNode newNode = new ListNode(key, value);

        // Insert the new node into the cache.
        insert(newNode);
    }

    // Remove method.
    private void remove(ListNode node) {

        // First remove from the cache map.
        cacheMap.remove(node.key);

        // Get the previous and next nodes of the given node.
        ListNode tP = node.prev; // tP: previous node of the given node
        ListNode tN = node.next; // tN: next node of the given node

        // Connect tP to tN.
        tP.next = tN;
        tN.prev = tP;

        // Disconnect the node.
        node.next = null;
        node.prev = null;
    }

    // Insert method for making a node recently used in the cache.
    private void insert(ListNode node) {

        // Insert in the cache map.
        cacheMap.put(node.key, node);

        // Get the previous node of the tail.
        ListNode temp = tail.prev;

        // Connect the node to temp and tail.
        node.prev = temp;
        node.next = tail;

        // Connect temp to the node.
        temp.next = node;

        // Connect tail to the node.
        tail.prev = node;
    }
}
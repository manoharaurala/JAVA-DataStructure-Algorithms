package Cache;

import java.util.Arrays;

public class LRUCacheTest {

    public static void main(String[] args) {
        LRUCache lruCache=new LRUCache(2);

        lruCache.set(1,10);
        lruCache.set(5,12);

        System.out.println("get 5 = " + lruCache.get(5));
        System.out.println("get 1 = " + lruCache.get(1));
        System.out.println("get 10 = " + lruCache.get(10));

        lruCache.set(6,14);

        System.out.println("get 5 = " + lruCache.get(5));
    }
}

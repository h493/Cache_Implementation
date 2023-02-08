public class Main {
    public static void main(String[] args) {

        /*
        // Incorrect way
     EvictionPolicyFactory factory = new EvictionPolicyFactory();
     EvictionPolicy evictionPolicy  = factory.getEvictionPolicy("LRU");

     Cache cache = new Cache(evictionPolicy, new Storage(2));
    */

        Cache cache = new Cache(2,"LRU");
        cache.put("A","1");
        cache.put("B","2");


        cache.get("A");

    }
}
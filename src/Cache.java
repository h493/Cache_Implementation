public class Cache {
    private final EvictionPolicy evictionPolicy;
    private final Storage storage;

    public Cache(Integer capacity, String policy) {
        EvictionPolicyFactory factory = new EvictionPolicyFactory();
        EvictionPolicy evictionPolicy  = factory.getEvictionPolicy(policy);
        this.evictionPolicy = evictionPolicy;
        this.storage = new Storage(capacity);
    }

    public void put(String key, String value){
        if(storage.isStorageFull()){
            evictionPolicy.evictKey();
        }
        storage.add(key,value);
        evictionPolicy.keyAccessed(key);
    }

    public String get(String key){
        evictionPolicy.keyAccessed(key);
        return storage.get(key);
    }
}

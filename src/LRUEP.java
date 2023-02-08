
//LRU Eviction Policy
public class LRUEP extends EvictionPolicy {
    @Override
    void keyAccessed(String key) {
     if(map.containsKey(key)){
         DLL n = map.get(key);
         DLL.delete(n);
         DLL.add(n);
         return;
     }
     DLL newDLL = new DLL(key);
     map.put(key, newDLL);
     DLL.add(DLL);
    }

    @Override
    void evictKey() {
     DLL.delete(DLL.head.next);
    }
}

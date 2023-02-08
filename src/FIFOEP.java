public class FIFOEP extends EvictionPolicy{
    @Override
    void keyAccessed(String key) {
        if(map.containsKey(key)) return;
        DLL newDLL = new DLL(key);
        map.put(key, newDLL);
        DLL.add(DLL);
    }

    @Override
    void evictKey() {
        DLL.delete(DLL.head.next);
    }
}

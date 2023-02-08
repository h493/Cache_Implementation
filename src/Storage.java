import java.util.HashMap;
import java.util.Map;

public class Storage {

    Map<String, String> storage;
    //made it final as we don't want to change capacity later on
    private final int capacity;

    public Storage(int capacity) {
        storage = new HashMap<>();
        this.capacity = capacity;
    }

    public void add(String key, String value){
        if(storage.size() == capacity){
            System.out.println("Capacity is full");
        }
        storage.put(key, value);
        return;
    }

    public void remove(String key){
         if(storage.containsKey(key)) storage.remove(key);

    }

    public String get(String key){
        return storage.get(key);
    }

    public boolean isStorageFull(){
        return storage.size() == capacity;
    }
}

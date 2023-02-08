import java.util.HashMap;
import java.util.Map;

public abstract class EvictionPolicy {
    protected Map<String, DLL> map;
    protected DLL DLL;

    EvictionPolicy(){
        this.map = new HashMap<>();
        this.DLL = new DLL();
    }

    //store if not present else access
    abstract void keyAccessed(String key);

    // delete head to keep the size with capacity
    abstract void evictKey();

}

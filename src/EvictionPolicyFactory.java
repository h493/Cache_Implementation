public class EvictionPolicyFactory {

    public EvictionPolicy getEvictionPolicy(String policy){

        if(policy.equals("LRU")){
            return new LRUEP();
        } else if(policy.equals("FIFO")){
            return new FIFOEP();
        }
        return null;
    }
}

package Week2.Day7;

public class Maps {
    public static void main(String[] args) {
        /*
        ####################3 1.Map(I) ############
           -used to store key and value pair
           -if key is  duplicate coreesponding value is replaced
           -Hashing is the process of converting an object into an integer value

        $$$$$$$$$$$$$$$$$ i.HashMap $$$$$$$$$$$$
           -java.util
           -not syncronized
           -null but only once
           -inherits the AbstractMap class and implement the map interface
           -no order
           -default capacity is 16 and load factor is 0.75
           -HashMap()
           -HashMap(Map<? extends k,? extends V> m)
           -HashMap(int capacity)
           -HashMap(int capcity, float loadFactor)

            void clear();
            boolean isEmpty();
            Object clone(); //used to return shallow copy of the hashmap instance not its key and value
            Set entrySet();
            Set keySte();
            V put(Object key, Object value);
            void putAll(Map map);
            V putIfAbsent(k key,V value);
            boolean remove(Object key,Object value);
            replace(Object key,V value)
            get()

        -Calculating index=hashcode(key) && (n-1)


        _________________________ a. LinkedHashMap _________
        -Hashtable and linkedlist implementation
        -maintains insertion order
        -LinkedHashMap<Integer,String> hm=new LinkedHashMAp();



















         */
    }
}

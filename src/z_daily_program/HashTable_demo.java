package z_daily_program;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/*
Hashtable sync and thread safe
doesn't allow duplicate key and null values
HashTable is internally sync

*/
public class HashTable_demo {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(1,"arpit");
        hashtable.put(2,"test");
        hashtable.put(3,"ashutosh");

        Set<Integer> val = hashtable.keySet();
        System.out.println(val);

        for (Map.Entry val2 : hashtable.entrySet()){
            System.out.println(val2);
        }


    }
}

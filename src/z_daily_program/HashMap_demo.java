package z_daily_program;

import java.util.*;

public class HashMap_demo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"arpit");
        hashMap.put(2,"kunal");
        hashMap.put(3,"Ashutosh");


        for (Map.Entry val : hashMap.entrySet()){
            System.out.println(val);
        }

    }
}

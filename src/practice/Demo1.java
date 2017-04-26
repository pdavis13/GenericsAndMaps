package practice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author pdavis13
 */
public class Demo1 {
    public static void main(String[] args) {
        // HashMap, HashTable, TreeMap, LinkedHashMap
        Map myMap = new HashMap();
        myMap.put("small", new Integer(5));
        myMap.put("medium", new Integer(100));
        myMap.put("large", new Integer(10000));
        
        Integer i = (Integer)myMap.get("medium");
        System.out.println(i);
        
        int x = 0;
        int count = 0;
        while(x < 4999999){
            if(isPrime(x)){
                System.out.println(x);
                count++;
            }
            x++;
        }
        System.out.println(count);
    }
    
    public static boolean isPrime(int i){
        int x = 2;
        while(x < i){
            if(i%x == 0){
                return false;
            }
            x++;
        }
        return true;
    }
}

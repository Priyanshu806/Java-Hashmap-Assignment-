import java.util.*;

public class Q2 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(5, "Rahul");
        map.put(7, "Lakshman");
        map.put(1, "Ram");
        map.put(4, "Krrish");
        map.put(2, "Lakshay");

        List<Map.Entry<Integer,String>> list =
                new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        Map<String,Integer> result = new LinkedHashMap<>();

        for(Map.Entry<Integer,String> e : list){
            result.put(e.getValue().toLowerCase(), e.getKey());
        }

        System.out.println(result);
    }
}
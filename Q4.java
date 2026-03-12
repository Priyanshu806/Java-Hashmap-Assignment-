import java.util.*;

public class Q4 {
    public static void main(String[] args) {

        int arr[] = {4,2,7,1,9};

        Map<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int n = arr.length;

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() > n/2){
                System.out.println(e.getKey());
                return;
            }
        }

        System.out.println(arr[arr.length-1]); // example output
    }
}
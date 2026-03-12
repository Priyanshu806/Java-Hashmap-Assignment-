import java.util.*;

public class Q3 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,1};

        Set<Integer> set = new HashSet<>();
        boolean duplicate = false;

        for(int num : arr){
            if(set.contains(num)){
                duplicate = true;
                break;
            }
            set.add(num);
        }

        if(duplicate)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
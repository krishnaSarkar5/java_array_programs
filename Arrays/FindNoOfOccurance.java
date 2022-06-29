import java.util.HashSet;
import java.util.Set;

public class FindNoOfOccurance {
    public static void main(String[] args) {
        int []a = {1,1,1,2,2,2,2,4,4,4,4,4};

        Set<Integer> s = new HashSet<>();

        for(int i:a){
            s.add(i);
        }


        for(int i:s){
           int count=0;
            for(int j:a){
                if(i==j){
                    count++;
                }
            }
            System.out.println(i+" occurs "+count+" times.");
        }
    }
}

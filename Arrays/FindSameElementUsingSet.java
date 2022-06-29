import java.util.HashSet;
import java.util.Set;

public class FindSameElementUsingSet{
    public static void main(String[] args) {
        int []a ={1,23,90,2,3,2,2};
        Set<Integer> s = new HashSet<>();

        for(int i:a){
            if(s.add(i)==false)
                System.out.println(i);
        }
    }
}
import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateElement {

    public static void main(String[] args) {
        
        int []a={10,2,1,4,2,5,9};

        Set<Integer> s = new HashSet<>();

        for(int i:a){
            if(s.add(i)==false){
                System.out.println("The first duplicate element is: "+i);
                break;
            }
        }

    }
    
}

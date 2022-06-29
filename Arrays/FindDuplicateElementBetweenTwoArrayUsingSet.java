import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementBetweenTwoArrayUsingSet {
    public static void main(String[] args) {
        int []arr1 = {1,3,2,5,7,8,2,5};
        int []arr2 = {2,6,10,15,2,3};

        Set<Integer> s1 =  new HashSet<>();
        Set<Integer> s2 =  new HashSet<>();
        
        for(int i=0;i<Math.max(arr1.length, arr2.length);i++){
            if(i<arr1.length){
                s1.add(arr1[i]);
            }
            if(i<arr2.length){
                s2.add(arr2[i]);
            }
        }

        System.out.print("Duplicate Elemnts are: ");
        for(int a: s2){
           if( s1.add(a)==false){
               System.out.print(a+" ");
           }
        }


        
    }
}

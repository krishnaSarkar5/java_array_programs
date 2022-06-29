import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementBetwenTwoArrays {
    public static void main(String[] args) {
        int []arr1 = {1,3,2,5,7,8,2,5};
        int []arr2 = {2,6,10,15,2,3};

        Set<Integer> s = new HashSet<>();

        for(int i =0;i<arr1.length;i++){
            for(int j=0; j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    s.add(arr1[i]);
                    break;
                }
            }
        }



        System.out.print("The Duplicate element between two arrays are: ");
        for(int e: s){
            System.out.print(e+" ");
        }
    }
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSequenceInArray {
    public static void main(String[] args) {
        int []arr = {3,9,1,10,4,20,2,12,9,11,14,13,15};


        int longest_length=0;

        Set<Integer> hs = new HashSet<>();
        List<Integer> al =new ArrayList<>();
        List<Integer> al2 =new ArrayList<>();

        for(int m: arr){
            hs.add(m);
        }

        for(int i=0 ; i<arr.length;i++){
            if(!hs.contains(arr[i]-1)){
               int no=arr[i];


                while(hs.contains(no)){
                    al.add(no);
                    no++;
                    
                }

                if(longest_length<(no-arr[i])){
                    longest_length=no-arr[i];
                    al2.clear();
                    al2.addAll(al);
                    al.clear();
                }
                else
                    al.clear();

            }

           
           
        }

        System.out.println("Longest length is: "+longest_length);
            System.out.print("The elements are: ");
            for(int j : al2)
                System.out.print(j+" ");
    }
}

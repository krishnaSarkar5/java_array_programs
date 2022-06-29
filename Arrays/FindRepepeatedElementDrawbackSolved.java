import java.util.HashSet;
import java.util.Set;

public class FindRepepeatedElementDrawbackSolved {
    public static void main(String[] args) {
        int[] a={1,10,5,7,10,5,10};
        
        Set<Integer> list = new HashSet<>();

        for(int i=0;i<a.length-1;i++){
            for(int j= i+1;j<a.length;j++){
                if(a[i]==a[j] && i!=j){
                    list.add(a[i]);
                }
            }
        }


        System.out.println("The Repeted Elements are: "+list);




    }
}

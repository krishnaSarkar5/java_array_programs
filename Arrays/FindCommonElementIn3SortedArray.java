import java.util.ArrayList;
import java.util.List;


public class FindCommonElementIn3SortedArray {
    
    public static void main(String[] args) {
        
        int[] a1={2,4,6,8};
        int[] a2={2,3,4,7,9};
        int[] a3={2,4,7,11,13};
        int x=0,y=0,z=0;

        List<Integer> al = new ArrayList<>();

        while(x<a1.length && y<a2.length && z<a3.length){
            if( a1[x]==a2[y] && a2[y]==a3[z] ){
                al.add(a1[x]);
                x++;
                y++;
                z++;
             
            }
            else if(a1[x]<a2[y]){
                x++;
            }
            else if(a2[y]<a3[z]){
                y++;
            }
            else{
                z++;
            }
        }
        System.out.println("Common element between 3 array: ");
        for(int i: al){
            System.out.print(i+" ");
        }
    }
}

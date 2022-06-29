public class FindMissingNumber {
    public static void main(String[] args) {
        int []a={5,6,7,9,11,12};
        System.out.print("Missing numbers are: ");
        for(int i=0;i<a.length-1;i++){
            if(a[i]+1!=a[i+1])
                System.out.print((a[i]+1)+" ");
        }
    }
}

public class FindNonRepeatedElementXor {


    public static void main(String[] args) {
        int []a={2,4,2,5,1,1,5,6};
        int res = a[0];
        for(int i=1;i<a.length;i++){
            int t= res;
            res=res^a[i];
            System.out.printf("res = %d a[%d] = %d    xor result = %d\n",t,i,a[i],res);
     }
     System.out.println(res);
    
    }
    
}

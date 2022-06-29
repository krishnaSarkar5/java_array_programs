public class FindMaxAndMin {

    public static void main(String[] args) {
        
        int []a = {3,5,1,6,9,3,10};

        int max = a[0];
        int min = a[0];

        for(int i=1;i<a.length;i++){

            if(a[i]>max)
                max=a[i];

            if(a[i]<min)
                min = a[i];
        }

        System.out.println("Max number is: "+max );
        System.out.println("Min number is: "+min );
    }
    
}

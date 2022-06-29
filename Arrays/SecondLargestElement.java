

public class SecondLargestElement {
    
    public static void main(String[] args) {
        
        int [] a = {2,5,3,9,2,6,10,2};

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MAX_VALUE;


        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++){

            if(a[i]>largest){
                second_largest=largest;
                largest=a[i];
            }
            else if(a[i]>second_largest && a[i]!=largest){
                second_largest=a[i];
            }



            if(a[i]<smallest){
                second_smallest=smallest;
                smallest=a[i];
            }
            else if(a[i]<second_smallest && a[i]!=smallest){
                second_smallest=a[i];
            }






        }

        System.out.println("Second Largest element is: "+second_largest);
        System.out.println("Second smallest element is: "+second_smallest);
    }

}

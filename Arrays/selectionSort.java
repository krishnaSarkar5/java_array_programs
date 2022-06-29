

public class selectionSort {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size othe array: ");
        // int size = sc.nextInt();
        // int[] a = new int[size]; 
        // System.out.println("Enter the elements of the array:");
        // for(int i=0;i<size;i++){
        //     a[i] = sc.nextInt();
        // }


        int[] a = {38,52,9,18,6,62,13}; 

        int min, temp=0;
        for(int i=0;i<a.length;i++){
            min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }

            }

            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }

   
        System.out.println("Array After Sorting in accending manner: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        // sc.close();
    }
}

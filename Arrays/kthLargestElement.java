import java.util.Scanner;

public class kthLargestElement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of k: ");

        int k = sc.nextInt();

        int []a = {1,4,8,2,1,5,9,10};

        int temp;

        for(int i=0;i<a.length;i++){

            for(int j=i+1; j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i==k-1)
                break;
        }

        System.out.println(k+"th largest element is : "+a[k-1]);
        sc.close();
    }
    
}

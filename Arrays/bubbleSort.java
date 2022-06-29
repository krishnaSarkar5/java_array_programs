import java.util.Scanner;

public class bubbleSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size othe array: ");
        int size = sc.nextInt();
        int[] a = new int[size]; 
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }

        for(int i=0;i<a.length;i++){
            int flag=0;
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){   // if want to sort in decending manner a[j]<a[j+1]
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
            }
        if(flag==0)
            break;
        }

        System.out.println("Array After Sorting in accending manner: ");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }

        sc.close();
    }
}
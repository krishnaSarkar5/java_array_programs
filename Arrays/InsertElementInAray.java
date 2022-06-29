import java.util.Scanner;

public class InsertElementInAray {


   



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       

        int p,v,i;
        p= sc.nextInt();
        v= sc.nextInt();

        int []a={1,2,4,5,6};

        int []b =new int[a.length+1];
       for(i=0;i<a.length;i++){
           if(i<(p-1)){
                b[i]=a[i];
           }
           if(i==p-1){
               b[i]=v;
           }
           else{
              b[i]=a[i]; 
           }
       }

       for(int j:b)
       System.out.print(j+" ");
       sc.close();
    }

}

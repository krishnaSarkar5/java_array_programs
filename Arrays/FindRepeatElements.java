
public class FindRepeatElements {

    public static void main(String[] args) {
        
    int []a = {10,1,12,5,9,3,1,3};

        for(int i=0;i<a.length-1;i++){
            
            for(int j=i+1;j<a.length;j++){
                
                if(a[i]==a[j] && i!=j){
                    System.out.print(a[i]+" ");
                }

            }
            
        }


    }

}

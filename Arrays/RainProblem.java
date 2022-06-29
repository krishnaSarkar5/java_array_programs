public class RainProblem {
    public static void main(String[] args) {
        int[] arr ={3,0,2,0,4};
        int sum=0;
        for(int i=0;i<arr.length-2;i++){


            if(arr[i]>arr[i+2] && arr[i]!=0){
                sum=sum+arr[i+2];
            }
            else if(arr[i]<arr[i+2] && arr[i]!=0)
                sum=sum+arr[i];

            else if(arr[i]==arr[i+2] && arr[i]!=0)
                sum=sum+arr[i];
        
                
        }
        System.out.println("water stocked: "+sum);
    }
}

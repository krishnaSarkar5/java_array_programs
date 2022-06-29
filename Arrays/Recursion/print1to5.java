package Recursion;

public class print1to5 {
    
    static int i=1;


    public static void printNumbers(int n){
        if(i>n){
            return;
        }
        
        System.out.println(i);
        i++;
        printNumbers(n);
    }


    public static void main(String[] args) {
        int n=5;
        printNumbers(n);
    }
}

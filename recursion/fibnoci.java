package recursion;

public class fibnoci {
    public int fib(int n){
        if(n==0||n==1)
         return 1;
        return(fib(n-1)+fib(n-2));

        
    }
    public static void main(String[] args) {
        fibnoci aa=new fibnoci();
        for(int i=0;i<10;i++){
            System.out.print(aa.fib(i)+" ");
        }
    }
    
}

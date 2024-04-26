package recursion;

public class power {
    public int powerCalculate(int x,int  n){
        if(n==1)
         return x;
        return(x*powerCalculate(x,n-1));
        

    }
    public static void main(String[] args) {
        power pp=new power();
        System.out.println(pp.powerCalculate(5, 3));
    }
    
}

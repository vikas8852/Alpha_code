package recursion;
import java.math.BigInteger;
import java.util.*;

public class fact {
    public static BigInteger factorial(int n){
        BigInteger ans=new BigInteger("1");
        for(int i=2;i<=n;i++){
            ans=ans.multiply(BigInteger.valueOf(i));
            
        }
        return ans;
    }
    public static void main(String[] args) {
      
       //  BigInteger result=factorial(1000);
         System.out.println(factorial(100));
    }
    
}

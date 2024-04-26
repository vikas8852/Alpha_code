import java.util.*;
public class game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("THIS IS GAME OF GASSING NUMBER OF PROGRAM");
        int count=0;
        int flag=0;
        int ram=(int)(Math.random()*(100-1+1)+1);
        while(flag==0){
             System.out.print("Enter Your Number=:");
             int num=sc.nextInt();
            if(num==ram){
                count++;
                System.out.println("Succesful!");
                System.out.println("Your score is= "+ (100-count));
                flag=1;
            }
            if(num<ram){
                System.out.println("You Enter Smaller Number! Try Again--");
                count++;
            }
             if(num>ram){
                System.out.println("You Enter Greater Number! Try Again--");
                count++;
            }

            }
        }

    }
    


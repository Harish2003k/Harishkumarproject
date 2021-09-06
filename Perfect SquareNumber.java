import java.util.Scanner;
public class PerfectSquare{
    public static void main(String args[]){
        System.out.println("enter the number :");
        Scanner sc=new Scanner(System.in);
        double number=sc.nextDouble();
        int x = Math.sqrt(number);
        if(x==(int)x){
        System.out.println(number+"is a perfect square.");    
        }
        else
        {
            System.out.println(number+"is not a perfect square.");
        }
        
    }
    
    
}
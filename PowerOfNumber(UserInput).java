// how to Calculate power of given number By User input..
import java.util.Scanner;
public class Power{
    public static void main(String args[]){
    int n,p,result=1;
    System.out.println("Enter The Number : ");
    Scanner scanner=new Scanner(System.in);
    n=scanner.nextInt();
    System.out.println("Enter The Power of The Number: ");
    p=scanner.nextInt();
    for(int i=1;i<=p;i++){
        result=n*result;
    }
    System.out.println("THE RESULT OF THE NUMBER TO CALCULATE POWER IS :"+result);
    }
}
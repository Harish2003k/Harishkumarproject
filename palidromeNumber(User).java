import java.util.Scanner;
public class palidrome{
    public static void main(String args[]){
        int r,sum=0,temp;
        int n;
        System.out.println("Enter the number :");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        System.out.println("palidrome number");
        else
        System.out.println("not palidrome number");

    }
}
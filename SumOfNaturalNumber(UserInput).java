import java.util.Scanner;
public class SumOfNaturalNumber{
    public static void main(String args[]){
        int num,count,total=0;
        System.out.println("Enter the value of n:");
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();
        scanner.close();
        for(count=1;count<=num;count++){
            total=total+count;
        }
        System.out.println("sum of first 10 natural number is:"+total);
    }
}
import java.util.Scanner;;
public class SwappingTwoNumber{
    public static void main(String args[]){
        int x,y,t; // x and y are to swap.
        Scanner scanner=new Scanner(System.in);
        System.out.println("\n Enter the number x:");
        x=scanner.nextInt();
        System.out.println("\n Enter the number y:");
        y=scanner.nextInt();
        t=x;
        x=y;
        y=t;
        System.out.println("\n After swapping number:"+x+" "+y);
        System.out.println();
        
    }
}
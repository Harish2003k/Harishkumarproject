import java.util.Scanner;
public class StringSwitch{
    public static void main(String args[]){
        String str;
        System.out.println("Enter the String:");
        Scanner scanner=new Scanner(System.in);
        str=scanner.nextLine();
       switch(str){
           case "one":
               System.out.println("ONE");
               break;
               case "two":
                   System.out.println("TWO");
                   break;
                   case "three":
                       System.out.println("THREE");
                       break;
                       default:
                       System.out.println("YOU ENTER WRONG CHOICE:");
                       break;
       }
    }
}
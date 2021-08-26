import java.util.Scanner;
public class ASCIIbyUser{
    public static void main(String args[]){
        System.out.println("Enter a Character: ");
        Scanner scanner=new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        int asciiValue=ch;
        System.out.println("ASCII Value of"+ch+"is:"+asciiValue);
    }
}
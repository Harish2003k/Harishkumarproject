import java.util.Scanner;
public class SwitchStatment{
    public static void main(String args[]){
    int month;
    System.out.println("Enter The Months Number:");
    Scanner scanner =new Scanner(System.in);
    month=scanner.nextInt();
    switch(month){
        case 1:
            System.out.println("This is Month of Januarary.");
            break;
            case 2:
                System.out.println("This is The Month of Febrary.");
                break;
            case 3:
                System.out.println("This is The Month of March.");
                break;
                case 4:
                System.out.println("This is The Month of April.");
                break;
                case 5:
                System.out.println("This is The Month of May.");
                break;
                case 6:
                System.out.println("This is The Month of June.");
                break;
                case 7:
                System.out.println("This is The Month of July.");
                break;
                case 8:
                System.out.println("This is The Month of August.");
                break;
                case 9:
                System.out.println("This is The Month of September.");
                break;
                case 10:
                System.out.println("This is The Month of October.");
                break;
                case 11:
                System.out.println("This is The Month of November.");
                break;
                case 12:
                System.out.println("This is The Month of December.");
                break;
                default:
                System.out.println("YOU ENTER WRONG CHOICE:");
    }
    }
    
}
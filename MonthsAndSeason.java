import java.util.Scanner;
public class IFELSEIF{
    public static void main(String args[]){
        int month;
        String season;
        System.out.println("Enter the Months number");
        Scanner scanner=new Scanner(System.in);
        month=scanner.nextInt();
        if(month == 12 || month == 1 || month ==2) 
        season = "Winter";
        else if(month ==3 ||month ==4 ||month ==5)
        season = "Spring";
        else if(month==6 ||month ==7 ||month ==8)
        season = "Summer";
        else if(month==9 ||month ==10 ||month ==11)
        season ="Autumn";
        else
        season ="No season";
        System.out.println("Months of season is the "+season+ ".");
    }
}
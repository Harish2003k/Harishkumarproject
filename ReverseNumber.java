// Given Number to be reversed number like this 123 to 321.
public class ReverseNumber{
    public static void main(String args[]){
        int number=987654,reverse=0;
        while(number!=0){
            int remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        System.out.println("The reverse of given number is:"+reverse);
    } 
}


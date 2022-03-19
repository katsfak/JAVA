import java.util.Scanner;
/*
  The program asks the user for an integer number and converts it to a binary
*/
public class Converter {
    public static String toBinary(int x)
    {
      String binary="";
        while(x > 0) 
        {
          binary = (x%2)+binary;
          x /= 2;
        }
    return binary;
    }    
}


public class Program 
{
    public static void main(String[ ] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
    } 
}

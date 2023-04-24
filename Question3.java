import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Console.Write("Enter a integer to multiply by itself: ");
    double integer = Convert.ToDouble(Console.ReadLine());
    double result = integer * integer;
    Console.WriteLine("The result is " + result);
    
  }
}

import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
   Console.Write("Enter your weight in kilograms: ");
   double weight = Convert.ToDouble(Console.ReadLine());
   Console.Write("Enter your height in meters: ");
   double height = Convert.ToDouble(Console.ReadLine());
   double bmi = weight / (height * height);
   Console.WriteLine($"Your BMI is: {bmi:F2}");
  }
}

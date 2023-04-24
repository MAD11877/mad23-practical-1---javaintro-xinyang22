

public class Question4
{
  public static void main(String[] args)
  {
    Console.Write("Enter the base of the triangle: ");
int n = Convert.ToInt32(Console.ReadLine());
for (int i = n; i >= 1; i--)
{
    for (int j = 1; j <= i; j++)
    {
        Console.Write("*");
    }
    Console.WriteLine();
}
    
  }
}

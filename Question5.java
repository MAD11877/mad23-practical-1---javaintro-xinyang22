
public class Question5
{
  public static void main(String[] args)
  {
    
Console.Write("Enter the number of integers to enter: ");
int n1 = Convert.ToInt32(Console.ReadLine());



List<int> numbers = new List<int>();
for (int i = 0; i <n1; i++)
{
    Console.Write($"Enter integer {i + 1}: ");
    int num = Convert.ToInt32(Console.ReadLine());
    numbers.Add(num);
}




int mode = numbers.GroupBy(x => x)
                  .OrderByDescending(x => x.Count())
                  .Select(x => x.Key)
                  .FirstOrDefault();


Console.WriteLine($"The integer that occured the most is: {mode}");

    
  }
}

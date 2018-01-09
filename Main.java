import java.util.*;

public class Main{
  public static Scanner reader = new Scanner (System.in); 
  public static void main(String[] args)   
  {
	  int numberOfBullets=0;
	  System.out.println("This App is a gun simulator:");
	  System.out.print("Enter the number of bullets:");
	  numberOfBullets=reader.nextInt();
	  System.out.println("You asked for "+ numberOfBullets+" bullets"); 
	  System.out.println("Entering bullets to stack...");
	  Stack<Bullet> stack = new Stack<Bullet>();
	  for (int i=0 ; i<numberOfBullets ; i++)
	  {
		  System.out.println("Entering bullet "+(i+1));
		  Bullet bullet = new Bullet();
		  stack.Push(bullet);
	  }	
	  int numberOfShoots=0;
	  System.out.print("Enter the number of shoots:");
	  numberOfShoots=reader.nextInt();
	  for (int i=0 ; i<numberOfShoots ; i++)
	  {
		 shoot(stack);
	  }
  }
  public static void shoot(Stack<Bullet> s)
  {
	  if (s.IsEmpty())
	  {
		  System.out.println("There is no bullets");
	  }
	  else {
		  s.Pop();
		  System.out.println("Boom!");
	  }
  }
}

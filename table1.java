import java.util.Scanner;
public class table1{
	public static void main(String[] args)
	{
		System.out.print("\n\n\n\t\"Determine the Multiplication Table\"");
		Scanner input = new Scanner(System.in);
		int m,n ;

		
		System.out.print("\nEnter the starting number : ");
		m = input.nextInt();

		System.out.print("\nEnter the ending number : ");
		n = input.nextInt();


		


        for(int i = m; i <= n; i++)
        {
        	System.out.println("\nThe Multiplication Table of " + i + " is : " );
		    System.out.println();
            for(int j = 1; j <= 10; j++)
		    {
			
			     System.out.println(i + " X " + j + " = " + i * j);		

		    }

        }

		



		







	}

}
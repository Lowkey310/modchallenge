package modchallenge;

import java.util.Scanner;

public class moduluschallenge
	{

		public static void main(String[] args)
			{
				challenge();
				challenge2();

			}

		private static void challenge()
			{
					{
						System.out.println("Pick a year!");
						Scanner userInput = new Scanner(System.in);
						int yearuserpick = userInput.nextInt();
						if(yearuserpick % 100 == 0)
							{
								if(yearuserpick % 400 == 0)
									{
										System.out.println("You successfully picked a leap year! Congrats!");
									}
								else
									{
										System.out.println("Sorry. This is not a leap year.");
									}
							}
						else
							{
								if(yearuserpick % 4 == 0)
									{
										System.out.println("You successfully picked a leap year! Congrats!");
									}
								else
									{
										System.out.println("Sorry. This is not a leap year.");
									}
							}
					}
				
			}
		private static void challenge2()
			{
				for (int counting = 1; counting <= 100; counting ++)
					{
						
						if(counting % 3 == 0 && counting % 5 == 0)
							{
								System.out.println("FizzBuzz");
							}
						else if(counting % 3 == 0)
							{
								System.out.println("Fizz");
							}
						else if(counting % 5 == 0)
							{
								System.out.println("Buzz");
							}
						else
							{
								System.out.println(counting);
							}
							
					}
				
				
			}

	}

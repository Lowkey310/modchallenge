package modchallenge;

import java.util.Scanner;

public class moduluschallenge
	{

		public static void main(String[] args)
			{
				challenge();

			}

		private static void challenge()
			{
				while(true)
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

	}

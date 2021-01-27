//Evan White
import java.util.Scanner;
import java.io.*;
public class SplitMethodEW {

	public static void main(String[] args) throws IOException
	{
		 
		Scanner input = new Scanner(new File("studentsB.txt"));
		
		String name, firstName, lastName, id;
		String line;
		double GPA = 0;
		double accum = 0;
		double average = 0;
		int grade = 0;
		int counter = 0;
		
		input.nextLine();
		input.nextLine();
		
		while(input.hasNext())
		{
			line = input.nextLine();
			String[] s = line.split("\\s+");
			firstName = s[0];
			lastName = s[1];
			id = s[2];
			GPA = Double.parseDouble(s[3]);
			grade = Integer.parseInt(s[4]);
			
			System.out.println(lastName + ", " + firstName + " " + GPA);
			accum += GPA;
			counter++;
		}
		
		average = accum /counter;
		
		System.out.println();
		
		System.out.println("Average = " + String.format("%.2f", average));
	}

}
/*
 Coulter, Anne 4.0
Koh, Sara 3.9
Rister, Dianne 3.5
Brown, Charlie 3.7

Average = 3.78
 */

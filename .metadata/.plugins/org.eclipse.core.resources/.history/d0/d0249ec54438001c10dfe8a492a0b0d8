package numberClassOct28;
import java.io.*;
import java.util.Scanner;

public class numbersClassOct28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter reader = new FileWriter("numbers.txt");	
			Scanner scnr = new Scanner(System.in);
			
			while(scnr.hasNextInt()) {
				int data = reader.nextInt();
				System.out.println(data);
				
			}
		reader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
		
		
		
	}

}

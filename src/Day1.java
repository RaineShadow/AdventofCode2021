import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day1 {
	public static int readLine(int first, int last) {
		int inctotal = 0;
		
		try(BufferedReader br = new BufferedReader(new FileReader("src/Day1_input.txt"))){
			String line = br.readLine();
			while(line != null) {
				first = Integer.parseInt(line);
				//System.out.println("first: " + line);
				line = br.readLine();
				//System.out.println("second: " + line);
				if(line != null) {
					last = Integer.parseInt(line);
				}
				
				boolean inc = compareLines(first, last);
				if(inc == true) {
					inctotal++;
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return inctotal;
	}
	
	public static boolean compareLines(int first, int last) {
		boolean inc = false;
		
		if(last > first) {
			inc = true;
		}
		
		return inc;
	}
	
	public static void Day1Part1() {
		int numfirst = 0, numlast = 0, inctotal = 0;
		
		inctotal = readLine(numfirst, numlast);

		System.out.println(inctotal);
	}
	
	public static void Day1Part2() {
		int sumfirst = 0, sumlast = 0, inctotal = 0;
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("Day 1: Part 1");
		Day1Part1();
		
		System.out.println("Day 1: Part 2");
		Day1Part2();
	}
}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day1 {
	public static void main(String[] args) {
		int numfirst = 0, numlast = 0, inctotal = 0;
		
		//Read in each line of the txt file
		try(BufferedReader br = new BufferedReader(new FileReader("src/Day1_input.txt"))){
			String line = br.readLine();
			while(line != null) {
				//Convert text to int
				numfirst = Integer.parseInt(line);
				//System.out.println("first: " + line);
				line = br.readLine();
				//System.out.println("second: " + line);
				if(line != null) {
					numlast = Integer.parseInt(line);
				}
				
				//Figure out if second line int is greater than first line int
				if(numlast > numfirst) {
					//Add to number of times increased
					inctotal++;
				}
			}
			
			br.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		//Output number once reached end of file
		System.out.println(inctotal);
	}
}
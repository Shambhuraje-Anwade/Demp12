package pack;
import java.util.*;

public class Positive_or_Nigative {
	

	public static void main(String[] args) {
		
	int number;
	String result;
	
		Scanner c= new Scanner(System.in);
		System.out.println("Enter the number");
		number=c.nextInt();
		
		result= number>0 ? "positive":"negative";
		
		System.out.println(result);

	}

}

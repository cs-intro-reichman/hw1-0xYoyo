// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		double currentValue =Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		double years = Double.parseDouble(args[2]);
		for (int i = 0; i < years; i++) {
			currentValue = currentValue * (1 + rate/100);
		}
		System.out.println((int) currentValue);
	}	
}
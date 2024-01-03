/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		int inputNumber = Integer.parseInt(args[0]);
		String text = inputNumber
				+" is a perfect number since " + inputNumber + " = 1";
		int sum = 1;
		for(int i = 2; i<inputNumber-1 ; i++){
			if(inputNumber%i == 0 ){
				text += " + " + i;
				sum += i;
			}
		}
		if(sum == inputNumber){
			System.out.print(text);
		}
		else {
			System.out.print(inputNumber+" is not a perfect number");
		}
	}
}

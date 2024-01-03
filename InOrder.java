/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
import java.util.Random;
public class InOrder {
	public static void main (String[] args) {
		Random rand = new Random();
		int randomNumber = rand.nextInt(10);
		System.out.print(randomNumber + " ");
		int numberBefore = randomNumber;
		do {
			int newRandom = rand.nextInt(10);
			if(numberBefore <= newRandom){
				System.out.print(newRandom + " ");
				numberBefore=newRandom;
			}
			else{
				break;
			}
		}
		while (true);
	}
}
